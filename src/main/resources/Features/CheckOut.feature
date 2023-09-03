@smoke
Feature: ChechOut the user add product to the cart
  Background:
    Given the user select product and click on add to cart

    Scenario: The order is confirmed and the user can navigate to order details

      When  The guest user navigate to the shopping cart
      And  The guest user agrees to the terms and conditions and click on the Check out button
      And user  enter First and Last name, Email, Company
      And The guest user select the country and state
      And The guest user add city and address details
      And The user adds Phone number and Fax and zip code
      And The user clicks on Continue
      And The user selects the shipping method and clicks on Continue
      And The user selects the payment method and clicks on Continue
      And The user add the payment method details
      And The guest user clicks on Confirm
      Then The order is confirmed and the user can navigate to order details

  Scenario: The order is confirmed and the user can navigate to order details

    When  The guest user navigate to the shopping cart
    And  The guest user agrees to the terms and conditions and click on the Check out button
    And user  enter First and Last name, Email, Company
    And The guest user select the country and state
    And The guest user add city and address details
    And The user adds Phone number and Fax and zip code
    And The user clicks on Continue
    And The user selects the shipping method and clicks on Continue
    And The user selects the payment method USING CREDIT CARd and clicks on Continue
    And The user add the payment method  using criedet card details
    And The guest user clicks on Confirm2
    Then The order is confirmed and the user can navigate to order2 details
