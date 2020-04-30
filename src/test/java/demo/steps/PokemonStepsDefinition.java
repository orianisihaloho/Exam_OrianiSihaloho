package demo.steps;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import demo.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class PokemonStepsDefinition {
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();
    private SearchPage searchPage = new SearchPage();

    @Given("User open Google home page")
    public void userOpenGoogleHomePage() {
        homePage.openHomePage();
    }

    @When("User get {string} from API")
    public void userGetFromAPI(String arg0) {

    }

    @When("User input search {string}on home page")
    public void userInputSearchOnHomePage(String keyword) {
        homePage.inputSearch(keyword + Keys.ENTER);
    }

    @When("User click first search result")
    public void userClickFirstSearchResult() {
       searchPage.clickSearch();
    }

    @Then("User see result {string} on article page")
    public void userSeeResultOnArticlePage(String PokemonName) {
        String actual = articlePage.getPokemonName();
        Assert.assertEquals(PokemonName,actual);
    }


}
