package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver webDriver;
    private By searchbox = By.xpath("//input[@id='twotabsearchtextbox']");
    private By searchbutton = By.xpath("//input[@id='nav-search-submit-button']");
    private By selectitem = By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
    private By addtocart = By.xpath("//input[@id='add-to-cart-button']");
    private  By gotocard = By.xpath("//a[@href='/cart?ref_=sw_gtc']");
    private By TodayDaily = By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']");
    private By headphone=By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[19]/label/span");
    private By Grocery=By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[21]/label/span");
    private  By discount =By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span");
    private By  ItemSelect = By.xpath("//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']");
    private By ChooseIten=
            By.xpath("//a[@href='/Samsung-Wireless-Cancelling-Charging-Included/dp/B089B7LX7N?ref_=Oct_DLandingS_D_2f868858_0']");
    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public SelectItemPage Click_button_search_box()
    {
        webDriver.findElement(searchbox).sendKeys("car accessories");
        webDriver.findElement(searchbutton).click();
        return  new SelectItemPage(webDriver);
    }
    public SelectItemPage click_button_select_item()
    {
        webDriver.findElement(selectitem).click();
        return new SelectItemPage(webDriver);
    }

    public addtocartPage click_button_add_item()
    {
        webDriver.findElement(addtocart).click();
        return new addtocartPage(webDriver);
    }

    public GOtocartPage click_button_GO_item()
    {
        webDriver.findElement(gotocard).click();
        return new GOtocartPage(webDriver);
    }

    public TodayDaily click_button_Today_Daily()
    {
        webDriver.findElement(TodayDaily).click();
        return new TodayDaily(webDriver);
    }
    public  DepartmentsPage click_to_choose()
    {
        webDriver.findElement(headphone).click();
        webDriver.findElement(Grocery).click();
        webDriver.findElement(discount).click();
        return new DepartmentsPage(webDriver);
    }

    public  selectItemDailyPage click_to_Select()
    {
        webDriver.findElement(ItemSelect).click();

        return new selectItemDailyPage(webDriver);
    }

    public  SelectItemNumber2inDailyPage Choose_to_Select()
    {
        webDriver.findElement(ChooseIten).click();

        return new SelectItemNumber2inDailyPage(webDriver);
    }




}
