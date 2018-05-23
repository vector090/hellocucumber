package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class Stepdefs_scenarioOutline {

    int have;

    @Given("^there are (\\d+) cucumbers$")
    public void there_are_cucumbers(int have) throws Exception {
        this.have = have;
    }

    @When("^I eat (\\d+) cucumbers$")
    public void i_eat_cucumbers(int eat) throws Exception {
        this.have -= eat;
        //        this.have = 0; // Simulate failure
    }

    @Then("^I should have (\\d+) cucumbers$")
    public void i_should_have_cucumbers(int shouldHave) throws Exception {
        assertEquals(shouldHave, this.have);
    }
}
