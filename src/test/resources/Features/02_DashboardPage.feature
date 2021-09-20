Feature: To verify all objects present in the dashboard page and its related functionality

  Background:
    Given User launches to the application
      |username|password|
      |Admin|admin123|

  #@LogoutFunctionality
 # Scenario: To check the logout button behaviour
      #Given  User is on the dashboard page
    #  When   User clicks on the Logout option
     # Then   User should navigate back to login page with panel name as "LOGIN Panel"

    @HeaderSection
  Scenario: To verify all header options availability
      Given  User is on the dashboard page
      When   User checks for all below header options availability
      |Admin|
      |PIM|
      |Leave|
      |Time|
      |Recruitment|
      |My Info|
      |Performance|
      |Dashboard|
      |Directory|
      |Maintenance|
      |Buzz       |
     Then Header section should have count of 11

