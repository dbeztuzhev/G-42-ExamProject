package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DashboardPage extends ParentPage {

    @FindBy(xpath = ".//li[@class='breadcrumb-item active']")
    private WebElement dashboardAvatar;

    @FindBy(xpath = "//a[@href='/Employees']")
    private WebElement linkEmployee;


    public DashboardPage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dashboardAvatar);
    }

    public void checkIsDashboardPagePresent() {
        Assert.assertTrue("DashboardPage is not displayed", isAvatarDisplayed());
    }

    public void clickOnLinkEmployee() {
        actionsWithOurElements.clickOnElement(linkEmployee);
    }


}
