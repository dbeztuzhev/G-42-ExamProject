package suits;

import administratorsTest.AdministratorsTest;
import authorizationTest.AuthorizationTest;
import dashboardTest.DashboardTest;
import dataProtectionTest.DataProtectionTest;
import deviceAccessProfilesTest.DeviceAccessProfilesTest;
import eventsTest.EventsTest;
import groupsTest.GroupsTest;
import loginTest.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sessionsTest.SessionsTest;
import sharedAccountsTest.SharedAccountsTest;
import summariesTest.SummariesSortTest;
import templatesTest.TemplatesTest;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                AdministratorsTest.class,
                AuthorizationTest.class,
                DashboardTest.class,
                DataProtectionTest.class,
                EventsTest.class,
                GroupsTest.class,
                LoginTest.class,
                SessionsTest.class,
                SharedAccountsTest.class,
                SummariesSortTest.class,
                TemplatesTest.class,
                DeviceAccessProfilesTest.class
        }
)

public class RegressionSuite {

}
