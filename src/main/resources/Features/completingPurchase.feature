@smoke
Feature: completing purchase
  Scenario: check the process of purchasing
    Given Open the browser and select random product
    And click add to cart button
    And open the cart icon
    And click checkout
    And insert the mandatory fields
    And click the checkbox of terms and conditions
    And click place order
    Then check the pop-up message