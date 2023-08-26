package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



public class Base_Test {
    private WebDriver webDriver;
    protected HomePage homePage;
    @BeforeClass
    public  void SetUp() throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        webDriver=new ChromeDriver(co);
        Thread.sleep(6000);
        webDriver.get("https://www.amazon.com/");
        webDriver.manage().window().maximize();
         homePage=new HomePage(webDriver);
         homePage.Click_button_search_box();
    }
     @AfterMethod
    public void  TearDown()
    {
        webDriver.quit();
    }

}