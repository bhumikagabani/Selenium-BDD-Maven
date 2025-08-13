

Feature: Application Login

  Background:
    Given set up database

  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

#Parameterization test for different data set - Reusable code
  @smokeTest @NetBanking
  Scenario Outline: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed
    Examples:
      | Username	 | Password |
      | debituser |  hello12 |
      | crediuser |  lpo213  |

  @smokeTest @Mortgage
  Scenario: User Page default Sign up
    Given User is on Practice landing page
    When User signup into application
      |Bhumika|
      |Gabani|
      |Bhumi@gmail.com|
      |54355353|
    Then Home Page is displayed
    And Cards are displayed