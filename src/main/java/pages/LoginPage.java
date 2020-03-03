package pages;

import org.openqa.selenium.By;

import static pages.PageUrls.LOGIN_URL;

public class LoginPage extends BasePage {

    // TODO: Try to tidy up the label locators
    private By loginFormHeading = By.cssSelector("#login_form .page-subheading");
    private By loginFormEmailLabel = By.cssSelector(".form-group:nth-child(1) label");
    private By loginFormEmailInput = By.id("email");
    private By loginFormPasswordLabel = By.cssSelector(".form-group+ .form-group label");
    private By loginFormPasswordInput = By.id("passwd");
    private By forgotPasswordLink = By.cssSelector("#login_form a");
    private By signInButton = By.id("SubmitLogin");

    public void goTo() { driver.get(LOGIN_URL); }

    public String getLoginFormHeadingText() {
        return getText(loginFormHeading);
    }

    public String getLoginEmailLabelText() {
        return getText(loginFormEmailLabel);
    }

    public String getLoginEmailInputValue() {
        return getValue(loginFormEmailInput);
    }

    public void enterLoginEmail(String text) {
        enterText(loginFormEmailInput, text);
    }

    public String getLoginPasswordLabelText() {
        return getText(loginFormPasswordLabel);
    }

    public void enterLoginPassword(String text) {
        enterText(loginFormPasswordInput, text);
    }

    public String getLoginPasswordInputValue() {
        return getValue(loginFormPasswordInput);
    }

    public String getForgotPasswordText() {
        return getText(forgotPasswordLink);
    }

    public String getForgotPasswordHref() {
        return getHref(forgotPasswordLink);
    }

    public String getSignInButtonText() {
        return getText(signInButton);
    }

    public MyAccountPage clickSignInButton() {
        // TODO: This can't return MyAccountPage because of unsuccessful login attempts
        click(signInButton);
        return new MyAccountPage();
    }

}
