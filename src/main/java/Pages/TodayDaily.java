package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodayDaily {
    private WebDriver webDriver;
    private By TodayDaily = By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']");
    public TodayDaily(WebDriver webDriver)
    {
        this.webDriver=webDriver;
    }
    public DepartmentsPage Click_to_today_daily()
    {
        webDriver.findElement(TodayDaily).click();
        return new DepartmentsPage(webDriver);
    }
}
