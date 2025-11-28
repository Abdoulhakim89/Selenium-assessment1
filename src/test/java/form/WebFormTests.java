package form;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class WebFormTests extends BaseTests {

    @Test
    public void testFormSubmit(){
        var formPage = home.clickWebformPage();
        formPage.textInputText("This is the text input field");
        formPage.passwordText("My-Big-Password");
        formPage.testAreaText("This is the text Area, just for fun in the assessment");
        formPage.fileInput("C:\\Users\\hakim\\Desktop\\selenium-assessment\\resources\\chromedriver.exe");
        formPage.rangeIncrement(3);
        formPage.dropDown("Three");
        var success = formPage.submit();

        assertEquals(success.successMessage(),"Received!", "The form wasn't  sent!");

    }
}
