package hellocucumber;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class Stepdefs2 {
    int had;
    int have;

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int had) throws Exception {
        this.had = had;
    }

    @When("^I eat (\\d+)$")
    public void i_eat(int eat) throws Exception {
        this.had += eat;
        //        this.had += 1; // Simulate failure
    }

    @Then("^I should have (\\d+) cukes in my belly$")
    public void i_should_have_cukes_in_my_belly(int shouldHave) throws Exception {
        assertEquals(shouldHave, had);
    }


    Map<String, Integer> colorCounts = new HashMap<String, Integer>();

    @Given("^I have (\\d+) \"([^\"]*)\" balls$")
    public void i_have_balls(int count, String color) throws Exception {
        colorCounts.put(color, count);
    }

    @When("^I get (\\d+) \"([^\"]*)\" ball$")
    public void i_get_ball(int count, String color) throws Exception {
        Integer oldCount = colorCounts.get(color);
        if (null == oldCount) {
            oldCount = 0;
        }
        //        oldCount = 1; // Simulate failure
        colorCounts.put(color, oldCount + count);
    }

    @Then("^I should have (\\d+) \"([^\"]*)\" balls$")
    public void i_should_have_balls(int count, String color) throws Exception {
        assertEquals(Integer.valueOf(count), colorCounts.get(color));
    }
}
