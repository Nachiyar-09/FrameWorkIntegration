Feature: To verify directory page related features

  Background:
    Given User launches to the application
      |username|password|
      |Admin   |admin123|
  Scenario:
    Given user click on directory header option that is available
    When  User enter name in the search directory as 'Cecil Bonaparte'
    And   click on search button
    Then  User should able to see correct match of the name that is searched as 'Cecil Bonaparte'
