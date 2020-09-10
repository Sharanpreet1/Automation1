package Tests.ShopTests;

import Tests.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class ItemsTests extends BaseTest {

    @Test
    public void checkSizeDropdownSelection(){
        navigateToHomepage();

        List<WebElement> items = driver.findElements(By.xpath("//ul[@id='homefeatured']//div[@class='product-image-container']"));
        items.get(0).click();
        Assert.assertEquals(driver.getTitle(), "My Store");

        driver.switchTo().frame(1);

        By sizeDropdownLocator = By.id("group_1");
        wait.until(ExpectedConditions.presenceOfElementLocated(sizeDropdownLocator));

        WebElement element = driver.findElement(sizeDropdownLocator);
        Select sizeDropdown = new Select(element);

        String sizeToSelect = "M";
        sizeDropdown.selectByVisibleText(sizeToSelect);

        Assert.assertEquals(sizeDropdown.getFirstSelectedOption().getText(),sizeToSelect);
    }


    @Test
    public void checkPopUpIsDisplayedUponClickingAddToCartButton() {
        String successfulActionText = "Product successfully added to your shopping cart";

        navigateToHomepage();
        List<WebElement> items = driver.findElements(By.xpath("//ul[@id='homefeatured']//div[@class='product-image-container']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(items.get(1)).perform();

        WebElement addToCartButton = driver.findElement(By.xpath("//a[@title='Blouse']//ancestor::li//a[@title='Add to cart']"));
        addToCartButton.click();

        By messageLocator = By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(messageLocator));

        WebElement successfulMessage = driver.findElement(messageLocator);
        Assert.assertEquals(successfulMessage.getText(), successfulActionText);
    }

}
