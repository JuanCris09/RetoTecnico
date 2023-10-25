Feature: Client wants to buy two articles
  Scenario: Select two articles for add to shoppping cart successfully
    Given Client wants two articles
    When Add to the shopping cart
    Then Client should be told that the buys was succesfully