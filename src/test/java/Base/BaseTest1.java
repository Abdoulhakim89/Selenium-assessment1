package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import websites.site1.pages.HomePage;

public class BaseTest1 {
    private WebDriver driver;
    protected HomePage home;

//    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        home = new HomePage(driver);
        home.clickProductsPage();
    }

//    @AfterClass
    public void quit(){
        driver.quit();
    }

}
