package Forms;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationForm extends BasePage {
        private WebDriver driver;
        public final By womenTabXpath = By.xpath("//a[@title='Women']");
        private final By dressesXpath = By.xpath("//div/ul/li/a[@title='Dresses']");
        private final By tshirtsXpath = By.xpath("//div/ul/li/a[@title='T-shirts']");
        private final By contactUsXpath = By.id("contact-link");
        private final By shoppingCartXpath = By.xpath("//a[@title='View my shopping cart']");
        private final By removeItemButton = By.xpath("//span[@class='remove_link']");

        public NavigationForm(WebDriver driver) {
            this.driver=driver;
        }


        public void clickOnWomenTab(){
                clickOnClickableElememnt(driver,womenTabXpath);

        }

        public void clickOnDressesTab(){
               clickOnClickableElememnt(driver,dressesXpath);
        }


        public void clickOnTShirtsTab() {
               clickOnClickableElememnt(driver , tshirtsXpath);
        }

        public void clickOnContactUsPage() {
                clickOnClickableElememnt(driver, contactUsXpath);
        }

        public void removeItemsFromShoppingCat(){
                Actions actions =new Actions(driver);
                actions.moveToElement(driver.findElement(shoppingCartXpath)).perform();
                clickOnClickableElememnt(driver,removeItemButton);
        }

        public void clickOnShoppingCart(){
                clickOnClickableElememnt(driver,shoppingCartXpath);
        }




}
