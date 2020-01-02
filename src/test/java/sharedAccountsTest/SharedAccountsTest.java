package sharedAccountsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;


public class SharedAccountsTest extends AbstractParentTest {
    @Test
    public void sharedAccountTest() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.checkIsDashboardPagePresent();
        dashboardPage.leftMenu.clickOnMenuSharedAccounts();
        sharedAccountsPage.checkCurrentUrl();
        sharedAccountsPage.checkIsCreateSharedAccountsButtonPresent();
        sharedAccountsPage.clickOnCreateSharedAccountsButton();
        sharedAccountsPage.enterNameShAcc("ukr.net");
        sharedAccountsPage.enterUrlsShAcc("https://www.ukr.net/");
        sharedAccountsPage.enterLoginShAcc("hideeztest@ukr.net");
        sharedAccountsPage.enterPasswordShAcc("hideeztest");
        sharedAccountsPage.confirmPasswordShAcc("hideeztest");
        sharedAccountsPage.enterOTPShAcc("KN726EWRNWGWGM7ZNPWYJI6MQYKEJFKP");
        sharedAccountsPage.clickOnCreateButton();
        sharedAccountsPage.checkIsShAccPresent();

        //Edit Shared Account
        sharedAccountsPage.clickOnDropdownMenu();
        sharedAccountsPage.clickOnEditShAccLink();
        sharedAccountsPage.enterNameShAcc("my");
        sharedAccountsPage.enterUrlsShAcc("gmail.com");
        sharedAccountsPage.enterLoginShAcc("hideeztest@gmail.com");
        sharedAccountsPage.clickOnSaveButton();
        sharedAccountsPage.checkIsShAccNameWasEdited();
        sharedAccountsPage.checkIsShAccUrlWasEdited();
        sharedAccountsPage.checkIsShAccLoginWasEdited();

        //Edit Password ShaAcc
        sharedAccountsPage.clickOnDropdownMenu();
        sharedAccountsPage.clickOnEditPassLink();
        sharedAccountsPage.enterPasswordShAcc("123456AA");
        sharedAccountsPage.confirmPasswordShAcc("123456AA");
        sharedAccountsPage.clickOnSaveButton();

        //Edit OTP ShAcc
        sharedAccountsPage.clickOnDropdownMenu();
        sharedAccountsPage.clickOnEditOtpLink();
        sharedAccountsPage.enterOTPShAcc("AA726EWRNWGWGM7ZNPWYJI6MQYKEJFAA");
        sharedAccountsPage.clickOnSaveButton();

        //Delete Shared Account
        sharedAccountsPage.clickOnDropdownMenu();
        sharedAccountsPage.clickOnDeleteShAccLink();
        sharedAccountsPage.clickOnDeleteButton();
        sharedAccountsPage.enterInSearhFieldShAccName("my");
        sharedAccountsPage.checkIsShAccNotPresent();
    }
}