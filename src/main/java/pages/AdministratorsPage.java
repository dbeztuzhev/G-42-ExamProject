package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AdministratorsPage extends ParentPage {

    @FindBy(xpath = ".//button[@data-title= 'Invite admin']")
    private WebElement inviteAdminButton;

    @FindBy(xpath = ".//input[@id= 'Input_Email']")
    private WebElement emailField;

    @FindBy(xpath = ".//input[@value= 'Invite']")
    private WebElement inviteButton;

    @FindBy(xpath = ".//div/div[2]//div//div[3]//div[2]/div//tr[1]/td[5]/div/a/img")
    private WebElement adminDropdownMenu;

    @FindBy(xpath = ".//div/div[2]/div/div[3]/div[2]/div//tr[1]/td[5]/div/div/a")
    private WebElement deleteItem;

    @FindBy (xpath = ".//input[@value='Delete']")
    private WebElement deleteButton;


    public AdministratorsPage(WebDriver webDriver) {
        super(webDriver, "/Administrators");
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(inviteAdminButton);
    }

    public void checkIsAdministratorsPagePresent() {
        Assert.assertTrue("Administrators Page is not displayed", isAvatarDisplayed());
    }

    @Step
    public void clickOnInviteAdminButton() {
        actionsWithOurElements.clickOnElement(inviteAdminButton);
    }

    @Step
    public void enterEmail(String email) {
        actionsWithOurElements.enterTextInInput(emailField, email);
    }

    @Step
    public void clickOnInviteButton() {
        actionsWithOurElements.clickOnElement(inviteButton);
    }

    @Step
    public void clickOnAdminDropdownMenu() {
        actionsWithOurElements.clickOnElement(adminDropdownMenu);
    }

    @Step
    public void clickOnDeleteItem() {
        actionsWithOurElements.clickOnElement(deleteItem);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }
    @Step
    public void checkIsDeletedAdminNotPresent() {
        Assert.assertTrue("Created Position is not displayed", !webDriver.getPageSource().contains("admhideeztest@gmail.com"));
    }
}
