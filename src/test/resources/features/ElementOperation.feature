Feature: Verify the functionalities element operation

  @smoke
  Scenario: Verify user able to add and remove the element
    Given user navigates to "url"
    When user clicks on "Add Elements" icon in main page
    And verify element got added
    And user clicks on "Delete Elements" icon in main page