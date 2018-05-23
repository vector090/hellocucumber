Feature: Demonstrates Gherkin Reference
  The word guess game is a turn-based game for two players.
  The Maker makes a word for the Breaker to guess. The game
  is over when the Breaker guesses the Maker's word.

  # The first example has two steps
  Scenario: Maker starts a game
  Some more description here.
    When the Maker starts a game
    Then the Maker waits for a Breaker to join

  # The second example has three steps
  Scenario: Breaker joins a game
    Given the Maker has started a game with the word "silky"
    When the Breaker joins the Maker's game
    Then the Breaker must guess a word with 5 characters
    # While it might be tempting to implement Then steps to just look in the database - resist that temptation!

  # Not work
#  Example: Multiple Givens
#    Given one thing
#    Given another thing
#    Given yet another thing
#    When I open my eyes
#    Then I should see something
#    Then I shouldn't see something else

  Scenario: : Multiple Givens
    Given one thing
    And another thing
    And yet another thing
    When I open my eyes
    Then I should see something
    But I shouldn't see something else
#    And I shouldn't see something else # This seems work too.

    # TODO Not work
#  Scenario Outline: some scenarios
#    Examples:
#    Example: hi
#    Given hello
