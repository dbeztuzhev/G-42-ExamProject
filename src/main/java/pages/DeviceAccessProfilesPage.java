
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

    @FindBy(xpath = ".//*[@id = 'DeviceAccessProfile_Name']")
    private WebElement profileName;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the device button confirmation for connecting the device to the computer for the first time.']")
    private WebElement buttonBondingCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the device button confirmation for connecting the device to the computer that is already bonded with the computer. ']")
    private WebElement buttonConnectionCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the device button confirmation when an application is getting access to the device’s storage.']")
    private WebElement buttonNewChannelCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the PIN-code for connecting the device to the computer for the first time.']")
    private WebElement pinBondingCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the PIN-code for connecting the device to the computer that is already bonded with the computer.']")
    private WebElement pinConnectionCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the PIN-code when an application is getting access to the device’s storage.']")
    private WebElement pinNewChannelCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Require the server confirmation for connecting the device to the computer that is already bonded with the computer.']")
    private WebElement serverConfirmConnectionCheckbox;

    @FindBy(xpath = ".//input[@value='Create']")
    private WebElement createButton;

    @FindBy(xpath = ".//tr[@class ='row-dblclick even']//div[@class='dropdown no-arrow']//img[@src='/svg/action/more.svg']")
    private WebElement dropdownMenu;

    @FindBy(xpath = ".//*[@id='deviceAccessProfiles']//tr[2]/td[6]/div/div/a[1]")
    private WebElement menuEdit;

    @FindBy(xpath = ".//input[@value='Save']")
    private WebElement saveButton;

    @FindBy(xpath = ".//*[@id='deviceAccessProfiles']//tr[2]/td[6]/div/div/a[2]")
    private WebElement menuDelete;

    @FindBy(xpath = ".//input[@value='Delete']")
    private WebElement deleteButton;

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

    @Step
    public void enterDeviceProfileName(String deviceProfileName) {
        actionsWithOurElements.enterTextInInput(profileName, deviceProfileName);
    }

    @Step
    public void clickOnButtonBondingCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(buttonBondingCheckbox, expectedState);
    }

    @Step
    public void clickOnButtonConnectionCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(buttonConnectionCheckbox, expectedState);
    }

    @Step
    public void clickOnButtonNewChannelCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(buttonNewChannelCheckbox, expectedState);
    }

    @Step
    public void clickOnPinBondingCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(pinBondingCheckbox, expectedState);
    }

    @Step
    public void clickOnPinConnectionCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(pinConnectionCheckbox, expectedState);
    }

    @Step
    public void clickOnPinNewChannelCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(pinNewChannelCheckbox, expectedState);
    }

    @Step
    public void clickOnServerConfirmConnectionCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(serverConfirmConnectionCheckbox, expectedState);
    }

    @Step
    public void clickOnCreateButton() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public void checkIsCreatedNamePresent() {
        Assert.assertTrue("Created DeviceProfile is not displayed", webDriver.getPageSource().contains("TestProfile"));
    }

    @Step
    public void clickOnDropdownMenu() {
        actionsWithOurElements.clickOnElement(dropdownMenu);
    }

    @Step
    public void clickOnMenuEdit() {
        actionsWithOurElements.clickOnElement(menuEdit);
    }

    @Step
    public void clickOnSaveButton() {
        actionsWithOurElements.clickOnElement(saveButton);
    }

    @Step
    public void clickOnMenuDelete() {
        actionsWithOurElements.clickOnElement(menuDelete);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }
}
