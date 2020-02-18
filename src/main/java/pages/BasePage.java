package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    private WebElement heading;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.heading = driver.findElement(By.tagName("h1"));
    }

    public String getHeadingText() {
        waitForElementToBeVisible(heading);
        return heading.getText();
    }

    protected void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
