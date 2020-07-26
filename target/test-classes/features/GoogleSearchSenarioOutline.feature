Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search page.

@scenarioOutline
  Scenario Outline: Google title verification after search
    Given User is on the google search page
    When User search "<searchvalue>"
    Then User should see "<expectetitle>" in the title

    Examples:
    |searchvalue|expectetitle|
      | apple  | apple  |
      | kiwi   | Kiwi   |
      | orange | Orange |
      | banan  | Banana |