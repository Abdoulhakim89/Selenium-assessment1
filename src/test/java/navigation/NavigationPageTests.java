package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NavigationPageTests extends BaseTests {

    @Test
    public void testNavigation(){
        var navigation = home.clickNavigationPage();
        String pageToClick = "2";
        navigation.clickPage(pageToClick);

        assertEquals(navigation.getParagraphText(),navigation.page2Paragraph,"The clicked page is not the active page");

    }
}
