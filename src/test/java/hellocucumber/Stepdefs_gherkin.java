package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs_gherkin {
    @When("^the Maker starts a game$")
    public void the_Maker_starts_a_game() throws Exception {
    }

    @Then("^the Maker waits for a Breaker to join$")
    public void the_Maker_waits_for_a_Breaker_to_join() throws Exception {
    }

    @Given("^the Maker has started a game with the word \"([^\"]*)\"$")
    public void the_Maker_has_started_a_game_with_the_word(String arg1) throws Exception {
    }

    @When("^the Breaker joins the Maker's game$")
    public void the_Breaker_joins_the_Maker_s_game() throws Exception {
    }

    @Then("^the Breaker must guess a word with (\\d+) characters$")
    public void the_Breaker_must_guess_a_word_with_characters(int arg1) throws Exception {
    }


    @Given("^one thing$")
    public void one_thing() throws Exception {
    }

    @Given("^another thing$")
    public void another_thing() throws Exception {
    }

    @Given("^yet another thing$")
    public void yet_another_thing() throws Exception {
    }

    @When("^I open my eyes$")
    public void i_open_my_eyes() throws Exception {
    }

    @Then("^I should see something$")
    public void i_should_see_something() throws Exception {
    }

    @Then("^I shouldn't see something else$")
    public void i_shouldn_t_see_something_else() throws Exception {
    }
}
