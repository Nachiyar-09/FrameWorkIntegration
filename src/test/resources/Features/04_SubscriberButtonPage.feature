Feature: To verify the behaviour of subscribe options
  Background:
    Given User is on the dashboard page

  @ValidSubscriber
  Scenario: Subscribe option under test with valid data
    When  User clicks on the subscribe button available on the header
    And   User should provide value in the Name field as 'Lakshmi'
    And   User should provide value in the email field as 'Laksmi@example.com'
    And   user should click on the subscribe button
    Then  User should see the successful subscription as 'Successfully Subscribed'