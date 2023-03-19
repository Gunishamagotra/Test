@ContactUs
Feature: WebDriver University - Contact Us Page

  Scenario: Validate Successful Submission
    Given I access the webdriver university contact us page
    When I enter a first name
    And I enter a last name
    And I enter an email address
    And I enter a comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message "Thank You for your Message!"


  Scenario: Validate Successful Submission
    Given User makes an api call for Contact_US
    Then User should success response 200 status code