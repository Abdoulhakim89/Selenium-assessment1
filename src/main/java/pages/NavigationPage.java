package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {
    private WebDriver driver;
    private By paragraph2 = By.cssSelector(".lead");
    public String page2Paragraph = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";


    public NavigationPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickPage(String pageNum){
        driver.findElement(By.linkText(pageNum)).click();
    }
    public String getActivePage(){
        return driver.switchTo().activeElement().getText();
    }
    public String getParagraphText(){
        return driver.findElement(paragraph2).getText();
    }


}
