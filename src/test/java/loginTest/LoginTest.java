package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)

public class LoginTest extends AbstractParentTest {
    String login, pass;

    public LoginTest(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters(name = "Parameters are *{0} and {1}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                        {"Admin@hideez.com", "admin"},
                        {"ADMIN@HIDEEZ.COM", "admin"},  //LoginUppercase
                        {"admin@hideez.com", "admin"},  //LoginLowercase
                }

        );
    }


    @Test
    public void validTest() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.enterLoginInToInputLogin(login);
        loginPage.enterPassInToInputPassword(pass);
        dashboardPage.checkCurrentUrl();
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
    }

    // negative tests


    @Test
    public void emptyData() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("ButtonLogIn is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("", "");
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("The Email field is required.", loginPage.getErrorMessageTextEmail());
        Assert.assertEquals("The Password field is required.", loginPage.getErrorMessageTextPassword());
        Assert.assertEquals("The Email field is required.", loginPage.getErrorMessageTextOverFieldsEmail());
        Assert.assertEquals("The Password field is required.", loginPage.getErrorMessageTextOverFieldsPassword());

    }

    @Test
    public void emptyDataWithoutEnterData() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("ButtonLogIn is displayed", loginPage.isPageLoaded());
        loginPage.clickOnButtonLogIn();
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("The Email field is required.", loginPage.getErrorMessageTextEmail());
        Assert.assertEquals("The Password field is required.", loginPage.getErrorMessageTextPassword());
        Assert.assertEquals("The Email field is required.", loginPage.getErrorMessageTextOverFieldsEmail());
        Assert.assertEquals("The Password field is required.", loginPage.getErrorMessageTextOverFieldsPassword());

    }

    @Test
    public void invalidLoginValidPass() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("ButtonLogIn is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("11admin@hideez.com", "admin");
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        loginPage.checkCurrentUrl();
        Assert.assertEquals("Invalid login attempt.", loginPage.getErrorMessageTextInvalidLogin());
    }

    @Test
    public void invalidLoginInvalidPass() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("ButtonLogIn is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.ua", "000000");
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("Invalid login attempt.", loginPage.getErrorMessageTextInvalidLogin());
    }

    @Test
    public void validLoginInvalidPass() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("ButtonLogIn is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "a22222");
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("Invalid login attempt.", loginPage.getErrorMessageTextInvalidLogin());

    }

    @Test
    public void notValidLoginValidPass() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("ButtonLogIn is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("adminhideez.com", "admin");
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("The Email field is not a valid e-mail address.", loginPage.getErrorMessageTextNotValidLogin());
        Assert.assertEquals("The Email field is not a valid e-mail address.", loginPage.getErrorMessageTextOverFieldsNotValidLogin());
    }

}
