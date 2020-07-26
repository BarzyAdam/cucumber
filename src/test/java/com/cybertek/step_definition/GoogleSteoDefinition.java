package com.cybertek.step_definition;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver09;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleSteoDefinition {
    GoogleSearchPage googleSearch01=new GoogleSearchPage();
    //first we just runned "CukesRunner.java from running package ,that things when it gave us we just copied it here
    //everythin from @Given till "io.cucumber.java.PendingException();"
    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        Driver09.getDriver().get("https://www.google.com");
    }


   // Some other steps were also undefined:

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
String actualtitle=Driver09.getDriver().getTitle();
String expectedtitle="Google";

//Assert.fail("My Cutom message from fail");//this line just for fail,for checking

        Assert.assertEquals("actual title doeas not match with expected title",actualtitle,expectedtitle);//the main diference between jUnit Assertion and testNG Assertion
        //all same just in tesNG message"" come at last but here come at first


    }

    @When("User search apple")
    public void userSearchApple() {


        //creating the page object


        //sending value into search box using page object
        googleSearch01.searchBox.sendKeys("apple", Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {

        String actualtitle=Driver09.getDriver().getTitle();
        Assert.assertTrue(actualtitle.contains("apple"));


    }

    @When("User search {string}")
    public void userSearch(String search) {
        //creating the page object


        //sending value into search box using page object
        googleSearch01.searchBox.sendKeys(search, Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String search) {
        String actualtitle=Driver09.getDriver().getTitle();
        Assert.assertTrue(actualtitle.contains(search));
    }

    @Then("User shoulf see about link")
    public void userShoulfSeeAboutLink() {

        Assert.assertTrue(googleSearch01.aboutLink.isDisplayed());
    }

    @And("User click to about link")
    public void userClickToAboutLink() {
        googleSearch01.aboutLink.click();
    }

    @Then("User should see title google -About Google,our culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {
        String expected="Google - About Google,our culture & Company News";
        String actual=Driver09.getDriver().getTitle();
        Assert.assertTrue(actual.equalsIgnoreCase(expected));
    }
    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String>linkList) {


        int expectedSize=linkList.size();//that one comes from our feature file that we created there
        int actual=googleSearch01.footerlinks.size();//that one comes form actual links
        Assert.assertEquals(actual,expectedSize);

    }

}
