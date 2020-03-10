package pages;

public final class PageUrls {

    private PageUrls() {
    }

    public static final String BASE_URL = "http://automationpractice.com/index.php";
    public static final String LOGIN_URL = BASE_URL + "?controller=my-account";
    public static final String MY_ACCOUNT_URL = LOGIN_URL;
    public static final String FORGOT_PASSWORD_URL = BASE_URL + "?controller=password";
    public static final String SHOPPING_CART_URL = BASE_URL + "?controller=order";
    public static final String WOMENS_TSHIRTS_URL = BASE_URL + "?id_category=5&controller=category";

}
