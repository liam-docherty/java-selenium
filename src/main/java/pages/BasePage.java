package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// TODO: Should this be an abstract class with an abstract goTo method?
public class BasePage {

    protected static WebDriver driver;
    private static Actions actions;
    private static By heading = By.tagName("h1");
    private static By logout = By.className("logout");
    // TODO: Tidy up selectors
    private static By womenMenu = By.cssSelector("li:nth-child(1) .sf-with-ul");
    private static By womenTShirtsMenuOption = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");

    public void setWebDriver(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.actions = new Actions(driver);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void clickLogout() {
        click(logout);
    }

    public String getHeadingText() {
        return getText(heading);
    }

    public void hoverOverWomenMenu() {
        hoverOver(womenMenu);
    }

    public void clickWomensTShirtMenuOptionFromOpenMenu() {
        click(womenTShirtsMenuOption);
    }

    protected void click(By by) {
        waitForElementToBeClickable(by);
        driver.findElement(by).click();
    }

    protected void hoverOver(By by) {
        WebElement element = waitForElementToBeClickable(by);
        actions.moveToElement(element).perform();
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

    private WebElement waitForElementToBeVisible(By by) {
        WebElement element = driver.findElement(by);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    private WebElement waitForElementToBeClickable(By by) {
        WebElement element = driver.findElement(by);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

}
