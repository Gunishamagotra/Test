@contact_us @Regression
Feature: ContactUs Page Flow
Background:
  Given User is on ContactUs Page

  Scenario: Validate Successful flow
    When User enters unique first name
    And User enters unique last name
    And User enters unique email id
    And User enters comment
    And User clicks on submit button
    Then Verify that user gets successful submission message

    Scenario: Validate Successfull flow-Specific data
      When User enters specific first name "Gunisha"
      And User enters specific last name "sv"
      And User enters specific email id "Farzisv@gmail.com"
      And User enters specific comment "Welcome Back"
      And User clicks on submit button
      Then Verify that user gets successful submission message
