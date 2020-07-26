
@etsyAll
Feature: Etsy search feature
  Agile story: User should be able to enter search terms and see
  relevant results in the page and in the title.
Background:User is on the Etsy home page
  #the background part just name it doesnt apply anything ,tha apply paert is Given
  Given User is on the Etsy home page


  Scenario: Title verification

    Then User should see title is as expected

    #expected : Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
  @etsyWip
  Scenario: Title verification after search term
    When User searches "Banana" in the search box
    And User clicks to search button
    Then User should see "Banana" in the Etsy title
    #we have done pripretazation here by makes specification "wooden spoon"