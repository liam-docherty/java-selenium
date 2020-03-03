package pages;

import org.openqa.selenium.By;

import static pages.PageUrls.SHOPPING_CART_URL;

public class ShoppingCartPage extends BasePage {

    private By emptyCartAlert = By.className("alert-warning");

    public void goTo() { driver.get(SHOPPING_CART_URL); }

    public String getEmptyCartAlertText() { return getText(emptyCartAlert); }

}
