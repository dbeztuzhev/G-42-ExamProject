package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class EmployeesPage extends ParentPage {

    @FindBy (xpath = ".//button[@data-title= 'Create employee']")
    private WebElement buttonCreate;

    public EmployeesPage (WebDriver webDriver){
        super(webDriver, "/Employees");
    }

    public void clickOnCreateButton() {actionsWithOurElements.clickOnElement(buttonCreate);

    }


}
