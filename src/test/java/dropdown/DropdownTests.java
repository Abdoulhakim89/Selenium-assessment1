package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropDown1(){
        var dropdownPage = home.clickDropdown();
        String toSelect = "Action";
        dropdownPage.selectFrom1(toSelect);

        assertTrue(dropdownPage.selectedFrom1().contains(toSelect) && dropdownPage.selectedFrom2().size() ==1,"More than 1 selected or Selected is not included!");
    }
}
