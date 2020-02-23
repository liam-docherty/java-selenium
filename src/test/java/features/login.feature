Feature: Login

  Basic login functionality

  Background:
    Given I am on the Authentication page

    Scenario: Successful login
      When I submit valid credentials
      Then I am redirected to My Account
