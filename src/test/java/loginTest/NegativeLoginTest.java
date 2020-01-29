package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NegativeLoginTest extends AbstractParentTest {

    // negative tests


    @Before
    public void preconditions() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("ButtonLogIn is displayed", loginPage.isPageLoaded());
    }


    @Test
    public void emptyData() {
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
        loginPage.fillingLoginFormAndSubmitIt("11admin@hideez.com", "admin");
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        loginPage.checkCurrentUrl();
        Assert.assertEquals("Invalid login attempt.", loginPage.getErrorMessageTextInvalidLogin());
    }

    @Test
    public void invalidLoginInvalidPass() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.ua", "000000");
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("Invalid login attempt.", loginPage.getErrorMessageTextInvalidLogin());
    }

    @Test
    public void validLoginInvalidPass() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "a22222");
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("Invalid login attempt.", loginPage.getErrorMessageTextInvalidLogin());

    }

    @Test
    public void notValidLoginValidPass() {
        loginPage.fillingLoginFormAndSubmitIt("adminhideez.com", "admin");
        loginPage.checkCurrentUrl();
        Assert.assertEquals(loginPage.getTitle(), "Log in - HES");
        Assert.assertEquals("The Email field is not a valid e-mail address.", loginPage.getErrorMessageTextNotValidLogin());
        Assert.assertEquals("The Email field is not a valid e-mail address.", loginPage.getErrorMessageTextOverFieldsNotValidLogin());
    }

}