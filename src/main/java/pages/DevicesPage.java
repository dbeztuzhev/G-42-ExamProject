package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class DevicesPage extends ParentPage {

    @FindBy(xpath = ".//a[@href='/Devices/Import']")
    private WebElement importButton;

    @FindBy(xpath = ".//tbody//tr[@class='odd']//td[1]//div[@class='custom-control custom-checkbox']")
    private WebElement deviceCheckbox;

    @FindBy(xpath = ".//button[@id='btnProfile']")
    private WebElement setProfile;

    @FindBy(xpath = ".//*[contains(text(),'Simple profile')]")
    private WebElement profileCheckbox;

    @FindBy(xpath = ".//input[@value='Set']")
    private WebElement setButton;

    public LeftMenu leftMenu;

    @FindBy(xpath = ".//div[@id='content']//div[@id='devices_wrapper']//div[@class='row'][2]//div[@class='col-sm-12']")
    private WebElement devicesTable;

    @FindBy(xpath = ".//div[@class='form-group has-search-right m-0']//input[@id='searchbox']")
    private WebElement searchBox;

    @FindBy(xpath = ".//form//div[@class='form-group'][3]//div[@class='custom-control custom-radio'][1]//label[@class='custom-control-label']")
    private WebElement defaultCheckBox;

    public DevicesPage(WebDriver webDriver) {
        super(webDriver, "/Devices");
    }

    @Step
    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(importButton);
    }

    @Step
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

    @Step
    public boolean checkPageOpened() {
        return actionsWithOurElements.isElementDisplayed(devicesTable);
    }

    @Step
    public void clickBack() {
        actionsWithOurElements.goBackInBrowser();
    }

    @Step
    public boolean checkInReserveDevicesOpened() {
        return actionsWithOurElements.isElementDisplayed(devicesTable);
    }

    @Step
    public void searchSpecifiedDevice(String deviceSerialNumber) {
        actionsWithOurElements.enterTextInInput(searchBox, deviceSerialNumber);
    }

    @Step
    public boolean isNewProfilePresent(String newDeviceProfile) {
        return actionsWithOurElements.isElementDisplayed(webDriver.findElement(By.xpath("//*[contains(text(),'" + newDeviceProfile + "')]")));
    }

    @Step
    public void setDefaultProfileOnDevice(String serialNumber) {
        searchSpecifiedDevice(serialNumber);
        clickOnDeviceCheckbox("check");
        clickOnSetProfileButton();
        clickOnProfileCheckboxDefault("check");
        clickOnSetButton();
    }

    @Step
    public void clickOnProfileCheckboxDefault(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(defaultCheckBox, expectedState);
    }
}
