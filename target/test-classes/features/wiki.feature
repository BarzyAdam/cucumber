Feature: Wiki title And search verification
  agile story:1.User is onWikipedia home page

  Background: user in the wiki home page
    Given User is on the home page


  Scenario: Search functionality title verification
    When User searches "Steve Jobs" in Wiki search
    Then User should be able to see "Steve Jobs" in wiki title


  Scenario: Search functionality header verification
    When User searches "Steve Jobs" in Wiki search
    Then User should see "Steve Jobs" in the main header

  @wiki
  Scenario Outline: Search functionality header verification
    When User searches "<searchValue>" in Wiki search
    * User should be able to see "<ExpectedTitle>" in wiki title
    * User should see "<ExpectedmainHeader>" in the main header
    * User should see "<ExpectedImageHeader>" in the image header

    Examples: example test data for wikipedia search
      | searchValue | ExpectedTitle | ExpectedmainHeader | ExpectedImageHeader |
      | Steve Jobs  | Steve Jobs    | Steve Jobs         | Steve Jobs          |
      | Bruce Lee    | Bruce Lee      | Bruce Lee           | Bruce Lee            |
      | Keanu Reeves | Keanu Reeves   | Keanu Reeves        | Keanu Reeves         |




