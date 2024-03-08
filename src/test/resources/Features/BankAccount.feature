Feature: Bank account

  Scenario Outline: Account overdrawn status
    Given the account has a balance of <balance>
    When the account holder checks if the account is overdrawn
    Then the account should be overdrawn
    Examples:
      | balance |
      | -50.00  |

  Scenario Outline: Account is not overdrawn status
    Given the account has a balance of <balance>
    When the account holder checks if the account is overdrawn
    Then the account should not be overdrawn
    Examples:
      | balance |
      | 10.00   |

  Scenario Outline: Check if owner of account is major
    Given the account has an owner whose name is <name> and has an age of <age>
    When the bank checks if the owner is major
    Then the owner should be major
    Examples:
      | name | age |
      | "Manel" | 65 |
