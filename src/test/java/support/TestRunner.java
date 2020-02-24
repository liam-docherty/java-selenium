package support;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
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
    public static void launchApplication() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        basePage = new BasePage();
        basePage.setWebDriver(driver);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

}
