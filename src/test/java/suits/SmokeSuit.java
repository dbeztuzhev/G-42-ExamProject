package suits;

import employeesTest.EmployeesTest;
import loginTest.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginTest.class,
                EmployeesTest.class
        }
)

public class SmokeSuit {
}
