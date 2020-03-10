package pages;

import static pages.PageUrls.WOMENS_TSHIRTS_URL;

public class TShirtsPage extends BasePage {

    public void goTo() {
        driver.get(WOMENS_TSHIRTS_URL);
    }

}
