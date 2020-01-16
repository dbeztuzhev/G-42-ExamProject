package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class DataProtectionPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='custom-content p-4']//a[@class='btn btn-link']//h6")
    public WebElement enableDataProtectionButtonLink;

    @FindBy(xpath = ".//input[@id='NewPassword_Password']")
    public WebElement enterPassword;

    @FindBy(xpath = ".//input[@id='NewPassword_ConfirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = ".//input[@value='Enable']")
    public WebElement enableButtonLink;

    @FindBy(xpath = ".//a[@class='btn btn-link'][2]//h6")
    public WebElement changeEncryptionPasswordButtonLink;

    @FindBy(xpath = ".//input[@id='ChangePassword_OldPassword']")
    public WebElement currentOldPasswordField;

    @FindBy(xpath = ".//input[@id='ChangePassword_NewPassword']")
    public WebElement newPasswordField;

    @FindBy(xpath = ".//input[@id='ChangePassword_ConfirmPassword']")
    public WebElement confirmNewPasswordField;

    @FindBy(xpath = ".//input[@value='Change']")
    public WebElement changeButton;

    @FindBy (xpath = ".//div//div[2]//div//a[1]//h6")
    public WebElement disableDataProtectionButtonLink;

    @FindBy(xpath = ".//input[@id='CurrentPassword_Password']")
    public WebElement currentPasswordField;

    @FindBy(xpath = ".//input[@value='Disable']")
    public WebElement disableButton;


    public LeftMenu leftMenu;


    public DataProtectionPage(WebDriver webDriver) {
        super(webDriver, "/Settings/DataProtection");
    }

    @Step
    public void clickOnEnableDataProtectionButtonLink() {
        actionsWithOurElements.clickOnElement(enableDataProtectionButtonLink);
    }

    @Step
    public void enterPasswordInToPasswordField(String passwordField) {
        actionsWithOurElements.enterTextInInput(enterPassword, passwordField);
    }

    @Step
    public void confirmPassword(String confirmField) {
        actionsWithOurElements.enterTextInInput(confirmPassword, confirmField);
    }

    @Step
    public void clickOnEnableButtonLink() {
        actionsWithOurElements.clickOnElement(enableButtonLink);
    }

    @Step
    public void clickOnChangeEncryptionPasswordButtonLink() {
        actionsWithOurElements.clickOnElement(changeEncryptionPasswordButtonLink);
    }

    @Step
    public void enterCurrentOldPasswordInToPasswordField(String currentOldPassword) {
        actionsWithOurElements.enterTextInInput(currentOldPasswordField, currentOldPassword);
    }

    @Step
    public void enterNewPasswordInToPasswordField(String newPassword) {
        actionsWithOurElements.enterTextInInput(newPasswordField, newPassword);
    }

    @Step
    public void confirmNewPassword(String confirmNewPassword) {
        actionsWithOurElements.enterTextInInput(confirmNewPasswordField, confirmNewPassword);
    }

    @Step
    public void clickOnChangeButton() {
        actionsWithOurElements.clickOnElement(changeButton);
    }

    public void clickOnDisableDataProtectionButtonLink() {
        actionsWithOurElements.clickOnElement(disableDataProtectionButtonLink);
    }

    @Step
    public void enterCurrentPasswordInToPasswordField(String currentPassword) {
        actionsWithOurElements.enterTextInInput(currentPasswordField, currentPassword);
    }

    @Step
    public void clickOnDisableButton() {
        actionsWithOurElements.clickOnElement(disableButton);
    }

    @Step
    public void checkIsEnableDataProtectionButtonLinkPresent() {
        Assert.assertTrue("Enable Data Protection Button Link is not displayed", webDriver.getPageSource().contains("Enable data protection"));
    }

    public void waitSomeTime(int timeInSeconds) {
        actionsWithOurElements.addSomeWait(timeInSeconds);
    }
}
