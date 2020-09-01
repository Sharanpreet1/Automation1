package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract  class BaseTest {
    protected static final String url = " http://automationpractice.com/index.php";
    protected WebDriver driver;

        @BeforeMethod
    public void setUp(){
            System.setProperty("webdriver.chrome.driver","C:src/drivers/chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().maximize();
        }
        @AfterMethod
    public void tearUp(){
            driver.quit();
        }

}
