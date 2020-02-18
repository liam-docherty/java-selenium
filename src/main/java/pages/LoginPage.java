package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {

    private WebDriver driver;
    private WebElement loginForm;
    private WebElement loginFormHeading;
    private List<WebElement> loginFormFields;
    private WebElement loginFormEmail;
    private WebElement loginFormEmailLabel;
    private WebElement loginFormEmailInput;
    private WebElement loginFormPassword;
    private WebElement loginFormPasswordLabel;
    private WebElement loginFormPasswordInput;
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.loginForm = driver.findElement(By.id("login_form"));
        this.loginFormHeading = loginForm.findElement(By.tagName("h3"));
        this.loginFormFields = loginForm.findElements(By.className("form-group"));
        this.loginFormEmail = loginFormFields.get(0);
        this.loginFormEmailLabel = loginFormEmail.findElement(By.tagName("label"));
        this.loginFormEmailInput = driver.findElement(By.id("email"));
        this.loginFormPassword = loginFormFields.get(1);
        this.loginFormPasswordLabel = loginFormPassword.findElement(By.tagName("label"));
        this.loginFormPasswordInput = driver.findElement(By.id("passwd"));
        this.signInButton = driver.findElement(By.id("SubmitLogin"));
    }

    public String getLoginEmailLabel() {
        return loginFormEmailLabel.getText();
    }

    public void enterLoginEmail(String text) {
        loginFormEmailInput.sendKeys(text);
    }

    public void enterLoginPassword(String text) { loginFormPasswordInput.sendKeys(text); }

    public void clickSignIn() { signInButton.click(); }

}
