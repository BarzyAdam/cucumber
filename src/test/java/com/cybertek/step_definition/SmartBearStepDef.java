package com.cybertek.step_definition;

import com.cybertek.pages.SmartBear;
import com.cybertek.utilities.Driver09;
import com.cybertek.utilities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDef {
    SmartBear smartBear=new SmartBear();
    Select select;

    @Given("User should login successfuly")
    public void user_should_login_successfuly() {
        Driver09.getDriver().get(configurationReader.getproperty("SmartBear"));
        smartBear.username.sendKeys(configurationReader.getproperty("smartBearUser"));
        smartBear.password.sendKeys(configurationReader.getproperty("smartBearpassword"));
        smartBear.submite.click();
    }

    @When("User is in the smartBear page as a Tester")
    public void user_is_in_the_smart_bear_page_as_a_tester() {
       String actualLogin=smartBear.loginInfo.getText();
        Assert.assertTrue("Login as Tester is fail",actualLogin.contains("Tester"));
    }
    @Then("User is on WebOrder  page")
    public void user_is_on_order_page() {
        String ExpectedPage="Web Orders";
        String ActualPage=smartBear.webPage.getText();
        Assert.assertEquals("Page Info it isnt Web Order",ActualPage,ExpectedPage);

    }


    @Then("User in the Order page")
    public void userInTheOrderPage() {
        smartBear.Order.click();
    }


    @Then("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String Key) {
select=new Select(smartBear.product);
select.selectByValue(Key);
    }

    @Then("User enters {string} to quantity")
    public void userEntersToQuantity(String key) {
        smartBear.quantity.clear();
        smartBear.quantity.sendKeys(key);
    }

    @Then("User enters {string} to costumer name")
    public void userEntersToCostumerName(String key) {
        smartBear.Name.sendKeys(key);
    }

    @Then("User enters {string} to street")
    public void userEntersToStreet(String key) {
        smartBear.street.sendKeys(key);
    }

    @Then("User enters {string} to city")
    public void userEntersToCity(String key) {
        smartBear.city.sendKeys(key);
    }

    @Then("User enters {string} to state")
    public void userEntersToState(String key) {
        smartBear.state.sendKeys(key);
    }

    @Then("User enters {string} as Zipcode")
    public void userEntersAsZipcode(String key) {
        smartBear.zip.sendKeys(key);
    }

    @Then("User selects {string} as card type")
    public void userSelectsAsCardType(String key) {
        smartBear.visa.click();

    }

    @Then("User enters {string} to card number")
    public void userEntersToCardNumber(String key) {
        smartBear.cardNumber.sendKeys(key);
    }

    @Then("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String key) {
        smartBear.Expiration.sendKeys(key);
    }

    @Then("User clicks process button")
    public void userClicksProcessButton() {
        smartBear.proceed.click();
    }



    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String name) {


            for (WebElement each : smartBear.names) {
                if(each.getText().equals(name)){
                    Assert.assertEquals(each.getText(),name);

                }
            }
    }
}
