package Task1;

import Base.Base_Test;
import Pages.*;
import org.testng.annotations.Test;

public class Scenario extends Base_Test {


    @Test
    public void TC_Fun()
    {
        SelectItemPage selectItemPage=homePage.click_button_select_item();
        addtocartPage addtocartPage=homePage.click_button_add_item();
        GOtocartPage gOtocartPage=homePage.click_button_GO_item();
        TodayDaily todayDaily=homePage.click_button_Today_Daily();
        DepartmentsPage departmentsPage=homePage.click_to_choose();
       selectItemDailyPage selectItemDailyPage=homePage.click_to_Select();
      //  SelectItemNumber2inDailyPage selectItemNumber2inDailyPagekkk  =homePage.Choose_to_Select();
       addtocartPage addtocartiPage=homePage.click_button_add_item();










    }

}
