package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class DevicesPage extends ParentPage {

    @FindBy(xpath = ".//a[@href='/Devices/Import']")
    private WebElement importButton;

    @FindBy(xpath = ".//tr[@class='odd']//div[@class='custom-control custom-checkbox']")
    private WebElement deviceCheckbox;

    @FindBy(xpath = ".//button[@id='btnProfile']")
    private WebElement setProfile;

    @FindBy(xpath = ".//*[@id='modalBody']/form/div[3]/div[2]/label")
    private WebElement profileCheckbox;

    @FindBy(xpath = ".//input[@value='Set']")
    private WebElement setButton;

    public LeftMenu leftMenu;

    public DevicesPage(WebDriver webDriver) {
        super(webDriver, "/Devices");
    }

    @Step
    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(importButton);
    }

    public void checkIsDevicesPagePresent() {
        Assert.assertTrue("Devices Page is not displayed", isAvatarDisplayed());
    }

    @Step
    public void clickOnDeviceCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(deviceCheckbox, expectedState);
    }

    @Step
    public void clickOnSetProfileButton() {
        actionsWithOurElements.clickOnElement(setProfile);
    }

    @Step
    public void clickOnProfileCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(profileCheckbox, expectedState);
    }

    @Step
    public void clickOnSetButton() {
        actionsWithOurElements.clickOnElement(setButton);
    }

    @Step
    public void checkIsSetProfilePresent() {
        Assert.assertTrue("Set Profile for device is not displayed", webDriver.getPageSource().contains("TestProfile"));
    }

    @Step
    public void checkIsSetDefaultProfilePresent() {
        Assert.assertTrue("Set Default Profile for device is not displayed", !webDriver.getPageSource().contains("TestProfile"));
    }
}

