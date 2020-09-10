package Pages;

import Forms.NavigationForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    private static final String TITLE= "My Store";
    private WebDriver driver;
    private WebElement popularButton;
    private WebElement bestSellerButton;
    private WebElement searchField;
    private  WebElement submittButton;
    private NavigationForm navigationForm;



    public HomePage (WebDriver driver){
        this.driver = driver;
        waitUntilPageLoaded(driver,TITLE);

        popularButton = driver.findElement(By.className("homefeatured"));
        bestSellerButton =driver.findElement(By.className("blockbestsellers"));
        searchField =driver.findElement(By.id("search_query_top"));
        submittButton = driver.findElement(By.xpath("//form[@id='searchbox']/button[@type='submit']"));
        navigationForm =new NavigationForm(driver);
    }


    public HomePage clickPopularButton(){
        popularButton.click();
        return this;
    }

    public HomePage clickBestSellersButton(){
        bestSellerButton.click();
        return this;
    }

    public HomePage populateSearchField (String keyword){
        searchField.sendKeys(keyword);
        return this;
    }

    public SearchPage clickSubmittButton(){
        submittButton.click();
        return new SearchPage(driver);
    }

    public List<WebElement> getPopularItems(){

        return driver.findElements(By.xpath(("//ul[@id='homefeatured']/li")));
    }

    public List<WebElement> getBestSellerItems(){
        return driver.findElements(By.xpath("//ul[@id='blockbestsellers']/li"));
    }


}
