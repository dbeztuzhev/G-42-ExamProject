package suits;

import dataProtectionTest.DataProtectionTest;
import deviceAccessProfilesTest.DeviceAccessProfilesTest;
import employeesTest.EmployeesTest;
import loginTest.LoginTest;
import loginTest.NegativeLoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import orgStructureTest.OrgStructureTest;
import positionsTest.PositionsTest;
import sharedAccountsTest.SharedAccountsTest;
import templatesTest.TemplatesTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                NegativeLoginTest.class,
                LoginTest.class,
                EmployeesTest.class,
                OrgStructureTest.class,
                PositionsTest.class,
                DeviceAccessProfilesTest.class,
                SharedAccountsTest.class,
                DataProtectionTest.class,
                TemplatesTest.class

        }
)
public class SmokeSuite {
}
