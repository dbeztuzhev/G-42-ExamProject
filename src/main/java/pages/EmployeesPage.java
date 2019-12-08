package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class EmployeesPage extends ParentPage {

    @FindBy(xpath = ".//button[@data-title= 'Create employee']")
    private WebElement buttonCreateEmployee;

    @FindBy(xpath = ".//input[@id='employee_first_name']")
    private WebElement enterFirstName;

    @FindBy(xpath = ".//input[@id='employee_last_name']")
    private WebElement enterLastName;

    @FindBy(xpath = ".//input[@name='Employee.Email']")
    private WebElement enterEmail;

    @FindBy(xpath = ".//input[@name='Employee.PhoneNumber']")
    private WebElement enterPhone;

    @FindBy(xpath = ".//button[@data-title='Create company']")
    private WebElement addCompany;

    @FindBy(xpath = ".//input[@id='Company_Name']")
    private WebElement enterNameCompany;

    @FindBy(xpath = ".//input[@type='submit' and @value = 'Create']")
    private WebElement buttonCreateOrgStructure;

    @FindBy(xpath = ".//button[@data-action='CreateDepartment']")
    private WebElement addDepartment;

    @FindBy(xpath = ".//input[@id='Department_Name']")
    private WebElement enterNameDepartment;

    @FindBy(xpath = ".//button[@data-title='Create position']")
    private WebElement addPosition;

    @FindBy(xpath = ".//input[@id='Position_Name']")
    private WebElement enterNamePosition;

    @FindBy(xpath = ".//button[@id='nextBtn']")
    private WebElement buttonNext;

    @FindBy(xpath = ".//*[@id='deviceId']")
    private WebElement deviceList;

    @FindBy(xpath = ".//*[@name='Wizard.DeviceId']//option[@value= 'ST10399999900004']")
    private WebElement addDeviceId;

    @FindBy(xpath = ".//*[@class='custom-control custom-switch']")
    private WebElement proximityCheckbox;

    @FindBy(xpath = ".//*[@id='workstationId']")
    private WebElement workstationList;

    @FindBy(xpath = ".//*[@id='workstationId']//option[@value='BEZTUZHEV-TESTW']")
    private WebElement selectWorkstation;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']")
    private WebElement accountTypeList;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']//option[@value='2']")
    private WebElement selectMicrosoftAccountType;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']//option[@value='1']")
    private WebElement selectDomainAccountType;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']//option[@value='0']")
    private WebElement selectLocalAccountType;

    @FindBy(xpath = ".//input[@id= 'login']")
    private WebElement enterAccountUserName;

    @FindBy(xpath = ".//input[@id= 'password']")
    private WebElement enterAccountUserPassword;

    @FindBy(xpath = ".//input[@id= 'confirmPassword']")
    private WebElement confirmAccountUserPassword;

    @FindBy(xpath = ".//div[@class='col']//*[@class='border rounded py-2 px-3']")
    private WebElement employeeBlock;


    public EmployeesPage(WebDriver webDriver) {
        super(webDriver, "/Employees");
    }

    public void clickOnCreateEmployeeButton() {
        actionsWithOurElements.clickOnElement(buttonCreateEmployee);

    }

    public void enterFirstNameInToInputField(String employeeFirstName) {
        actionsWithOurElements.enterTextInInput(enterFirstName, employeeFirstName);
    }

    public void enterLastNameInToInputField(String employeeLastName) {
        actionsWithOurElements.enterTextInInput(enterLastName, employeeLastName);
    }

    public void enterEmailInToInputField(String employeeEmail) {
        actionsWithOurElements.enterTextInInput(enterEmail, employeeEmail);
    }

    public void enterPhoneInToInputField(String employeePhone) {
        actionsWithOurElements.enterTextInInput(enterPhone, employeePhone);
    }

    public void clickOnAddCompanyButton() {
        actionsWithOurElements.clickOnElement(addCompany);

    }

    public void enterCompanyInToInputField(String nameCompany) {
        actionsWithOurElements.enterTextInInput(enterNameCompany, nameCompany);
    }

    public void clickOnCreateOrgStructureButton() {
        actionsWithOurElements.clickOnElement(buttonCreateOrgStructure);

    }

    public void clickOnAddDepartmentButton() {
        actionsWithOurElements.clickOnElement(addDepartment);

    }

    public void enterDepartmentInToInputField(String nameDepartment) {
        actionsWithOurElements.enterTextInInput(enterNameDepartment, nameDepartment);
    }

    public void clickOnAddPositionButton() {
        actionsWithOurElements.clickOnElement(addPosition);

    }

    public void enterPositionInToInputField(String namePosition) {
        actionsWithOurElements.enterTextInInput(enterNamePosition, namePosition);
    }

    public void clickOnNextButton() {
        actionsWithOurElements.clickOnElement(buttonNext);
    }

    public void clickOnDeviceList() {
        actionsWithOurElements.clickOnElement(deviceList);
    }

    public void clickOnDeviceId() {
        actionsWithOurElements.clickOnElement(addDeviceId);
    }

    public void proximityCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(proximityCheckbox, expectedState);
    }

    public void clickOnWorkstationList() {
        actionsWithOurElements.clickOnElement(workstationList);
    }

    public void clickOnWorkstation() {
        actionsWithOurElements.clickOnElement(selectWorkstation);
    }

    public void clickOnAccountTypeList() {
        actionsWithOurElements.clickOnElement(accountTypeList);
    }

    public void selectMicrosoftAccountType() {
        actionsWithOurElements.clickOnElement(selectMicrosoftAccountType);
    }

    public void enterAccountUserNameInToInputField(String userName) {
        actionsWithOurElements.enterTextInInput(enterAccountUserName, userName);
    }

    public void enterAccountUserPasswordInToInputField(String userPassword) {
        actionsWithOurElements.enterTextInInput(enterAccountUserPassword, userPassword);
    }

    public void confirmAccountUserPassword(String confirmPassword) {
        actionsWithOurElements.enterTextInInput(confirmAccountUserPassword, confirmPassword);
    }
    public void checkIsFullNamePresent() {
        Assert.assertTrue("Data is not displayed", webDriver.getPageSource().contains("Bob Brown"));
    }
    public void checkIsEmailPresent() {
        Assert.assertTrue("Data is not displayed", webDriver.getPageSource().contains("brown@gmail.com"));
    }
    public void checkIsWindowsAccountPresent() {
        Assert.assertTrue("Data is not displayed", webDriver.getPageSource().contains("TestUnlockAccount"));
    }
    public void checkIsDeviceIdPresent() {
        Assert.assertTrue("Data is not displayed", webDriver.getPageSource().contains("ST10399999900004"));
    }
    public void checkIsWorkstationIdPresent() {
        Assert.assertTrue("Data is not displayed", webDriver.getPageSource().contains("BEZTUZHEV-TESTW"));
    }
}
