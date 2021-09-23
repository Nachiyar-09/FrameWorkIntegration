Feature: To verify all scenarios with respect to Add users

  Background:
    Given User is on the dashboard page

  @AddNewUser
  Scenario Outline: Add user under test
    When  User clicks on the Admin link available on the header
    And   User verify the Page URL contains 'admin'
    And   User able to see user management option from drop down and click on it
    And   User from there able to see the users options and just click on it
    And   User select the user role as 'Admin'
    And   User should select name of the Employee as '<EmpName>' from auto suggestion and check for '<ErrorMessage>'
    And   User should provide the username as 'Rajana'
    And   User should select the status as 'Enabled' from the status dropdown
    And   User should enter value in password as 'Welcome@123'
    And   User should enter value in the confirm password as 'Welcome@123'
    Then  User should click on the save button
   Examples:
     | EmpName          | ErrorMessage           |
     |Linda Jane Anderson|                        |
     |Satya             | Employee does not exist|
