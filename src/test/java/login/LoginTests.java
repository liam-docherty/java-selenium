package login;

import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void successfulLogin() {
        loginPage.enterLoginEmail("ldtest1@test.com");
        loginPage.enterLoginPassword("Test1234");
        loginPage.clickSignIn();
    }

}
