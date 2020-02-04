package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {

    private WebDriver driver;
    private WebElement loginForm = driver.findElement(By.id("login_form"));
    private WebElement loginFormHeading = loginForm.findElement(By.tagName("h3"));
    private List<WebElement> loginFormFields = loginForm.findElements(By.className("form-group"));
    private WebElement loginFormEmail = loginFormFields.get(0);
    private WebElement loginFormEmailLabel = loginFormEmail.findElement(By.tagName("label"));
    private WebElement loginFormEmailInput = driver.findElement(By.id("email"));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginEmailLabel() {
        return loginFormEmailLabel.getText();
    }

    public void enterLoginEmail(String text) {
        loginFormEmailInput.sendKeys(text);
    }

}
