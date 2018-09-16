package FanPassPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static FanPassUtils.FanPassUtil.getConfigValue;

/**
 * Created by udit on 17/09/18.
 */
public class FanPass {

    private WebDriver driver;

    public void setup(){
        driver = new ChromeDriver();

        String url = getConfigValue("url");
        driver.get(url);
        String title = driver.getTitle();
        System.out.println(title);
    }

    public WebDriver getDriver(){
        return driver;
    }

}
