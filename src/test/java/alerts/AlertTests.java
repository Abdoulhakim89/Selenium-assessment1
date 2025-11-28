package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAlert(){
        var alerts = home.clickAlertsPage();
        String alertRes = alerts.getAlertText();

        alerts.clickAlertOk();
        assertEquals(alertRes,"Hello world!", "The alert click failed!");
    }

    @Test
    public void testConfirm(){
        var confirms = home.clickAlertsPage();
        confirms.dismissConfirm();
        assertEquals(confirms.getConfirmResult(),"You chose: false");
    }

    @Test
    public void testPrompt(){
        var prompts = home.clickAlertsPage();
        String message = "This is what I am testing for prompts";
        prompts.promptMessage(message);
        assertEquals(prompts.getPromptMessage(),"You typed: "+message,"The clicked provided message isn't there");
    }
    @Test
    public void testModal(){
        var  modal = home.clickAlertsPage();
        modal.denyModal();

//        assertEquals(modal.getModalResult(), "You chose: Close", "The modal didn't respond appropriately");
    }
}
