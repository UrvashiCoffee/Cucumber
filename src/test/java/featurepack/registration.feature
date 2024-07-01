Feature: Registration
  I want to use this template for my feature file


  Scenario: Registration of new customer
    Given I want to create an account for a new customer
    And use the account for shopping
    When I click on Sign In
    And I click on Create Account
    And I want to enter firstname and lastname
    And I want to give my email and password
    And I click on Create an Account
    Then I should have a new account created
    And it should show My Account Page on the screen

    