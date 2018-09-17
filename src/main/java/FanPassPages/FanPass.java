package FanPassPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static FanPassUtils.FanPassUtil.getConfigValue;
import static org.junit.Assert.fail;


/**
 * Created by udit on 17/09/18.
 */
public class FanPass {

    private static WebDriver driver;
    protected static FanPassLoginPage fanPassLoginPage;
//            = new FanPassLoginPage(driver);

    protected void setup() {
        initiateDriver();
        fanPassLoginPage = PageFactory.initElements(driver,FanPassLoginPage.class);
    }

    private WebDriver initiateDriver() {
       String browser = getConfigValue("default.browser");

       switch (browser){
           case "chrome":
               driver = new ChromeDriver();
               break;

           case "firefox":
               driver = new FirefoxDriver();
               break;

           default:
               fail("Browser not supported");
       }

        String url = getConfigValue("url");
        driver.get(url);
        String title = driver.getTitle();
        System.out.println(title);

        return driver;
    }

    protected WebDriver getDriver(){
        return this.driver;
    }

}
