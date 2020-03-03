package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.MyAccountPage;

import static org.testng.Assert.assertEquals;
import static pages.PageUrls.FORGOT_PASSWORD_URL;
import static pages.PageUrls.MY_ACCOUNT_URL;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();
    private MyAccountPage myAccountPage = new MyAccountPage();

    @Given("^I am on the Authentication page$")
    public void i_am_on_the_authentication_page() {
        loginPage.goTo();
    }

    @When("^I submit valid credentials$")
    public void i_submit_valid_credentials() {
        loginPage.enterLoginEmail(System.getenv("REGISTERED_USER_EMAIL"));
        loginPage.enterLoginPassword(System.getenv("REGISTERED_USER_PASSWORD"));
        loginPage.clickSignInButton();
    }

    @Then("^I should be presented with the option to login$")
    public void i_should_be_presented_with_the_option_to_login() {
        assertEquals(loginPage.getLoginFormHeadingText(), "ALREADY REGISTERED?");
        assertEquals(loginPage.getLoginEmailLabelText(), "Email address");
        assertEquals(loginPage.getLoginEmailInputValue(), "");
        assertEquals(loginPage.getLoginPasswordLabelText(), "Password");
        assertEquals(loginPage.getLoginPasswordInputValue(), "");
        assertEquals(loginPage.getForgotPasswordText(), "Forgot your password?");
        assertEquals(loginPage.getForgotPasswordHref(), FORGOT_PASSWORD_URL);
        assertEquals(loginPage.getSignInButtonText(), "Sign in");
    }

    @Then("^I am redirected to My Account$")
    public void i_am_redirected_to_my_account() {
        assertEquals(myAccountPage.getHeadingText(), "MY ACCOUNT");
        assertEquals(myAccountPage.getCurrentUrl(), MY_ACCOUNT_URL);
    }

}
