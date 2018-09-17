package FanPassPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by udit on 17/09/18.
 */
public class FanPassLoginPage extends FanPass {

    WebDriver driver;

    @FindBy(className = "menu-signin")
    WebElement signInOption;

    public FanPassLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void performLogin(){
        //WebElement signInOption = getDriver().findElement(By.className("menu-signin"));
        signInOption.click();
    }
}
