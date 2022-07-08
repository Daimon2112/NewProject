package somepac.sitefortestecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractParentPage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private static final String siteUrl = "http://automationpractice.com/index.php";

    public void openSite(){
        driver.get(siteUrl);
    }

    public void openSignInPage(){
        driver.findElement(By.xpath("//a[@class='login']")).click();
    }






}
