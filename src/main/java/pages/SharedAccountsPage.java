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

    @FindBy(xpath = ".//img[@src ='/svg/action/more.svg']")
    private WebElement dropdownMenu;

    @FindBy(xpath = ".//a[@data-action='EditSharedAccount']")
    private WebElement editShAccLink;

    @FindBy(xpath = ".//input[@value='Save']")
    private WebElement saveButton;

    @FindBy(xpath = ".//a[@data-action='EditSharedAccountPwd']")
    private WebElement editShAccPassLink;

    @FindBy(xpath = ".//a[@data-action='EditSharedAccountOtp']")
    private WebElement editShAccOtpLink;

    @FindBy(xpath = ".//a[@data-action='DeleteSharedAccount']")
    private WebElement deleteShAccLink;

    @FindBy(xpath = ".//input[@id ='searchbox']")
    private WebElement enterSearchShAcc;

    @FindBy(xpath = ".//input[@value='Delete']")
    private WebElement deleteShAccButton;


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

    public void clickOnDropdownMenu() { actionsWithOurElements.clickOnElement(dropdownMenu);
    }

    public void clickOnEditShAccLink() { actionsWithOurElements.clickOnElement(editShAccLink);
    }

    public void checkIsShAccNameWasEdited() {
        Assert.assertTrue("Edited shared account Name is present", webDriver.getPageSource().contains("my"));
    }

    public void checkIsShAccUrlWasEdited() {
        Assert.assertTrue("Edited shared account Url is present", webDriver.getPageSource().contains("gmail.com"));
    }

    public void checkIsShAccLoginWasEdited() {
        Assert.assertTrue("Edited shared account Login is present", webDriver.getPageSource().contains("hideeztest@gmail.com"));
    }

    public void clickOnSaveButton() { actionsWithOurElements.clickOnElement(saveButton);
    }


    public void clickOnEditPassLink() { actionsWithOurElements.clickOnElement(editShAccPassLink);
    }

    public void clickOnEditOtpLink() { actionsWithOurElements.clickOnElement(editShAccOtpLink);
    }

    public void clickOnDeleteShAccLink() { actionsWithOurElements.clickOnElement(deleteShAccLink);
    }

    public void clickOnDeleteButton() { actionsWithOurElements.clickOnElement(deleteShAccButton);
    }

    public void enterInSearhFieldShAccName(String nameSharedAccounts ) {
        actionsWithOurElements.enterTextInInput(enterSearchShAcc, nameSharedAccounts);
    }

    public void checkIsShAccNotPresent() {
        Assert.assertTrue("Deleted shared account is not present", webDriver.getPageSource().contains("No data available in table"));
    }
}