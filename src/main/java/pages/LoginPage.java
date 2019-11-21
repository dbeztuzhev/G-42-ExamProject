package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "Input_Email")
    private WebElement inputEmail;
    @FindBy(id = "Input_Password")
    private WebElement inputPassword;
    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement buttonLogIn;

    public void openPage() {
        try {
            webDriver.get("http://publicdemo.hideez.com/");
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    public void enterEmailInToInputLogin(String email) {
        actionsWithOurElements.enterTextInInput(inputEmail, email);
    }

    public void enterPassInToInputPassword(String password) {
        actionsWithOurElements.enterTextInInput(inputPassword, password);
    }

    public void clickOnButtonLogIn() {
        actionsWithOurElements.clickOnElement(buttonLogIn);
    }

    public boolean isPageLoaded() {
        return buttonLogIn.isDisplayed();
    }


    public void fillingLoginFormAndSubmitIt(String email, String pass) {
        openPage();
        enterEmailInToInputLogin(email);
        enterPassInToInputPassword(pass);
        clickOnButtonLogIn();
    }
}
}
