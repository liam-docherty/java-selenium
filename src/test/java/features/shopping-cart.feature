@ShoppingCart
Feature: Shopping Cart

  Scenario: Alert message is displayed when the cart is empty
    Given I am on the shopping cart page
    And I have yet to add any items to my shopping cart
    Then an alert should be displayed stating: "Your shopping cart is empty."
