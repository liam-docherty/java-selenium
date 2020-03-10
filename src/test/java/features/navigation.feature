@Navigation
Feature: Navigation

  Navigation using the top menu

  Background:
    Given I am on the home page

  Scenario: Navigation menu contents
    When I hover over the women menu option
    Then a list of women's sub-categories should be displayed

  # TODO: Implement regular expression and change when to a given
  Scenario: Navigation to women's t-shirts
    Given I am on the home page
    When I hover over the women menu option
    And I select the women's t-shirts sub category
    Then I am redirected to women's t-shirts
