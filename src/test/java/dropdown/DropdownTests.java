package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropDown1(){
        var dropdownPage = home.clickDropdown();
        dropdownPage.clickDropdown1();
        String res = dropdownPage.dropdown1Expanded();

        assertEquals(res,"true", "Dropdown 1 wasn't successfully clicked");

    }
    @Test
    public void testDropDown2(){
        var dropdownPage = home.clickDropdown();
        dropdownPage.clickDropdown2();
        String res = dropdownPage.dropdown2Expanded();

        assertEquals(res,"block", "Dropdown 2 wasn't successfully clicked");

    }
    @Test
    public void testDropDown3(){
        var dropdownPage = home.clickDropdown();
        dropdownPage.clickDropdown3();
        String res = dropdownPage.dropdown3Expanded();

        assertEquals(res,"block", "Dropdown 3 wasn't successfully clicked");

    }
}
