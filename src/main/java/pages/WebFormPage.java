package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebFormPage {
    private WebDriver driver;
    private By submitButton = By.xpath(".//button[text()='Submit']");


    public WebFormPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getField(String fieldName){
        return driver.findElement(By.name(fieldName));
    }
    public void textInputText(String inputText){
        WebElement input = getField("my-text");
        input.sendKeys(inputText);
    }
    public void passwordText(String password){
        WebElement passwordIn = getField("my-password");
        passwordIn.sendKeys(password);
    }
    public void fileInput(String path){
        WebElement file = getField("my-file");
        file.sendKeys(path);
    }
    public void testAreaText(String text){
        WebElement textAreaIn = getField("my-textarea");
        textAreaIn.sendKeys(text);
    }
    public void rangeIncrement(int increment){
        WebElement range = getField("my-range");
        for(int i = 0; i<increment; i++){
            range.sendKeys(Keys.ARROW_LEFT);
        }
    }
    public void  dropDown(String selection){
        new Select(getField("my-select")).selectByVisibleText(selection);
    }
    public WebformSuccess submit(){
        driver.findElement(submitButton).click();
        return new WebformSuccess(driver);

    }


}
