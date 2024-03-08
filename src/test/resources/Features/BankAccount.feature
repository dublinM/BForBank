Feature: Bank account

  Scenario Outline: Account holder checks the balance
    Given the account has a balance of <balance>
    When the <owner> checks the <balance>
    Then the balance should be <balance>
    Examples:
      | balance | owner |
      | 100.00  |"Liza" |
      | 1400.00 |"Lola" |