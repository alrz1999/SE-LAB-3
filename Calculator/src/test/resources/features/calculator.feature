@tag
Feature: Calculator
  Scenario: operator result on two numbers
    Given Two input values, 4 and 2. Operator is *
    When I perform operator on the two values
    Then I expect the result 8

  Scenario: operator result on two numbers
    Given Two input values, 4 and 2. Operator is /
    When I perform operator on the two values
    Then I expect the result 2

  Scenario: operator result on two numbers
    Given Two input values, 4 and 2. Operator is ^
    When I perform operator on the two values
    Then I expect the result 16


  Scenario Outline: operator result on two numbers
    Given Two input values, <first> and <second>. Operator is <operator>
    When I perform operator on the two values
    Then I expect the result <result>

    Examples:
      | first | second | operator | result |
      | 6     | 2      | *        | 12     |
      | 6     | 2      | /        | 3      |
      | 6     | 2      | ^        | 36     |
      | 3     | 3      | *        | 9      |
      | -2    | 2      | *        | -4     |
      | -2    | 2      | ^        | 4      |
      | -2    | 2      | /        | -1     |
      | -2    | 0      | /        | 11     |
      | 0     | 0      | /        | 13     |
      | 15    | 0      | /        | 0      |
      | 0     | 0      | ^        | 1      |
      | -4    | -3     | ^        |  5     |



