package demo.hooks;


import demo.webdriver.WebdriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class WebdriverHook {

    @Before(value ="@Web")
    public void initializedWebdriver(){
        WebdriverInstance.initialize();

    }

    @After( value ="@Web")
    public void quitWebdriver(){
        WebdriverInstance.quit();
    }
}
