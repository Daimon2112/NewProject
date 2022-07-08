package testforecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import sitefortestecommerce.MainPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    public MainPage mainPage;


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        }



    @AfterTest
    public void finish(){
        if(driver !=null){
            driver.quit();
        }
    }



    }


