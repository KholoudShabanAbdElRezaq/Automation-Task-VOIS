package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GOtocartPage {

    private WebDriver webDriver;

    private  By gotocard = By.xpath("//a[@href='/cart?ref_=sw_gtc']");

    public GOtocartPage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
    }
    public TodayDaily click_to_co_to_cart()
    {
        webDriver.findElement(gotocard).click();
        return new TodayDaily(webDriver);
    }

}
