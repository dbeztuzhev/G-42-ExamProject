package deviceAccessProfilesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;

public class DeviceAccessProfilesTest extends AbstractParentTest {

    @Test
    public void orgStructureTest() {
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

    }
}
