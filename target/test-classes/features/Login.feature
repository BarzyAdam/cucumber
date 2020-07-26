@login @loginwithbackground                #you are able to use more than one tag and you can use tag for ustory also
Feature: login feature

  NFG-112 Agile story:As a user, I should be able to login with correct credentials to different accounts.
  .And dashboard should be displayed.
  Accounts are: librarian, student, admin
#that NFG-112 its just random number its number you will have it in future for your story

#if you wanna create as a group you can use @ and write any name you want
  #but how we run it?
  # we gonna copy that,then we gonna go to CukesRunner then we gonna create like that -> tags="@librarian"

  Background: User is on the login page
    Given User is on the login page
    #background is just like beforemethod it gonna run anything you want before every scenarios


  @librarian @employee
  Scenario: Librarian login scenario
  #  Given User is on the login page
    When user logs in as librarian
    Then User should see dashboard
#you can have more When before then,but it should be finish with Then
  #after running we gonna se print just like we stored here ,like if we gonna change Then position it gonna change
  #but if we change the position in the LibraryLoginStepDe it not gonna change ,

  @student
  Scenario: Student login scenario
    #Given User is on the login page
    When User logs in as student
    Then User should see dashboard

    @db
      #@Before gonna run here
      #Beforestep gonna run before all lines
    Scenario: Admin login scenario
     #beforestep runs here

      When User logs in as admin
      #AFTERSTEP is runs here
      #beforestep runs here
      Then User should see dashboard
#@After anotation gonna run here
