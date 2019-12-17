package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class OrgStructurePage extends ParentPage {

    @FindBy(xpath = ".//*[@data-title = 'Create company']")
    private WebElement orgStructureAvatar;

    @FindBy(xpath = ".//tr[@class ='odd']//*[@id = 'dropdownMenuLink']")
    private WebElement dropdownMenuDepartment;

    @FindBy(xpath = ".//tr[@class ='odd']//*[@data-action = 'DeleteDepartment']")
    private WebElement deleteMenuDepartment;

    @FindBy(xpath = ".//input[@value='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//div[@class='row align-items-center m-1'][1]//a[@id='dropdownMenuLink']//img[@src='/svg/action/more.svg']")
    private WebElement dropdownMenuCompany;

    @FindBy(xpath = ".//div[@class='dropdown-menu dropdown-menu-left shadow show']//img[@src='/svg/action/delete.svg']")
    private WebElement deleteMenuCompany;


    public LeftMenu leftMenu;

    public OrgStructurePage(WebDriver webDriver) {
        super(webDriver, "/OrgStructure");
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(orgStructureAvatar);
    }

    public void checkIsOrgStructurePagePresent() {
        Assert.assertTrue("OrgStructurePage is not displayed", isAvatarDisplayed());
    }

    public void clickOnDropdownMenuDepartment() {
        actionsWithOurElements.clickOnElement(dropdownMenuDepartment);
    }

    public void clickOnDeleteMenuDepartment() {
        actionsWithOurElements.clickOnElement(deleteMenuDepartment);
    }

    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    public void clickOnDropdownMenuCompany() {
        actionsWithOurElements.clickOnElement(dropdownMenuCompany);
    }

    public void clickOnDeleteMenuCompany() {
        actionsWithOurElements.clickOnElement(deleteMenuCompany);
    }


    public void checkIsCompanyIsNotPresent() {
        Assert.assertTrue("Deleted Company is present", webDriver.getPageSource().contains("Hideez"));
    }

}