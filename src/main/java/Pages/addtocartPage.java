package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addtocartPage {
    private WebDriver webDriver;
    //add-to-cart-button\
    private By addtocart = By.xpath("//input[@id='add-to-cart-button']");
    public addtocartPage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
    }

    public GOtocartPage click_to_add_card()
    {
        webDriver.findElement(addtocart).click();
        return new GOtocartPage(webDriver);
    }







}
