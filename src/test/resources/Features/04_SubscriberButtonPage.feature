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
    
      @InvalidSubscriber
  Scenario Outline: To verify subscription wit invalid data
    When  User enter value of name as '<Name>' and email as '<Email>'
    Then  User should able to see the validation message as '<validationMessage>'
    Examples:
      | Name   | Email                | validationMessage                  |
      |        |                      | Required                           |
      |        | admin123@example.com | Required                           |
      | Admin  |                      | Required                           |
      | Suriya | naveen               | Expected format: admin@example.com |
