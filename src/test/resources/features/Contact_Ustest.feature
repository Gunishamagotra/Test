Feature: ContactUs Page Flow

  Scenario: Validate Successful flow
    Given User is on ContactUs Page
    When User enters unique first name
    And User enters unique last name
    And User enters unique email id
    And User enetrs comment
    And User clicks on submit button
    Then Verify that user gets successful submission message
