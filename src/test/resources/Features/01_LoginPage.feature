Feature: To test all scenarios related to Login page of Orange HRM application


  @ValidLogin
  Scenario Outline: To check the application behaviour with valid credentials
    Given User navigates to the application
    When  User enter value of username as '<username>' and password as '<password>'
    Then  User should navigate to the application successfully and see the dashboard page
    Examples:
      | username | password |
      | Admin     | admin123|


  @InvalidLogin
  Scenario Outline: To check the application behaviour with invalid credentials
    Given User navigates to the application
    When  User enter value of username as '<username>' and password as '<password>'
    Then  User should able to see the error message as '<validationMessage>'
    Examples:
      |username |password |validationMessage |
      |admin    |admin    | Invalid credentials|
      |         |admin123 | Username cannot be empty |
      |Admin    |         | Password cannot be empty |
      |         |         | Username cannot be empty |


  @ForgotPassword
  Scenario: To verify the working of forgot password feature
    Given User navigates to the application
    When  User click on the ForgotPassword link available
    Then  User should be redirected to Forgot Password page