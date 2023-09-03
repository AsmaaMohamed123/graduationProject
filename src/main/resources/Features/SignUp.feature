@smoke
Feature: signUp:the guest user can creat anew valid account
  Background:
    Given The user clicks on Register

  Scenario: valid sign up:the user create a valid account
    When user selects gender
    And  user enter first and last name and select date of birth
    And user enter "eman@gmail.com"
    And User enters company name
    And Newsletter is selected
    And User enter passwords and confirms it
    And user click the register button
    Then New account is created