package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebformSuccess {
    private WebDriver driver;
    private By success = By.xpath(".//p[text()='Received!']");

    public WebformSuccess(WebDriver driver){
        this.driver = driver;
    }

    public String successMessage(){
        return driver.findElement(success).getText();
    }


}
