package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectItemPage {
    private WebDriver webDriver;
    private By selectitem = By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
    public  SelectItemPage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
    }

    public addtocartPage clickbuttonitem()
    {
        webDriver.findElement(selectitem).click();
        return  new addtocartPage(webDriver);
    }


}
