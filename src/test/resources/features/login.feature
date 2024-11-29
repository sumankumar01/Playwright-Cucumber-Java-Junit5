Feature: Verify the login Functionality

  @smoke
  Scenario Outline: I want to login orange hrm
    Given I am on the orangehrm sites "url"
    When I enter "<username>" as a userName to login
    When I enter "<password>" as a password to login
    Then I verify home page

    Examples:
      | username     | password       |
      | admin        | admin123       |