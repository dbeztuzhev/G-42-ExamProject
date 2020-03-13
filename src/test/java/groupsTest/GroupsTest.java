package groupsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class GroupsTest extends AbstractParentTest {


    @Before
    public void preconditions() {
        loginPage.fillingLoginFormAndSubmitIt("aa.hideez@gmail.com", "12345678");
        dashboardPage.checkCurrentUrl();
        dashboardPage.leftMenu.clickOnMenuGroups();
        groupsPage.checkCurrentUrl();
    }

    @Test
    public void C5431() {
        groupsPage.clickAddFromADButton();
        checkExpectedResult("Can't open pop-up window", groupsPage.isWindowOpened());
        groupsPage.clickOnCancelButton();
    }

    @Test
    public void C5432() {
        groupsPage.clickAddFromADButton();
        groupsPage.clickConnectButton();
        checkExpectedResult("Can connect with empty rows", groupsPage.ifNotificationDisplayed());
    }

    @Test
    public void C5433() {
        groupsPage.clickAddFromADButton();
        groupsPage.enterLogin();
        groupsPage.enterPassword();
        groupsPage.clickConnectButton();
        checkExpectedResult("Can't load list of groups", groupsPage.isListLoaded());
    }

    @Test
    public void C5435() {
        groupsPage.clickAddFromADButton();
        groupsPage.enterLogin();
        groupsPage.enterPassword();
        groupsPage.clickConnectButton();
        groupsPage.checkFirstItem();
        groupsPage.uncheckFirstItem();
        groupsPage.clickAddButton();
        checkExpectedResult("Can't uncheck item", groupsPage.ifElementUnchecked());
    }

    @Test
    public void C5400() {
        groupsPage.clickCreateGroupButton();
        groupsPage.clickCancelButton();
        checkExpectedResult("Can't close window", groupsPage.ifCreateGroupWindowClosed());
    }

    @Test
    public void C5440() {
        groupsPage.searchInTableGroup("Certificate Service DCOM Access");
        groupsPage.clickOnFirstGroup();
        groupsPage.clickDeleteGroupButton();
        groupsPage.clickDeleteButton();
        groupsPage.clickAddFromADButton();
        groupsPage.enterLogin();
        groupsPage.enterPassword();
        groupsPage.clickConnectButton();
        groupsPage.searchDeletedGroup("Certificate Service DCOM Access");
        groupsPage.checkFirstItemAfterSearch();
        groupsPage.clickAddButton();
        groupsPage.searchInTableGroup("Certificate Service DCOM Access");
        checkExpectedResult("Can't add deleted group", groupsPage.ifNewGroupExist());
    }

    @Test
    public void C5405() {
        groupsPage.clickCreateGroupButton();
        groupsPage.enterGroupName("agroup name");
        groupsPage.enterGroupEmail("agroup@email.com");
        groupsPage.enterGroupDescription("auto test group");
        groupsPage.clickCancelButton();
        checkExpectedResult("Can't close window with filled rows", groupsPage.ifCreateGroupWindowClosed());
    }

    @Test
    public void C5456() {
        groupsPage.clickCreateGroupButton();
        groupsPage.enterGroupName("Certificate Service DCOM Access");
        groupsPage.clickCreateButton();
        checkExpectedResult("Group with the same AD name could be created", groupsPage.ifWarningMessageAppeared());
    }

    @Test
    public void C5403() {
        groupsPage.clickCreateGroupButton();
        groupsPage.enterGroupName("agroup name");
        groupsPage.enterGroupEmail("agroup@email.com");
        groupsPage.enterGroupDescription("auto test group");
        groupsPage.clickCreateButton();
        groupsPage.searchInTableGroup("agroup name");
        checkExpectedResult("Can't find created group", groupsPage.ifNewGroupExist());
        checkExpectedResult("Can't read group name", groupsPage.ifGroupNameDisplayed("agroup name"));
        checkExpectedResult("Can't read group email", groupsPage.ifGroupEmailDisplayed("agroup@email.com"));
        checkExpectedResult("Can't read group description", groupsPage.ifGroupDescriptionDisplayed("auto test group"));
        groupsPage.clickOnFirstGroup();
        groupsPage.clickDeleteGroupButton();
        groupsPage.clickDeleteButton();
    }
    @Test
    public void C5404() {
        groupsPage.clickCreateGroupButton();
        groupsPage.clickCreateButton();
        checkExpectedResult("Can create group with empty name", groupsPage.ifWarningMessageAppeared());
    }

    @Test
    public void C5439() {
        groupsPage.clickAddFromADButton();
        groupsPage.enterLogin();
        groupsPage.enterPassword();
        groupsPage.clickConnectButton();
        groupsPage.checkAllItems();
        groupsPage.clickAddButton();
        checkExpectedResult("Can't add all groups", groupsPage.ifWindowClosed());
    }

    @Test
    public void C5434() {
        groupsPage.clickAddFromADButton();
        groupsPage.enterLogin();
        groupsPage.enterPassword();
        groupsPage.clickConnectButton();
        groupsPage.searchDeletedGroup("Group for auto-tests");
        groupsPage.checkFirstItem();
        groupsPage.clickAddButton();
        groupsPage.searchInTableGroup("Group for auto-tests");
        checkExpectedResult("Employees were imported automatically", groupsPage.checkIfNumberOfEmployeesIsNull());

        groupsPage.clickAddFromADButton();
        groupsPage.enterLogin();
        groupsPage.enterPassword();
        groupsPage.clickConnectButton();
        groupsPage.searchDeletedGroup("Group for auto-tests");
        groupsPage.checkFirstItem();
        groupsPage.checkCreateEmployees();
        groupsPage.clickAddButton();
        groupsPage.searchInTableGroup("Group for auto-tests");
        checkExpectedResult("Employees were imported automatically", groupsPage.checkIfNumberOfEmployeesIsNotNull());
    }

    @Test
    public void C5406() {
        groupsPage.searchInTableGroup("Group for auto-tests");
        groupsPage.clickOnFirstGroup();
        groupsPage.clickOnEyeButton();
        groupsDetailsPage.clickAddEmployeeButton();
        checkExpectedResult("Can't open pop-up with employees", groupsDetailsPage.ifPopUpWindowOpened());
    }
}
