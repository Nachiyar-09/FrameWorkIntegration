Feature: To verify the Leave Header options functionality

  Background:
    Given User is on the dashboard page
    Given User click on the Leave menu available in the Header section
    Then  User verifies the Page URl contains URL with Keyword 'leave'

    @ApplySubTab
    Scenario:To verify Apply tab tab under Leave
    When User click on the Apply tab under Leave module
    Then User should able to see message as 'No Leave Types with Leave Balance'

    @MyLeaveTab
    Scenario: To verify My Leave tab under leave
    When User click on My Leave tab under leave
    When user provide the From date as "2020-01-01"
    And  User click on Search button
    And  User select the action from the drop down as 'cancel'
    Then User click on save button in the page

    @EntitlementsTab
      # Add Entitlements page related features
    Scenario:To verify Entitlements tab under leave
    When User click on the Entitlements option available under Leave section
    When User click on Add Entitlements option from drop down
    And  User should click on the Add Multiple Employees check box
    #And  User enters employee name as 'Joe Root'
    And  User should select the Leave type as 'CAN - FMLA' from drop down
    And  User should select Leave period from '2022-01-01 - 2022-12-31'
    And  User should enter number with two decimal place in Entitlement as '0.50'
    Then user should switch to the frame available to click on confirm button

      #Employee Entitlements page related features
  Scenario: to verify Employee Entitlements page under entitlement
    When User click on the Entitlements option available under Leave section
    When user click on the Employee Entitlement from Entitlements drop  down
    And  user provides value of Employee as 'Jadine Jackie'
    And  User search the employee through Search button
    And  User click on ADD button
    Then User click on save button

    #My Leave Entitlement page related features
  Scenario: To verify Leave entitlement page under entitlement
    When User click on the Entitlements option available under Leave section
    When user click on the My Entitlement from Entitlements drop  down
    And  User select the leave period as '2020-01-01 - 2020-12-31'
    And  User click Search Button
    And User should verify whether Entitlement type displayed as 'Added'

    @Configure
    #Leave periods option
    Scenario: To verify leave periods option under configure
    When User click on the Configure option
    When user click on Leave Period drop down option
    And  USer click on Edit option
    And  User click on save button

    #Leave Types
  Scenario: To verify leave types option under configure
    When User click on the Configure option
    When User click on Leave Type from drop down
    And  User select the CAN - Matternity check box from listed types
    And  User click on delete button
    Then User switch to the confirmation box to confirm the delete action

    #Work Week Option
  Scenario: To verify Work Week option under configure
    When User click on the Configure option
    When user click on the Work Week option from drop down
    And  User hit on the Edit button that is available in the page
    And  User select Saturday as 'Half Day' of work from drop down
    Then  User save the work week

    @AssignLeave
    Scenario: To verify Assign leave under leave tab
    When user clicks on Assign Leave
    And  User enters the name 'Orange Test'
    And  User selects the Leave type as 'CAN - Vacation'
    And  User should enter date as "2021-09-25" in From Date
    And  User should enter date as "2021-10-10" in To date
    And  User hit on the Assign button
    Then User switch to confirmation box to confirm




