package GoogleSearch;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ebay {

    @Test

    public void testEBay() {

        System.setProperty("webdriver.gecko.driver", "C:src/drivers/geckodriver.exe");

        //System.setProperty("webdriver.chrome.driver","C:src/drivers/chromedriver.exe");

        WebDriver driver = new FirefoxDriver();

        //WebDriver driver1 = new ChromeDriver();

        String baseUrl = "https://www.ebay.com/";

        String actualTitle = " ";
        driver.get(baseUrl);

       Alert alert = driver.switchTo().alert();

       // WebElement wb=driver.findElement(By.name("q"));


        //WebElement pressButton = driver.findElement(By.xpath("//button[text()='Accept']"));




    }
}
