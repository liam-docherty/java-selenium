package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    private By heading = By.tagName("h1");
    private By logout = By.className("logout");


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return getText(heading);
    }

    public void clickLogout() {
        click(logout);
    }

    protected void click(By by) {
        waitForElementToBeClickable(by);
        driver.findElement(by).click();
    }

    protected void enterText(By by, String text) {
        waitForElementToBeClickable(by);
        driver.findElement(by).sendKeys(text);
    }

    protected String getText(By by) {
        waitForElementToBeVisible(by);
        return driver.findElement(by).getText();
    }

    protected String getValue(By by) {
        waitForElementToBeClickable(by);
        return driver.findElement(by).getAttribute("value");
    }

    protected String getHref(By by) {
        waitForElementToBeClickable(by);
        return driver.findElement(by).getAttribute("href");
    }

    // TODO: Combine these into a common method that declares element and wait
    private void waitForElementToBeVisible(By by) {
        WebElement element = driver.findElement(by);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void waitForElementToBeClickable(By by) {
        WebElement element = driver.findElement(by);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
