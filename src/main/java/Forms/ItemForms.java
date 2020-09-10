package Forms;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class ItemForms extends BasePage {

        private final By itemsXpath = By.xpath(("//ul[@id='homefeatured']//li[contains(@class, 'ajax_block_product')]"));
        private WebDriver driver;

        public ItemForms(WebDriver driver){
            this.driver=driver;
        }

        public void addItemToCart(int index){
            Actions actions = new Actions(driver);
            List<WebElement> items = driver.findElements(itemsXpath);
            actions.moveToElement(items.get(index)).perform();

            String addToCartButtonTemplate = "//ul[@id='homefeatured']//li[contains(@class, 'ajax_block_product')][%s]//a[@title='Add to cart']";
            String addToCartXpath =String.format(addToCartButtonTemplate,(index + 1));
            driver.findElement(By.xpath(addToCartXpath)).click();
        }

        public void addRandomItemToCart(){
            List<WebElement> items = driver.findElements(itemsXpath);
            int randomIndex = new Random().nextInt(items.size());

            addItemToCart(randomIndex);

        }


}
