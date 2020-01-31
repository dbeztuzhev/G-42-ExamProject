package deviceAccessProfilesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeviceAccessProfilesTest extends AbstractParentTest {


    @Before
    public void preconditions() {

        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
    }

    @Test
    public void deviceAccessProfilesTest() {

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
        employeesPage.checkIsWindowsAccountPresent();
        employeesPage.checkIsDeviceIdPresent();
        employeesPage.checkIsWorkstationIdPresent();
        employeesPage.clickOnNextButton();


        employeesPage.leftMenu.clickOnMenuSettings();
        employeesPage.leftMenu.clickOnSubMenuDevAccessProfiles();
        deviceAccessProfilesPage.checkIsDeviceAccessProfilesPagePresent();

        //create Profile
        deviceAccessProfilesPage.clickOnCreateProfilesButton();
        deviceAccessProfilesPage.enterDeviceProfileName("TestProfile");
        deviceAccessProfilesPage.clickOnButtonBondingCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonNewChannelCheckbox("check");
        deviceAccessProfilesPage.clickOnPinBondingCheckbox("check");
        deviceAccessProfilesPage.clickOnPinConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnPinNewChannelCheckbox("check");
        deviceAccessProfilesPage.clickOnServerConfirmConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnCreateButton();
        deviceAccessProfilesPage.checkIsCreatedNamePresent();

        //edit Profile
        deviceAccessProfilesPage.clickOnDropdownMenu();
        deviceAccessProfilesPage.clickOnMenuEdit();
        deviceAccessProfilesPage.clickOnButtonBondingCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonNewChannelCheckbox("check");
        deviceAccessProfilesPage.clickOnPinBondingCheckbox("check");
        deviceAccessProfilesPage.clickOnPinConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnPinNewChannelCheckbox("check");
        deviceAccessProfilesPage.clickOnServerConfirmConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnSaveButton();

        //Set Profile
        deviceAccessProfilesPage.leftMenu.clickOnMenuDevices();
        devicesPage.checkIsDevicesPagePresent();
        devicesPage.clickOnDeviceCheckbox("check");
        devicesPage.clickOnSetProfileButton();
        devicesPage.clickOnProfileCheckbox("check");
        devicesPage.clickOnSetButton();
        devicesPage.checkIsSetProfilePresent();

        //Edit Profile on default
        devicesPage.clickOnDeviceCheckbox("check");
        devicesPage.clickOnSetProfileButton();
        devicesPage.clickOnSetButton();
        devicesPage.checkIsSetDefaultProfilePresent();

        //Delete Profile
        devicesPage.leftMenu.clickOnMenuSettings();
        devicesPage.leftMenu.clickOnSubMenuDevAccessProfiles();
        deviceAccessProfilesPage.clickOnDropdownMenu();
        deviceAccessProfilesPage.clickOnMenuDelete();
        deviceAccessProfilesPage.clickOnDeleteButton();
        deviceAccessProfilesPage.leftMenu.clickOnMenuEmployees();

        //Delete Personal Account
        employeesPage.clickOnDropdownMenuEmployee();
        employeesPage.clickOnDetailsLink();
        employeesPage.clickOnDropdownMenuAccount();
        employeesPage.clickOnDeleteMenuAccount();
        employeesPage.clickOnDeleteButton();

        //Delete Device
        employeesPage.clickOnRemoveDeviceButton();
        employeesPage.clickOnDeleteButton();

        //Delete Employee
        employeesPage.leftMenu.clickOnMenuDashboard();
        employeesPage.leftMenu.clickOnMenuEmployees();
        employeesPage.clickOnDropdownMenuEmployee();
        employeesPage.clickOnDeleteEmployeeLink();
        employeesPage.clickOnDeleteButton();

        //Delete Department
        employeesPage.leftMenu.clickOnMenuSettings();
        employeesPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.clickOnDropdownMenuDepartment();
        orgStructurePage.clickOnDeleteMenuDepartment();
        orgStructurePage.clickOnDeleteButton();

        //Delete Company
        employeesPage.leftMenu.clickOnMenuSettings();
        employeesPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.clickOnDropdownMenuCompany();
        orgStructurePage.clickOnDeleteMenuCompany();
        orgStructurePage.clickOnDeleteButton();

        //Delete Position
        orgStructurePage.leftMenu.clickOnMenuSettings();
        orgStructurePage.leftMenu.clickOnSubMenuPositions();
        positionsPage.clickOnDropdownMenuPosition();
        positionsPage.clickOnDeleteMenuPosition();
        positionsPage.clickOnDeleteButton();

        positionsPage.enterPositionInToSearchField("PRManager");
        positionsPage.checkIsPositionIsNotPresent();
        positionsPage.leftMenu.clickOnMenuSettings();
        positionsPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.checkIsCompanyIsNotPresent();
    }
}
