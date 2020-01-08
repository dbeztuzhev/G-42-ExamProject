package suits;

import deviceAccessProfilesTest.DeviceAccessProfilesTest;
import employeesTest.EmployeesTest;
import loginTest.LoginTest;
import loginTest.NegativeLoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import orgStructureTest.OrgStructureTest;
import positionsTest.PositionsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                NegativeLoginTest.class,
                EmployeesTest.class,
                OrgStructureTest.class,
                PositionsTest.class,
                DeviceAccessProfilesTest.class

        }
)
public class SmokeSuit {
}
