package dashboardTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class DashboardTest extends AbstractParentTest {
    @Test
    public void checkData() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.checkIsDashboardPagePresent();



    }
}