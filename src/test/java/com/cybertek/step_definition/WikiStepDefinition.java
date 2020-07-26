package com.cybertek.step_definition;

import com.cybertek.pages.WikiPage;
import com.cybertek.utilities.Driver09;
import com.cybertek.utilities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinition {
    WikiPage wikiPage=new WikiPage();
    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver09.getDriver().get(configurationReader.getproperty("WikipidiaUrl"));
    }

    @When("User searches {string} in Wiki search")
    public void userSearchesInWikiSearch(String key) {
        wikiPage.searchbox.sendKeys(key+ Keys.ENTER);

    }

    @Then("User should be able to see {string} in wiki title")
    public void user_should_be_able_to_see_in_wiki_title(String key) throws Exception{
        Thread.sleep(2000);
String actual=Driver09.getDriver().getTitle();
        Assert.assertTrue(actual.contains(key));
    }


    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String key) {
        String actualHeadertext=wikiPage.mainHeaderAfterSearch.getText();

                Assert.assertEquals(actualHeadertext,key);
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expected) {
        String actualheader=wikiPage.imageHeaderAfterSearch.getText();
        Assert.assertEquals(actualheader,expected);
    }
}
