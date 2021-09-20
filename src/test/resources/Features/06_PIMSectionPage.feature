Feature: To verify the PIM Header options functionality

  Background:
    Given User is on the dashboard page
    When  User clicks on the PIM header option available
    When  User clicks on the Configuration option available under PIM

  @OptionalConfigure
  Scenario: PIM header option under test
    When  User clicks on the Optional Configure option
    And   User clicks on the Edit button that is available in the page
    Then  User can hit the Save button once all changes are done

  @CustomFields
  Scenario: Custom Field page under test
    When User select on custom fields option from drop down
    And  User should enter Field name as 'Optional'
    And  User selects the screen type as 'Dependents'
    And  User selects the type as 'Drop Down'
    Then User click on the Save

  @AddDataImport
  Scenario: Data Import functionality under test
    When User clicks on the Data import drop down option
    And  User upload file using Choose File button
    Then User click on the Upload Button

  @ReportingMethod
  Scenario: Reporting Method page under test
    When User click on the Reporting method link
    And  User click on add button
    And  User enters name in the provided field value as 'Niranjan'
    Then User click on the Save option

  @TerminationReasons
  Scenario: Termination Page under test
    When User clicks on the Termination link from drop down
    And  User click on ADD button available in that page
    And  User enter name in the field provided as 'Maternity'
    Then User click on the Save button