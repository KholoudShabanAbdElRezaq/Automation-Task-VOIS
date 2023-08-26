package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectItemNumber2inDailyPage {
    private  WebDriver webDriver;
    private By ChooseIten=
            By.xpath("//a[@href='/Samsung-Wireless-Cancelling-Charging-Included/dp/B089B7LX7N?ref_=Oct_DLandingS_D_2f868858_0']");

    public SelectItemNumber2inDailyPage(WebDriver webDriver)
    {

        this.webDriver=webDriver;
    }
    public addtocartPage choose_item()
    {
        webDriver.findElement(ChooseIten).click();
        return new addtocartPage(webDriver);
    }



}
