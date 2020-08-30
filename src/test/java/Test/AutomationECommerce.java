package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutomationECommerce {

    @Test
    public void automationPractice() {

        System.setProperty("webdriver.chrome.driver","C:src/drivers/chromedriver.exe");

        System.setProperty("webdriver.gecko.driver","C:src/drivers/geckodriver.exe");

        //Initializing browser
        WebDriver driver = new ChromeDriver();

        //Opening web page to test
        driver.get(" http://automationpractice.com/index.php");

       /* //Navigation Step 1 - Womens tab
        driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");

        //Navigation Step 2 - Dresses tab
        driver.navigate().to("http://automationpractice.com/index.php?id_category=8&controller=category");

        //Navigation Step 3 - T-shirt tab
        driver.navigate().to("http://automationpractice.com/index.php?id_category=5&controller=category");

        //Finding for element for ContactUs form via xPath
        WebElement contactUs = driver.findElement(By.xpath(("//div[@id='contact-link']")));

        //Clicking on contactUs form
        contactUs.click();

        //Finding searchBar element via xPath
        WebElement search = driver.findElement(By.xpath("//input[@id='search_query_top']"));


        //Checking functionality of search bar by entering characters
        search.sendKeys("PRINTED DRESS");

        //searching the value given to search bar
        WebElement hitEnter = driver.findElement(By.name("submit_search"));
        hitEnter.click();*/

        //Verifying add to cart functionality by adding product
         WebElement addToCart = driver.findElement(By.xpath("//a[@title='Add to cart']"));

        //choosing one product to add to cart
         addToCart.click();

         //Exiting the pop up by clicking cross button
        WebElement crossButton = driver.findElement(By.xpath("//span[@class='cross']"));
        WebDriverWait wait = new WebDriverWait(driver,10L);
        wait .until(ExpectedConditions.elementToBeClickable(crossButton));
        crossButton.click();

        //removing product from the cart
       /*WebElement removingProduct = driver.findElement(By.xpath("//a[@title='remove this product from my cart']"));
       removingProduct.click();*/
      








    }




}
