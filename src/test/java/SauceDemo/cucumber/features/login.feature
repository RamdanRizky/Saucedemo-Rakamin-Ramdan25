Feature: Login page saucedemo

  @Regression @Possitive
  Scenario: Success checkout
    Given I am on the Saucedemo login page
    When I input username
    And I input password
    And Click login button
    Then I in on homepage saucedemo
    And I add a product to the cart
    And I Click to chart
    Then I Click checkout button
    When I insert firstname
    And I insert lastname
    And I insert Postalcode
    Then I Click continue button
    And I directed to overview page
    Then I Click continue finish
    And I directed to back to homepage


  @Regression @Negative
  Scenario: Failed Login
    Given I am on the Saucedemo login page
    When I input username
    And I input Invalid password
    And Click login button
    Then I get an error massage "Epic sadface: Username and password do not match any user in this service"