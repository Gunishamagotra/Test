Feature: ContactUs Page Flow

  @GM
  Scenario: Validate Successful flow
    Given User is on ContactUs Page
    When User enters unique first name
    And User enters unique last name
    And User enters unique email id
    And User enters comment
    And User clicks on submit button
    Then Verify that user gets successful submission message

@RM
    Scenario: Validate Successfull flow-Specific data
      Given User is on ContactUs Page
      When User enters specific first name "Gunisha"
      And User enters specific last name "sv"
      And User enters specific email id "Farzisv@gmail.com"
      And User enters specific comment "Welcome Back"
      And User clicks on submit button
      Then Verify that user gets successful submission message

