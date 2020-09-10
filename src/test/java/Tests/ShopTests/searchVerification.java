package Tests.ShopTests;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchVerification extends BaseTest {

    private static final String searchPageTitle = "Search - My Store";

  @Test
    public void checkSearch (){

    navigateToHomepage();

        By searchBarXPath = By.id("search_query_top");
        //By searchButtonPress = By.className("btn btn-default button-search");

     WebElement searchBar = driver.findElement(searchBarXPath);

     //By Adding +Keys.Return it will submitt the request by clicking automatically.
      searchBar.sendKeys("Dresses"+ Keys.RETURN);
      WebElement pressingSearch = driver.findElement(By.xpath("//*[@class='btn btn-default button-search']"));
      //pressingSearch.click();
  }

      @Test
  public void waitDriverElementMethod(){
     navigateToHomepage();

          WebElement addToCart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
          WebDriverWait wait = new WebDriverWait(driver,10L);
          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Add to cart']")));

  }


  @Test

    public void checkSearchWithoutKeyword(){
     navigateToHomepage();

     WebElement searchField = driver.findElement(By.id("search_query_top"));
     //searchField.sendKeys(" ");

     By button = By.xpath("//form[@id='searchbox']/button[@type='submit']");
     WebElement newButton = driver.findElement(button);
     newButton.click();




      Assert.assertEquals(driver.getTitle(),searchPageTitle, "Make sure user is on Search page ");

      By alertLocator = By.xpath("//p[contains(@class, 'alert-warning')]");
      WebDriverWait wait = new WebDriverWait(driver,10L);
      wait.until(ExpectedConditions.presenceOfElementLocated(alertLocator));
     WebElement errorMessage = driver.findElement(alertLocator);

      Assert.assertEquals(errorMessage.getText(),"No results were found for your search \" \" ");
  }

    @Test

    public void checkNoResultsFound (){
        String keyword = "Macbook";
    navigateToHomepage();

        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.sendKeys(keyword + Keys.RETURN);

        Assert.assertEquals(driver.getTitle(),searchPageTitle,"Make sure user is on home page");

        By alertLocator = By.xpath("//p[contains(@class, 'alert-warning')]");
        wait.until(ExpectedConditions.presenceOfElementLocated(alertLocator));
        WebElement warningAlert = driver.findElement(alertLocator);

        String expectedWarningMessage = "No results were found for your search " + "\"" + keyword + "\"";
        Assert.assertEquals(warningAlert.getText(),expectedWarningMessage);



    }








}
