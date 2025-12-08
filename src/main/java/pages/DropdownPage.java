package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;


    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    public Select selectDropdown(String id){
        return new Select(driver.findElement(By.id(id)));
    }
    public void selectFrom1(String text){
        selectDropdown("my-dropdown1").selectByVisibleText(text);
    }

    public List<String> selectedFrom1(){
        var selected = selectDropdown("my-dropdown-1").getAllSelectedOptions();
        return selected.stream().map(a -> a.getText()).collect(Collectors.toList());
    }
    public void selectFrom2(String text){
        selectDropdown("my-dropdown-2").selectByVisibleText(text);
    }

    public List<String> selectedFrom2(){
        var selected = selectDropdown("my-dropdown-2").getAllSelectedOptions();
        return selected.stream().map(a -> a.getText()).collect(Collectors.toList());
    }
}
