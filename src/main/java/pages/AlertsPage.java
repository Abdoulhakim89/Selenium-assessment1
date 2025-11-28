package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage {
    private WebDriver driver;


    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void alertClicker(String id){
        driver.findElement(By.id(id)).click();
    }

    public String getAlertText(){
        alertClicker("my-alert");
        return driver.switchTo().alert().getText();
    }
    public void clickAlertOk(){
        driver.switchTo().alert().accept();
    }
    public void dismissConfirm(){
        alertClicker("my-confirm");
        driver.switchTo().alert().dismiss();

    }
    public String getConfirmResult(){
        return driver.findElement(By.id("confirm-text")).getText();
    }

    public void promptMessage(String message){
        alertClicker("my-prompt");
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }
    public String getPromptMessage(){
        return driver.findElement(By.id("prompt-text")).getText();
    }

    public void denyModal(){
        alertClicker("my-modal");
        WebElement close = driver.findElement(By.cssSelector(".modal-content button"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(close));
        close.click();

    }
    public String getModalResult(){
        return driver.findElement(By.id("modal-text")).getText();
    }

}
