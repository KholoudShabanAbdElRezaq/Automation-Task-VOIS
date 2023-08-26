package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectItemDailyPage {
    private WebDriver webDriver;
    private By  ItemSelect = By.xpath("//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']");


    public selectItemDailyPage(WebDriver webDriver)

    {
        this.webDriver=webDriver;
    }

    public SelectItemNumber2inDailyPage click_to_selectdrom_list()
    {
        webDriver.findElement(ItemSelect).click();
        return new SelectItemNumber2inDailyPage(webDriver);
    }

}
