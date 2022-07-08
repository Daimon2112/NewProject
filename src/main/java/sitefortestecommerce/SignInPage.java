package somepac.sitefortestecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractParentPage{
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailForAccaount(String email){
        driver.findElement(By.xpath("//input[@id='email_create']")).click();
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@value='SubmitCreate']")).click();
    }

    public void enterEmailAlradyRegistered(String email){
        driver.findElement(By.xpath("//input[@id='email_create']")).click();
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@value='SubmitCreate']")).click();
    }








}
