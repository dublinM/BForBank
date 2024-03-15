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
      | "Kamelia" | 18 |

  Scenario Outline: Check if owner of account is not major
    Given the account has an owner whose name is <name> and has an age of <age>
    When the bank checks if the owner is major
    Then the owner should not be major
    Examples:
      | name | age |
      | "Manel" | 17 |
      | "Kamelia" | 15 |

    Scenario Outline: Owner of account buys some groceries
      Given the account of an owner who has <balance> in his bank account
      When the bank debit his account for an amount of <amount>
      Then the account should have less money in his bank account
      Examples:
        | balance | amount |
        | 2000    | 100    |

      Scenario Outline: Account is credited with a certain amount
        Given the owner of the account has an initial <balance>
        When he receives his salary the bank credit his account with a certain <amount>
        Then the account should have more money in his bank account
        Examples:
          | balance | amount |
          | 10      | 2500   |