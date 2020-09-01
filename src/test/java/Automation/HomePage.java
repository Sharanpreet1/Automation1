package Automation;

import Automation.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends BaseTest {

    private final static int ExpectedQauntity = 7;

    @Test

    public void checkQuantityOfPopularItems () {
            driver.navigate().to(url);

            WebElement popularButton = driver.findElement(By.className("homefeatured"));
            popularButton.click();

        List<WebElement> popularItems =driver.findElements(By.xpath("//ul[@id='homefeatured']/li"));
        Assert.assertEquals(popularItems.size(),ExpectedQauntity,"Check quauntity of popular items");

        }

    @Test
        public void checkQuantityOfBestSellers(){

        driver.navigate().to(url);

        WebElement bestSellerButtons = driver.findElement(By.className("blockbestsellers"));
        bestSellerButtons.click();

        List<WebElement> bestSellersItems =driver.findElements(By.xpath("//ul[@id='blockbestsellers']/li"));
Assert.assertEquals(bestSellersItems.size(),ExpectedQauntity,"Check quantity of best sellers items");
    }

    }















