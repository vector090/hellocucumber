package hellocucumber;

import java.util.List;

import cucumber.api.java.en.Given;

public class Stepdefs_API {

    //    @Given("^I have the following animals: cow, horse, sheep$")
    // Modify the expression by hand:
    @Given("^I have the following animals: (.*)")
    public void i_have_the_following_animals(List<String> animals) throws Exception {
        System.out.println("Got animals: " + animals);
    }
}
