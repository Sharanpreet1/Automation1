package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class MyFirstAutomationTest {

    @Test
    public void  checkSearchIsDone() {

        // setting path for chrome web driver
        System.setProperty("webdriver.chrome.driver", "C:src/drivers/chromedriver.exe");

        System.setProperty("webdriver.gecko.driver","C:src/drivers/geckodriver.exe");

        //System.setProperty("webdriver")
        // Creating new instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // Launching Google Website
        driver.get("https://www.google.com/");

        //switch to pop-up frame
        driver.switchTo().frame(0);

        //Identify the button and then press "Agree" on pop-up
        WebElement agreeButton = driver.findElement(By.id("introAgreeButton"));

        // clicking "Agree Button"
        agreeButton.click();

        //Navigating to search bar
        WebElement searchBar = driver.findElement(By.name("q"));

        //Entering words into search bar to search
        searchBar.sendKeys("Population of world");

        //making search button clickable
        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        WebDriverWait wait = new WebDriverWait(driver,5L);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();


        
        driver.close();












    }
}
