package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage {

    private By emptyCartAlert = By.className("alert-warning");

    public void goTo() {
        driver.get(BASE_URL + "?controller=order");
    }

    public String getEmptyCartAlertText() {
        return getText(emptyCartAlert);
    }

}
