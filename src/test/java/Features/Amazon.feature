Feature: Amazon.com

  Scenario: Amazon.com Adding product to the basket
    Given Go to homepage of Amazon.com website
    When Click the search text box
    When Specify the product's name
    When Click the magnifying glass icon to search the product
    When Filter for Customer Reviews four stars and up
    When Filter for Apple
    When Filter for Climate Pledge Friendly
    When Click the first product on the list
    When Add the product to the cart
    Then Check the cart page