Feature: Calculator

  Scenario: Sum of two numbers
    Given the calculator is open
    When I press "9"
    And I press "+"
    And I press "6"
    And I press "="
    Then the result should be "15"

  Scenario: Sum of two numbers
    Given the calculator is open
    When I press "9"
    And I press "+"
    And I press "6"
    And I press "="
    Then the result should be "15"
