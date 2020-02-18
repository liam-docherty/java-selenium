package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class LoginTests extends BaseTests {

    @Test
    public void successfulLogin() {
        loginPage.enterLoginEmail("ldtest1@test.com");
        loginPage.enterLoginPassword("Test1234");
        MyAccountPage myAccountPage = loginPage.clickSignIn();
        // TODO: Add assertion here
        System.out.println(myAccountPage.getHeadingText());
    }

}
