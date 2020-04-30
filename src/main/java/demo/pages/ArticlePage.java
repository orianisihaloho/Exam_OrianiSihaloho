package demo.pages;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {

    public String getPokemonName(){
        WebElement labelPokemonName = WebdriverInstance.driver.findElement(By.id("firstHeading"));
        String PokemonName = labelPokemonName.getText();
        return PokemonName;
    }

}
