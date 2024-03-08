Feature: Bank account

  Scenario Outline: Account overdrawn status
    Given the account has a balance of <balance>
    When the account holder checks if the account is overdrawn
    Then the account should be overdrawn
    Examples:
      | balance |
      | -50.00  |