package Tests;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract  class BaseTest {
    protected static final String url = " http://automationpractice.com/index.php";
    protected WebDriver driver;
    protected WebDriverWait wait;

        @BeforeMethod
    public void setUp(){
            System.setProperty("webdriver.chrome.driver","C:src/drivers/chromedriver.exe");
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             wait = new WebDriverWait(driver,3L);
        }

        /*@AfterMethod
        public void tearUp(){
            driver.quit();
*/






        protected void navigateToHomepage(){
            driver.navigate().to(url);
        }

}
