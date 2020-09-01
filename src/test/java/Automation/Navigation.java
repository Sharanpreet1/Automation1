package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Navigation extends BaseTest {


    @Test

    public void navigateToWomens() {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement navWomens = driver.findElement(By.xpath("//a[@title='Women']"));
        navWomens.click();
    }
     @Test

     public void navigateToDresses(){
         driver.navigate().to(url);
         driver.manage().window().maximize();

         String urlDresses = "http://automationpractice.com/index.php?id_category=8&controller=category";

        //driver.navigate().to(urlDresses);
       WebElement NavDresses =driver.findElement(By.xpath("//a[@title='Dresses']"));
       WebDriverWait wait = new WebDriverWait(driver,10L);
       // NavDresses.click();

    }

 @Test
    public void navigateToTshirt(){
     driver.navigate().to(url);
     driver.manage().window().maximize();

     WebElement navTshirts =driver.findElement(By.xpath("//*[text()='T-shirts']"));
        //navTshirts.click();

 }






}
