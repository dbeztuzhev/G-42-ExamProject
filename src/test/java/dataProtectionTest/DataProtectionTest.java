package dataProtectionTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;

public class DataProtectionTest extends AbstractParentTest {

    @Test
    public void dataProtectionTest() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        dashboardPage.leftMenu.clickOnMenuSettings();
        dashboardPage.leftMenu.clickOnSubMenuDataProtection();

        dataProtectionPage.checkCurrentUrl();

        dataProtectionPage.clickOnEnableDataProtectionButtonLink();

        dataProtectionPage.enterPasswordInToPasswordField("123007");
        dataProtectionPage.confirmPassword("123007");
        dataProtectionPage.clickOnEnableButtonLink();

        dataProtectionPage.checkCurrentUrl();

        dataProtectionPage.clickOnChangeEncryptionPasswordButtonLink();

        dataProtectionPage.enterCurrentOldPasswordInToPasswordField("123007");
        dataProtectionPage.enterNewPasswordInToPasswordField("123456");
        dataProtectionPage.confirmNewPassword("123456");
        dataProtectionPage.clickOnChangeButton();

        dataProtectionPage.checkCurrentUrl();

        dataProtectionPage.clickOnDisableDataProtectionButtonLink();

        dataProtectionPage.enterCurrentPasswordInToPasswordField("123456");
        dataProtectionPage.clickOnDisableButton();
        dataProtectionPage.checkIsEnableDataProtectionButtonLinkPresent();
    }
}
