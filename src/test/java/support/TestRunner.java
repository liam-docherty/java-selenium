package support;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps", "support"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {

    private static WebDriver driver;
    protected static BasePage basePage;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        Dimension size = new Dimension(1024, 786);
        driver.manage().window().setSize(size);
        basePage = new BasePage();
        basePage.setWebDriver(driver);
    }

    @After
    public static void embedScreenshotInReport(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }

    @After
    public static void clearCookies() { driver.manage().deleteAllCookies(); }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

}
