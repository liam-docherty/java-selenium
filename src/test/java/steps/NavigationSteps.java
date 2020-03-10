package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TShirtsPage;

import static org.testng.Assert.assertEquals;
import static pages.PageUrls.WOMENS_TSHIRTS_URL;

public class NavigationSteps {

    private HomePage homePage = new HomePage();
    private TShirtsPage tShirtsPage = new TShirtsPage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() {
        homePage.goTo();
    }

    @When("^I hover over the women menu option$")
    public void i_hover_over_the_women_menu_option() {
        homePage.hoverOverWomenMenu();
    }

    @When("^I select the women's t-shirts sub category$")
    public void i_select_the_women_s_t_shirts_sub_category() {
        homePage.clickWomensTShirtMenuOptionFromOpenMenu();
    }

    @Then("^a list of women's sub-categories should be displayed$")
    public void a_list_of_women_s_sub_categories_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    // TODO: Investigate use of a generic "I am redirected to" method
    @Then("^I am redirected to women's t-shirts$")
    public void i_am_redirected_to_women_s_t_shirts() {
        // TODO: Check that TSHIRTS is highlighted in the menu
        assertEquals(tShirtsPage.getCurrentUrl(), WOMENS_TSHIRTS_URL);
    }


}
