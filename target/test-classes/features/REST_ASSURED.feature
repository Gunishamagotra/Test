Feature: Validate API Operations
@API
  Scenario: Post Place Id
    Given I make a post request
    Then Validate API returns "200" response code
    And Place Id is generated successfully