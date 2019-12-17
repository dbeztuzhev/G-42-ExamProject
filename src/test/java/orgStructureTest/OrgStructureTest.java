package orgStructureTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;

public class OrgStructureTest extends AbstractParentTest {


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
        dashboardPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.checkIsOrgStructurePagePresent();

        //Create Company

        //Edit Company

        //Delete Company

        //Create Department

        //Edit Department

        //Delete Department

        //Search

    }
}
