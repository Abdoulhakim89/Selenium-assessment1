package websites.site1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goTo(String locator){
        driver.findElement(By.partialLinkText(locator)).click();
    }


}
