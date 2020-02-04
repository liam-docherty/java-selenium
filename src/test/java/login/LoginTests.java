package login;

import base.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void test123() {
        setUp();
        System.out.println(loginPage.getLoginEmailLabel());
        loginPage.enterLoginEmail("This is a test");
    }

}
