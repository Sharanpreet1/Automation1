package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected void waitUntilPageLoaded(WebDriver driver,String pageTitle){
        WebDriverWait wait = new WebDriverWait(driver,3L);
        wait.until(ExpectedConditions.titleIs(pageTitle));
    }

        protected void clickOnClickableElememnt(WebDriver driver, By locator){

        new WebDriverWait(driver,5L).until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

        }





}
