Feature: Create new adress

  Scenario: Login and create new Adress
    Given Login with early createt user
    When In User profile add new adress
    And Add user Information <alias>, <address>, <city>, <postCode>, <country>, <phone>
    Then User delete earlier adress
    And Close browser


    Examples:
    | alias     | adress        | city  | postCode | country        | phone           |
    | detective | Bakers Street | London| W1U-8ED  | United Kingdom | +44 555 555 555 |



