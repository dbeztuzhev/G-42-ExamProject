package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class SharedAccountsPage extends ParentPage {

    @FindBy(xpath = ".//button[@data-action='CreateSharedAccount']")
    private WebElement createSharedAccountsButton;

    @FindBy(xpath = ".//input[@id ='SharedAccount_Name']")
    private WebElement nameSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='SharedAccount_Urls']")
    private WebElement urlsSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='SharedAccount_Login']")
    private WebElement loginSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='AccountPassword_Password']")
    private WebElement passwordSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='AccountPassword_ConfirmPassword']")
    private WebElement confirmPasswordSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='AccountPassword_OtpSecret']")
    private WebElement otpSharedAccountsField;

    @FindBy(xpath = ".//input[@value ='Create']")
    private WebElement createButton;


    public LeftMenu leftMenu;

    public SharedAccountsPage(WebDriver webDriver) {
        super(webDriver, "/SharedAccounts");
    }

    public boolean isButtonDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createSharedAccountsButton);
    }

    public void checkIsCreateSharedAccountsButtonPresent() {
        Assert.assertTrue("CreateSharedAccountsButton is not displayed", isButtonDisplayed());
    }
    public void clickOnCreateSharedAccountsButton() {
        actionsWithOurElements.clickOnElement(createSharedAccountsButton);
    }

    public void enterNameShAcc(String firstName) {
        actionsWithOurElements.enterTextInInput(nameSharedAccountsField, firstName);
    }

    public void enterUrlsShAcc(String urls) {
        actionsWithOurElements.enterTextInInput(urlsSharedAccountsField, urls);
    }

    public void enterLoginShAcc(String login) {
        actionsWithOurElements.enterTextInInput(loginSharedAccountsField, login);
    }

    public void enterPasswordShAcc(String password) {
        actionsWithOurElements.enterTextInInput(passwordSharedAccountsField, password);
    }

    public void confirmPasswordShAcc(String confirmPass) {
        actionsWithOurElements.enterTextInInput(confirmPasswordSharedAccountsField, confirmPass);
    }

    public void enterOTPShAcc(String otp) {
        actionsWithOurElements.enterTextInInput(otpSharedAccountsField, otp);
    }

    public void clickOnCreateButton() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    public void checkIsShAccPresent() {
        Assert.assertTrue("Added shared account is not added", webDriver.getPageSource().contains("hideeztest@ukr.net"));
    }

}