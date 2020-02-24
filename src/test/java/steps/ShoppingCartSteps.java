package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ShoppingCartPage;

import static org.testng.Assert.assertEquals;

public class ShoppingCartSteps {

    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("^I am on the shopping cart page$")
    public void i_am_on_the_shopping_cart_page() {
        shoppingCartPage.goTo();
    }

    @Given("^I have yet to add any items to my shopping cart$")
    public void i_have_yet_to_add_any_items_to_my_shopping_cart() {
        // Nothing required here. This is simply added to improve readability
    }

    @Then("^an alert should be displayed stating: \"(.*)\"$")
    public void an_alert_should_be_displayed_stating(String string) {
        assertEquals(shoppingCartPage.getEmptyCartAlertText(), string);
    }


}
