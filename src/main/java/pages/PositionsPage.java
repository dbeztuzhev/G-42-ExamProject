package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class PositionsPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='d-flex']/div[@class='d-flex flex-column custom-main']/div[@class='custom-content p-4']/div[@id='positions_wrapper']/div[@class='row'][2]/div[@class='col-sm-12']/table[@id='positions']/tbody/tr[@class='odd'][2]/td[3]/div[@class='dropdown no-arrow']/a[@id='dropdownMenuLink']/img/@src")
    private WebElement dropdownMenuPosition;

    @FindBy(xpath = ".//tr[@class ='odd']//a[@data-title='Delete account']")
    private WebElement deleteMenuPosition;

    public LeftMenu leftMenu;

    public PositionsPage(WebDriver webDriver) {
        super(webDriver, "/Positions");
    }

    public void clickOnDropdownMenuPosition() {
        actionsWithOurElements.clickOnElement(dropdownMenuPosition);
    }

    public void clickOnDeleteMenuPosition() {
        actionsWithOurElements.clickOnElement(deleteMenuPosition);
    }

}
