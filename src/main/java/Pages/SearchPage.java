package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {

    private static final String TITLE="Search - My Store";
    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver){
        this.driver=driver;
        waitUntilPageLoaded(driver,TITLE);
        wait=new WebDriverWait(driver,3L);
    }

    public String getTextOfAlertMessage(){
        By alertLocator = By.xpath(("//p[contains(@class, 'alert-warning')]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(alertLocator));
        WebElement warningAlert =driver.findElement(By.xpath(("//p[contains(@class, 'alert-warning')]")));

        return warningAlert.getText();

    }

}
