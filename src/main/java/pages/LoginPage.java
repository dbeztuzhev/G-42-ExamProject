package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/Identity/Account/Login?ReturnUrl=%2F");
    }

    @FindBy(xpath = ".//input[@id='Input_Email']")
    private static WebElement inputLogin;

    @FindBy(xpath = ".//input[@id='Input_Password']")
    private static WebElement inputPassword;

    @FindBy(xpath = ".//button[@type='submit']")
    private static WebElement loginButton;

    @FindBy(xpath = ".//span[@id='Input_Email-error']")
    private WebElement errorMessageEmail;

    @FindBy(xpath = ".//span[@id='Input_Password-error']")
    private WebElement errorMessagePassword;

    @FindBy(xpath = ".//li[text()='The Email field is required.']")
    private WebElement errorMessageOverFieldsEmail;

    @FindBy(xpath = ".//li[text()='The Password field is required.']")
    private WebElement errorMessageOverFieldsPassword;

    @FindBy(xpath = ".//li[text()='Invalid login attempt.']")
    private WebElement errorMessageInvalidLogin;

    @FindBy(xpath = ".//span[@id='Input_Email-error']")
    private WebElement errorMessageNotValidLogin;

    @FindBy(xpath = ".//li[text()='The Email field is not a valid e-mail address.']")
    private WebElement errorMessageOverFieldsNotValidLogin;


    public void openPage() {
        try {
            webDriver.get("http://internaldemo.hideez.com");
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    public void enterLoginInToInputLogin(String login) {
        actionsWithOurElements.enterTextInInput(inputLogin, login);
    }

    public void enterPassInToInputPassword(String password) {
        actionsWithOurElements.enterTextInInput(inputPassword, password);
    }

    public void clickOnButtonLogIn() {
        actionsWithOurElements.clickOnElement(loginButton);
    }

    public boolean isPageLoaded() {
        return loginButton.isDisplayed();
    }

    public String getErrorMessageTextEmail() {
        return errorMessageEmail.getText();
    }

    public String getErrorMessageTextPassword() {
        return errorMessagePassword.getText();
    }

    public String getErrorMessageTextOverFieldsEmail() {
        return errorMessageOverFieldsEmail.getText();
    }

    public String getErrorMessageTextOverFieldsPassword() {
        return errorMessageOverFieldsPassword.getText();
    }

    public String getErrorMessageTextInvalidLogin() {
        return errorMessageInvalidLogin.getText();
    }

    public String getErrorMessageTextNotValidLogin() {
        return errorMessageNotValidLogin.getText();
    }

    public String getErrorMessageTextOverFieldsNotValidLogin() {
        return errorMessageNotValidLogin.getText();
    }

    public void fillingLoginFormAndSubmitIt(String login, String pass) {
        openPage();
        enterLoginInToInputLogin(login);
        enterPassInToInputPassword(pass);
        clickOnButtonLogIn();
    }
}



