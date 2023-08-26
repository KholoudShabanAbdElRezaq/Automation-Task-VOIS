package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartmentsPage {
    //Headphones & Earbuds
    //10% off or more
    //Grocery & Gourmet Food


    private WebDriver webDriver;
    private By headphone=By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[19]/label/span");
    private By Grocery=By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[21]/label/span");
    private  By discount =By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span");
    public DepartmentsPage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
    }
    public selectItemDailyPage select_item_Daily()
    {
        webDriver.findElement(headphone).click();
        webDriver.findElement(Grocery).click();
        webDriver.findElement(discount).click();
        return new selectItemDailyPage(webDriver);
    }




}
