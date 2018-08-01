package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStorySteps {
    @Given("^I have a coworker who knows a lot about Cucumber$")
    public void i_have_a_coworker_who_knows_a_lot_about_Cucumber() throws Exception {
    }

    @When("^I ask my coworker to give an overview of how Cucumber works$")
    public void i_ask_my_coworker_to_give_an_overview_of_how_Cucumber_works() throws Exception {
    }

    @When("^I listen to their explanation$")
    public void i_listen_to_their_explanation() throws Exception {
    }

    @Then("^I should have a basic understanding of Cucumber$")
    public void i_should_have_a_basic_understanding_of_Cucumber() throws Exception {
    }

    @Given("^AGiven$")
    public void agiven() throws Exception {
    }

    @When("^AWhen$")
    public void awhen() throws Exception {
    }

    @Then("^AThen$")
    public void athen() throws Exception {
        System.out.println("Asserting 'then'");
    }
}
