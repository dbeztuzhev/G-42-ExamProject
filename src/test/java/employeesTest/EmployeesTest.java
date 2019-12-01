package employeesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class EmployeesTest extends AbstractParentTest {

@Test

    public  void addEmployee () {
    loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
    dashboardPage.checkCurrentUrl();
    dashboardPage.clickOnLinkEmployee();
    employeesPage.checkCurrentUrl();
    employeesPage.clickOnCreateButton();

}

}
