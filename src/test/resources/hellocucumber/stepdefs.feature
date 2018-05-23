Feature: Test args

  Scenario: number arg
    Given I have 48 cukes in my belly
    When I eat 1
    Then I should have 49 cukes in my belly

  Scenario: number and color arg
    Given I have 3 "red" balls
    When I get 1 "red" ball
    Then I should have 4 "red" balls