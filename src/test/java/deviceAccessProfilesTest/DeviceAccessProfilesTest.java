package deviceAccessProfilesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;

public class DeviceAccessProfilesTest extends AbstractParentTest {

    @Test
    public void deviceAccessProfilesTest() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        dashboardPage.leftMenu.clickOnMenuSettings();
        dashboardPage.leftMenu.clickOnSubMenuDevAccessProfiles();
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

    }
}
