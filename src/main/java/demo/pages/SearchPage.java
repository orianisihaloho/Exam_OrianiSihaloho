package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public void openSearchPage(){
        WebdriverInstance.driver.get("https://www.google.com/search?q=Pikachu+wikipedia+indonesia&oq=Pikachu+wikipedia+indonesia&aqs=chrome..69i57.7952j0j7&sourceid=chrome&ie=UTF-8");     // URL masih statis. Harusnya url sesuai query yang dimasukkan
    }

    public void clickSearch(){
        WebElement buttonSearch = WebdriverInstance.driver.findElement(By.xpath("//a[@href ='https://id.wikipedia.org/wiki/Pikachu']"));    // find element submit by Xpath
        buttonSearch.click();   // do click

    }
}
