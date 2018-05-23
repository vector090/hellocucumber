package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
}

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @Given("^today is Sunday$")
    public void today_is_Sunday() throws Exception {
        this.today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() throws Exception {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) throws Exception {
        assertEquals(expectedAnswer, actualAnswer);
    }
}