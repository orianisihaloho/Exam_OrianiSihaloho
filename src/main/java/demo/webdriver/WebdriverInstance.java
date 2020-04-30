package demo.webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class WebdriverInstance {

    public static WebDriver driver;

    //Initialize script
    public static void initialize(){
        //SETTING PLATFORM AND BROWSER
        ChromeOptions options = new ChromeOptions();                                // set Browser using Chrome
        options.addArguments("--start-maximized","--incognito","disable-infobar");  // set incognito,set maximize in windows, and set infobar
        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);          // set platform : Mac
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);     // set browser and version : Chrome

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();                                        // set maximize in Mac
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);       // set timeout after 5s, defined by selenium
        //Thread.sleep(5000);                                                       // will quit after 5s

    }

    public static void quit(){
        driver.quit();

    }



}
