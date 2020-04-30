package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void openHomePage(){
        WebdriverInstance.driver.get("https://www.google.com");                                             // call WebdriverInstance class
    }



    public void inputSearch(String keyword){
        WebElement inputSearch = WebdriverInstance.driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));                    // find searchInput by ID
        inputSearch.sendKeys(keyword+Keys.ENTER);
    }



}
