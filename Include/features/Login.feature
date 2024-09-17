@Login
Feature: Login Feature
  
  As a user, I want to login to CMS Website
  so that I can make an appointment

  @valid
  Scenario: Login with a valid credential
    Given User navigate to CMS Login Page
    When User enter username valid
    And User enter password valid
    And User click button login
    Then User should be successfully logged in
