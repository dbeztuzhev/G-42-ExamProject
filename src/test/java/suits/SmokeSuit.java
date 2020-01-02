package suits;

import employeesTest.EmployeesTest;
import loginTest.LoginTest;
import loginTest.NegativeLoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import orgStructureTest.OrgStructureTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                NegativeLoginTest.class,
                LoginTest.class,
                EmployeesTest.class,
                OrgStructureTest.class

        }
)
public class SmokeSuit {
}
