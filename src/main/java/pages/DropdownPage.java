package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;


    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement selectDropdown(String id){
        return driver.findElement(By.id(id));
    }

    public void clickDropdown1(){
        selectDropdown("my-dropdown-1").click();
    }

    public String dropdown1Expanded(){
        return selectDropdown("my-dropdown-1").getAttribute("aria-expanded");
    }

    public void clickDropdown2(){
        var dropdown2 = selectDropdown("my-dropdown-2");
        Actions action = new Actions(driver);
        action.contextClick(dropdown2).perform();
    }

    public String dropdown2Expanded(){
        return selectDropdown("context-menu-2").getCssValue("display");
    }
    public void clickDropdown3(){
        var dropdown2 = selectDropdown("my-dropdown-3");
        Actions action = new Actions(driver);
        action.doubleClick(dropdown2).perform();
    }

    public String dropdown3Expanded(){
        return selectDropdown("context-menu-3").getCssValue("display");
    }
}
