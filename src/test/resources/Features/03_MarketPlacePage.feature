Feature: To verify all functionalities related to MarketPlace
  Background:
    Given User is on the dashboard page

  @MarketPlace
    Scenario: MarketPlace page under test
    When   User click on Marketplace button
    And    User checks URL for verifying MarketPlace page through Keyword 'marketPlace'
    Then   User checks for the Addons title as 'OrangeHRM Addons'
