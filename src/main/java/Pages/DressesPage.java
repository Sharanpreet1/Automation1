package Pages;

import org.openqa.selenium.WebDriver;

public class DressesPage extends BasePage {

    private static final String TITLE = "Dresses - My Store";
    private WebDriver driver;

    public DressesPage(WebDriver driver){
        this.driver=driver;



        waitUntilPageLoaded(driver, TITLE);
    }
}
