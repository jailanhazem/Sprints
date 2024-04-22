@smoke
Feature: Check that users can add items to the shopping cart.
  Scenario: adding a random product to the cart
    Given Open the browser and select random product
    And click add to cart button
    And open the cart icon
    And click view cart
    Then verify the product appears in the cart