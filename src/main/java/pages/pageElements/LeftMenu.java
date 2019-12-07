package pages.pageElements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;

@FindBy(xpath = ".//*[@class='navigation-menu__body']")

public class LeftMenu extends CommonActionWithElements {

    @FindBy(xpath = ".//img[@class='icon-dashboard i-sidebar']")
    private Link menuDashboard;

    @FindBy(xpath = ".//img[@class='icon-employees i-sidebar']")
    private Link menuEmployees;

    @FindBy(xpath = ".//img[@class='icon-computers i-sidebar']")
    private Link menuWorkstations;

    @FindBy(xpath = ".//img[@class='icon-shared-accounts i-sidebar']")
    private Link menuSharedAccounts;

    @FindBy(xpath = ".//img[@class='icon-templates i-sidebar']")
    private Link menuTemplates;

    @FindBy(xpath = ".//img[@class='icon-devices i-sidebar']")
    private Link menuDevices;

    @FindBy(xpath = ".//img[@class='icon-audit i-sidebar']")
    private Link menuAudit;

    @FindBy(xpath = ".//a[@href='/Audit/WorkstationEvents']")
    private Link subMenuEvents;

    @FindBy(xpath = ".//a[@href='/Audit/WorkstationSessions']")
    private Link subMenuSessions;

    @FindBy(xpath = ".//a[@href='/Audit/WorkstationSummaries']")
    private Link subMenuSummaries;

    @FindBy(xpath = ".//img[@class='icon-settings i-sidebar']")
    private Link menuSettings;

    @FindBy(xpath = ".//a[@href='/Settings/Administrators']")
    private Link subMenuAdminisrtators;

    @FindBy(xpath = ".//a[@href='/Settings/DeviceAccessProfiles']")
    private Link subMenuDevAccessProfiles;

    @FindBy(xpath = ".//a[@href='/Settings/OrgStructure']")
    private Link subMenuOrgStructure;

    @FindBy(xpath = ".//a[@href='/Settings/Positions']")
    private Link subMenuPositions;



    public void clickOnMenuDashboard() {
        actionsWithOurElements.clickOnElement(menuDashboard);
    }

    public void clickOnMenuEmployees() {
        actionsWithOurElements.clickOnElement(menuEmployees);
    }

    public void clickOnMenuWorkstations() {
        actionsWithOurElements.clickOnElement(menuWorkstations);
    }

    public void clickOnMenuSharedAccounts() {
        actionsWithOurElements.clickOnElement(menuSharedAccounts);
    }

    public void clickOnMenuTemplates() {
        actionsWithOurElements.clickOnElement(menuTemplates);
    }

    public void clickOnMenuDevices() {
        actionsWithOurElements.clickOnElement(menuDevices);
    }

    public void clickOnMenuAudit() {
        actionsWithOurElements.clickOnElement(menuAudit);
    }

    public void clickOnSubMenuEvents() {
        actionsWithOurElements.clickOnElement(subMenuEvents);
    }

    public void clickOnSubMenuSessions() {
        actionsWithOurElements.clickOnElement(subMenuSessions);
    }

    public void clickOnSubMenuSummaries() {
        actionsWithOurElements.clickOnElement(subMenuSummaries);
    }

    public void clickOnMenuSettings() {
        actionsWithOurElements.clickOnElement(menuSettings);
    }

    public void clickOnSubMenuAdminisrtators() {
        actionsWithOurElements.clickOnElement(subMenuAdminisrtators);
    }

    public void clickOnSubMenuDevAccessProfiles() {
        actionsWithOurElements.clickOnElement(subMenuDevAccessProfiles);
    }

    public void clickOnSubMenuOrgStructure() {
        actionsWithOurElements.clickOnElement(subMenuOrgStructure);
    }

    public void clickOnSubMenuPositions() {
        actionsWithOurElements.clickOnElement(subMenuPositions);
    }
}