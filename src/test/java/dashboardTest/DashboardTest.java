package dashboardTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class DashboardTest extends AbstractParentTest {
    @Test
    public void editProvidersDeal() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.checkIsDashboardPagePresent();
        dashboardPage.leftMenu.clickOnMenuEmployees();


    }
}