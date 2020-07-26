Feature: Search
  Agile Story:As a user ,I should be able to search when iam on google search

  Background: :User is on the google search page
    Given User is on the google search page


  Scenario: Google default title verification
    Then User should see title is Google



    #@wip    #work in progress
  Scenario: google title verification after search
    When User search apple
    Then User should see apple in the title

       #MAC : OPTION + ENTER --> ALLOWS YOU TO GENERATE STEP DEFINITIONS
      #WINDOWS : ALT + ENTER --> ALLOWS YOU TO GENERATE STEP DEFINITIONS

  #anywhere you want to create step generation you can click it and Option+Enter it gives you ->create step defenition
  #->then choose that file that you want to create step definition inside it,we used here that one inside GoogleTepDe
  #that way its instead of runing geting error then copy,that way is short way

  @wip
  Scenario: google title verification after search
    When User search "peach"
    Then User should see "peach" in the title
    #if you put your thing in double coat it gonna give you different difinition
  #if you want to search for anything you should change only "inside here"


  Scenario: google -About- search page link title
    Then User shoulf see about link
    And User click to about link
    Then User should see title google -About Google,our culture & Company News

    @googleTable
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Setting          |
