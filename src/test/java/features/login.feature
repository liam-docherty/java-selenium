@Login
Feature: Login

  Basic login functionality

  Background:
    Given I am on the Authentication page

  Scenario: Login form contents
    Then I should be presented with the option to login

  Scenario: Successful login redirects to My Account
    When I submit valid credentials
    Then I am redirected to My Account
