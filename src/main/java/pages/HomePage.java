package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void linkClicker(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public NavigationPage clickNavigationPage(){
        linkClicker("Navigation");
        return new NavigationPage(driver);
    }

    public WebFormPage clickWebformPage(){
        linkClicker("Web form");
        return new WebFormPage(driver);
    }

    public DropdownPage clickDropdown(){
        linkClicker("Dropdown menu");
        return new DropdownPage(driver);
    }
    public AlertsPage clickAlertsPage(){
        linkClicker("Dialog boxes");
        return new AlertsPage(driver);
    }


}
