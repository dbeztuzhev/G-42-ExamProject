
package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class DeviceAccessProfilesPage extends ParentPage {

    @FindBy(xpath = ".//*[@data-title = 'Create profile']")
    private WebElement createProfilesButton;

    public LeftMenu leftMenu;

    public DeviceAccessProfilesPage(WebDriver webDriver) {
        super(webDriver, "/DeviceAccessProfiles");
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createProfilesButton);
    }

    public void checkIsDeviceAccessProfilesPagePresent() {
        Assert.assertTrue("DeviceAccessProfiles Page is not displayed", isAvatarDisplayed());
    }

    @Step
    public void clickOnCreateProfilesButton() {
        actionsWithOurElements.clickOnElement(createProfilesButton);
    }
}

