package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage home;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        goHome();
        driver.manage().window().setSize(new Dimension(300,800));

    }
    @AfterMethod
    public void goHome(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/index.html");
        home = new HomePage(driver);

    }

//    @AfterClass
//    public void quit(){
//        driver.quit();
//    }
}
