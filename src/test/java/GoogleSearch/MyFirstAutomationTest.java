package GoogleSearch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyFirstAutomationTest {

    @Test
    public void  checkSearchIsDone() {

        // setting path for chrome web driver
        System.setProperty("webdriver.chrome.driver", "C:src/drivers/chromedriver.exe");
        //System.setProperty("webdriver")
        System.setProperty("webdriver.gecko.driver","C:src/drivers/geckodriver.exe");



        // Creating new instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // Launching Google Website
        driver.get("https://www.google.com/");

        //switch to pop-up frame
        driver.switchTo().frame(0);

        //Identify the button
        WebElement agreeButton = driver.findElement(By.xpath("//*[text()='Zgadzam się']"));

        // clicking "Agree Button"
        agreeButton.click();

        //Navigating to search bar
        WebElement searchBar = driver.findElement(By.name("q"));

        //Entering words into search bar to search
        searchBar.sendKeys("Searches on Google per minute");

        //making search button clickable
        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        WebDriverWait wait = new WebDriverWait(driver,10L);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();


        
        driver.close();












    }
}
