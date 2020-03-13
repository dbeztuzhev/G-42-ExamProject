package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class GroupsDetailsPage extends ParentPage {

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement addEmployeeButton;

    @FindBy(xpath = ".//div[@class='modal-content']//div[@class='modal-header']")
    private WebElement popUpWindow;

    public GroupsDetailsPage(WebDriver webDriver) {
        super(webDriver, "/Details");
    }


    @Step
    public void clickAddEmployeeButton() {
        actionsWithOurElements.clickOnElement(addEmployeeButton);
    }

    @Step
    public boolean ifPopUpWindowOpened() {
        return actionsWithOurElements.isElementDisplayed(popUpWindow);
    }
}
