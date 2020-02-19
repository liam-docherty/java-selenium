package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MyAccountPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void loginFormContents() {
        assertEquals(loginPage.getLoginFormHeadingText(), "ALREADY REGISTERED?");
        assertEquals(loginPage.getLoginEmailLabelText(), "Email address");
        assertEquals(loginPage.getLoginEmailInputValue(), "");
        assertEquals(loginPage.getLoginPasswordLabelText(), "Password");
        assertEquals(loginPage.getLoginPasswordInputValue(), "");
        assertEquals(loginPage.getForgotPasswordText(), "Forgot your password?");
        assertEquals(loginPage.getForgotPasswordHref(), "http://automationpractice.com/index.php?controller=password");
        assertEquals(loginPage.getSignInButtonText(), "Sign in");
    }

    @Test
    public void successfulLogin() {
        loginPage.enterLoginEmail("ldtest1@test.com");
        loginPage.enterLoginPassword("Test1234");
        MyAccountPage myAccountPage = loginPage.clickSignInButton();
        // TODO: Change this assertion to be URL
        assertEquals(myAccountPage.getHeadingText(), "MY ACCOUNT");
        // TODO: Move to a teardown style method
        myAccountPage.clickLogout();
    }

}
