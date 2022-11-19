package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.CategoriePage;
import pages.HomePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;

    private static final String ROZETKA_URL = "https://rozetka.com.ua/ua/";

    @BeforeTest

    public void profileSetUp() { chromedriver().setup(); }

    @BeforeMethod

    public void testSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ROZETKA_URL);
    }

    @AfterMethod

    //public void tearDown() {driver.quit();}

    public WebDriver getDriver() {return driver;}

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public CategoriePage getCategoriePage(){ return new CategoriePage(getDriver()); }
}
