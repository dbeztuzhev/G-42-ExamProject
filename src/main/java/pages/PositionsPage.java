package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class PositionsPage extends ParentPage {

    @FindBy(xpath = ".//tr[@class='odd'][2]//a[@id='dropdownMenuLink']//img[@src='/svg/action/more.svg']")
    private WebElement dropdownMenuPosition;

    @FindBy(xpath = ".//tr[@class ='odd'][2]//a[@data-title='Delete position']")
    private WebElement deleteMenuPosition;

    @FindBy(xpath = ".//input[@value ='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//input[@id ='searchbox']")
    private WebElement enterSearchPosition;

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

    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    public void enterPositionInToSearchField(String searchPosition) {
        actionsWithOurElements.enterTextInInput(enterSearchPosition, searchPosition);    }

    public void checkIsPositionIsNotPresent() {
        Assert.assertTrue("Deleted Position is present", webDriver.getPageSource().contains("No matching records found"));
    }

}
