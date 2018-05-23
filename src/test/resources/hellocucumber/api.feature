Feature: cucumber API

  Scenario: data table using list
    Given I have the following animals: cow, horse, sheep

  Scenario: data table using table
    Given I have the following friends:
      | cat   |
      | dog   |
      | mouse |

  Scenario: data table using table, and auto conversion
    Given I have the following livings:
      | cat   |
      | dog   |
      | mouse |
