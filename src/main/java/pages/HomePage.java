package pages;

import static pages.PageUrls.BASE_URL;

public class HomePage extends BasePage {

    public void goTo() { driver.get(BASE_URL); }

}
