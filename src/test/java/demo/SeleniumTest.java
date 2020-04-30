package demo;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import demo.pages.SearchPage;
import demo.webdriver.WebdriverInstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    // INITIALIZE 2 PAGE
    private ArticlePage articlePage = new ArticlePage();    // Article Page
    private HomePage homePage = new HomePage();             // Home Page
    private SearchPage searchPage = new SearchPage();
    @Before
    public void before(){

        WebdriverInstance.initialize();
    }
    @After
    public void after (){

        WebdriverInstance.quit();
    }
    @Test
    public void searching(){
        homePage.openHomePage();
        homePage.inputSearch("Pikachu Wikipedia Indonesia");
        searchPage.clickSearch();
        searchPage.openSearchPage();

        String PokemonName ="Pikachu";
        String api = "Pikachu";
        Assert.assertTrue(PokemonName.contains(api));



    }
}
