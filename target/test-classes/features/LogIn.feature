@Login @Regression
Feature: Validate LogIn Scenarios
Background:
  Given Navigate to LogIn page

  Scenario: Validate successful Login
    When User enters Username "webdriver"
    And User enters Password "webdriver123"
    And User clicks on Login Button
    Then User gets successful message "validation succeeded"

    Scenario: Validate unsuccessful Login
    When User enters Username "webdriver"
      And User enters Password "wrong"
     And User clicks on Login Button
      Then User gets unsuccessful message "validation failed"

      @smoke @ignore
  Scenario Outline: Validate successful and unsuccessful Login
    When I enter the Username "<Username>"
    And I enter the Password "<Password>"
    And User clicks on Login Button
    Then User gets validation message "<validation_message>"
    Examples:
      | Username  | Password     | validation_message  |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | wrong        | validation failed    |
      | driver    | wrong        | validation failed    |





