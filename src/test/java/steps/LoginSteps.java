package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.MyAccountPage;

import static org.testng.Assert.assertEquals;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Given("^I am on the Authentication page$")
    public void i_am_on_the_authentication_page() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        Dimension size = new Dimension(1024, 786);
        driver.manage().window().setSize(size);
        // TODO: This declaration will be moved, we should go to the homepage instead of login
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        loginPage = new LoginPage(driver);
    }

    @When("^I submit valid credentials$")
    public void i_submit_valid_credentials() {
        loginPage.enterLoginEmail("ldtest1@test.com");
        loginPage.enterLoginPassword("Test1234");
        myAccountPage = loginPage.clickSignInButton();
    }

    @Then("^I am redirected to My Account$")
    public void i_am_redirected_to_my_account() {

        // TODO: Change this assertion to be URL
        assertEquals(myAccountPage.getHeadingText(), "MY ACCOUNT!");
        // TODO: Move to a teardown style method
        myAccountPage.clickLogout();
    }

}
