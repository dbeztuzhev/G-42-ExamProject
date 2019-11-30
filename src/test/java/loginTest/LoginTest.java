package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends AbstractParentTest {

    @Test
    public void validLogin() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("Admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
    }

    @Test
    public void validLoginUppercase() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("ADMIN@HIDEEZ.COM", "admin");
        dashboardPage.checkCurrentUrl();
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
    }

    @Test
    public void validLoginLowercase() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
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
