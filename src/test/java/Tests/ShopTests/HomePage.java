package Tests.ShopTests;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends BaseTest {

    private final static int ExpectedQuantity = 7;

    @Test

    public void checkQuantityOfPopularItems () {
           driver.navigate().to(url);

            WebElement popularButton = driver.findElement(By.className("homefeatured"));
            popularButton.click();


            List<WebElement> popularItems =driver.findElements(By.xpath("//ul[@id='homefeatured']/li"));
        Assert.assertEquals(popularItems.size(),ExpectedQuantity,"Check quauntity of popular items");

        }

    @Test
        public void checkQuantityOfBestSellers(){

        driver.navigate().to(url);

        WebElement bestSellerButtons = driver.findElement(By.className("blockbestsellers"));
        bestSellerButtons.click();

        List<WebElement> bestSellersItems =driver.findElements(By.xpath("//ul[@id='blockbestsellers']/li"));
Assert.assertEquals(bestSellersItems.size(),ExpectedQuantity,"Check quantity of best sellers items");
    }

    }















