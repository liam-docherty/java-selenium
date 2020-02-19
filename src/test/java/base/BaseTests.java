package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;
import pages.LoginPage;

public class BaseTests {

    protected BasePage basePage;
    protected LoginPage loginPage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        Dimension size = new Dimension(1024, 786);
        driver.manage().window().setSize(size);
        // TODO: This declaration will be moved, we should go to the homepage instead of login
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
    }

    public void logout() {
        basePage.clickLogout();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
