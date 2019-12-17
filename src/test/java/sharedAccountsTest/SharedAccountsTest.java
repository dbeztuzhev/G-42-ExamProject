package sharedAccountsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;


public class SharedAccountsTest extends AbstractParentTest {
    @Test
    public void editProvidersDeal() {
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
    }
}