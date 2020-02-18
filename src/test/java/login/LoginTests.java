package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MyAccountPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void successfulLogin() {
        loginPage.enterLoginEmail("ldtest1@test.com");
        loginPage.enterLoginPassword("Test1234");
        MyAccountPage myAccountPage = loginPage.clickSignIn();
        assertEquals(myAccountPage.getHeadingText(), "MY ACCOUNT");
        // TODO: Move to a teardown style method
        myAccountPage.clickLogout();
    }

}
