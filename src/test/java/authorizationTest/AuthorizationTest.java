package authorizationTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class AuthorizationTest extends AbstractParentTest {

    @Test
    public void checkAuthorizationOnDashboard() {
        loginPage.openURL("http://192.168.10.203:80/");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnEmployees() {
        loginPage.openURL("http://192.168.10.203:80/Employees");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstations() {
        loginPage.openURL("http://192.168.10.203:80/Workstations");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnGroups() {
        loginPage.openURL("http://192.168.10.203:80/Groups");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSharedAccounts() {
        loginPage.openURL("http://192.168.10.203:80/SharedAccounts");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnTemplates() {
        loginPage.openURL("http://192.168.10.203:80/Templates");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnDevices() {
        loginPage.openURL("http://192.168.10.203:80/Devices");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstationEvents() {
        loginPage.openURL("http://192.168.10.203:80/Audit/WorkstationEvents");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstationSessions() {
        loginPage.openURL("http://192.168.10.203:80/Audit/WorkstationSessions");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstationSummaries() {
        loginPage.openURL("http://192.168.10.203:80/Audit/WorkstationSummaries");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnLogs() {
        loginPage.openURL("http://192.168.10.203:80/logs");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsAdministrators() {
        loginPage.openURL("http://192.168.10.203:80/Settings/Administrators");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsDataProtection() {
        loginPage.openURL("http://192.168.10.203:80/Settings/DataProtection");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsDeviceAccessProfiles() {
        loginPage.openURL("http://192.168.10.203:80/Settings/DeviceAccessProfiles");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }
    @Test
    public void checkAuthorizationOnSettingsOrgStructure() {
        loginPage.openURL("http://192.168.10.203:80/Settings/OrgStructure");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }
    @Test
    public void checkAuthorizationOnSettingsPositions() {
        loginPage.openURL("http://192.168.10.203:80/Settings/Positions");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }
    @Test
    public void checkAuthorizationOnSettingsLicenseOrders() {
        loginPage.openURL("http://192.168.10.203:80/Settings/LicenseOrders");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }
    @Test
    public void checkAuthorizationOnSettingsParameters() {
        loginPage.openURL("http://192.168.10.203:80/Settings/Parameters");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }
}
