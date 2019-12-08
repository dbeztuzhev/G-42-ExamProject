package employeesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;

public class EmployeesTest extends AbstractParentTest {

    @Test

    public void addEmployee() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.leftMenu.clickOnMenuEmployees();
        employeesPage.checkCurrentUrl();
        employeesPage.clickOnCreateEmployeeButton();

        //Profile
        employeesPage.enterFirstNameInToInputField("Bob");
        employeesPage.enterLastNameInToInputField("Brown");
        employeesPage.enterEmailInToInputField("brown@gmail.com");
        employeesPage.enterPhoneInToInputField("+38-095-520-69-96");
        employeesPage.clickOnAddCompanyButton();
        employeesPage.enterCompanyInToInputField("Hideez");
        employeesPage.clickOnCreateOrgStructureButton();
        employeesPage.clickOnAddDepartmentButton();
        employeesPage.enterDepartmentInToInputField("PR");
        employeesPage.clickOnCreateOrgStructureButton();
        employeesPage.clickOnAddPositionButton();
        employeesPage.enterPositionInToInputField("PRManager");
        employeesPage.clickOnCreateOrgStructureButton();
        employeesPage.clickOnNextButton();

        //Device
        employeesPage.clickOnDeviceList();
        employeesPage.clickOnDeviceId();
        employeesPage.proximityCheckbox("check");
        employeesPage.clickOnWorkstationList();
        employeesPage.clickOnWorkstation();
        employeesPage.clickOnNextButton();

        //Windows Account
        employeesPage.clickOnAccountTypeList();
        employeesPage.selectMicrosoftAccountType();
        employeesPage.enterAccountUserNameInToInputField("TestUnlockAccount");
        employeesPage.enterAccountUserPasswordInToInputField("123007");
        employeesPage.confirmAccountUserPassword("123007");
        employeesPage.clickOnNextButton();

        //Overview
        employeesPage.checkIsFullNamePresent();
        employeesPage.checkIsEmailPresent();
        employeesPage.checkIsWindowsAccountPresent();
        employeesPage.checkIsDeviceIdPresent();
        employeesPage.checkIsWorkstationIdPresent();

        //
    }

}
