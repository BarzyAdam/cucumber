package com.cybertek.step_definition;

import com.cybertek.pages.EtsaySearchPage;
import com.cybertek.utilities.Driver09;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinition {

    EtsaySearchPage etsaySearchPage=new EtsaySearchPage();

    @Given("User is on the Etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver09.getDriver().get("https://www.etsy.com");
    }




    @Then("User should see title is as expected")
    public void user_should_see_title_is_as_expected() {

        String actualTitle = Driver09.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @When("User searches {string} in the search box")
    public void userSearchesInTheSearchBox(String searchThing) {
        etsaySearchPage.searchBox.sendKeys(searchThing);
    }


    @And("User clicks to search button")
    public void userClicksToSearchButton() {
        etsaySearchPage.searchButton.click();
    }

    @Then("User should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String expectedTitle) {
        String actualTitle=Driver09.getDriver().getTitle();
        Assert.assertTrue(actualTitle.toLowerCase().contains(expectedTitle));

    }
}
