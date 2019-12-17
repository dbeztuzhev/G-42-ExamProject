package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;


public class DashboardPage extends ParentPage {

    @FindBy(xpath = ".//li[@class='breadcrumb-item active']")
    private WebElement dashboardAvatar;


    public LeftMenu leftMenu;

    public DashboardPage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dashboardAvatar);
    }

    public void checkIsDashboardPagePresent() {
        Assert.assertTrue("DashboardPage is not displayed", isAvatarDisplayed());
    }

}
