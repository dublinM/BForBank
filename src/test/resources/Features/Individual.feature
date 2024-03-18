Feature: Individual Class

  Scenario Outline: Create Individual with Name
    Given I have an individual named <name>
    Then the name should be <name>
    Examples:
      | name |
      |"Manel" |

  Scenario Outline: Create Individual with Name and Age
    Given I have an individual named <name> with age <age>
    Then the name should be <name>
    And the age should be <age>
    Examples:
      | name | age |
      |"Nico" | 25 |


  Scenario Outline: Update Individual Name
    Given I have an individual named <name>
    When I update the name to <newName>
    Then the name should be renamed with the <newName>
    Examples:
      | name | newName |
      | "Lewis" | "Max" |