@login
Feature: Order process


  Background: User should login seccussfuly
    Given User should login successfuly





  @order
  Scenario Outline: User should fill out the form
    When User is in the smartBear page as a Tester
    Then User is on WebOrder  page
    Then User in the Order page
    Then User selects "<product>" from product dropdown
    Then User enters "<quantity>" to quantity
    Then User enters "<costumerName>" to costumer name
    Then User enters "<Street>" to street
    Then  User enters "<City>" to city
    Then  User enters "<State>" to state
    Then User enters "<Zipcode>" as Zipcode
    Then User selects "visa" as card type
    Then User enters "<CardNumber>" to card number
  Then User enters "<ExpirationDate>" to expiration date
    Then User clicks process button


    Examples:
    |product|quantity|costumerName|Street|City|State|Zipcode|CardNumber|ExpirationDate|
    |FamilyAlbum|4   |John Wick   |Kinzie Ave|Chicago|IL|60056|1111222233334444|12/22 |


Scenario:  User verifies John Wick is in the list
  When User is on WebOrder  page
  Then User verifies "<name>" is in the list



