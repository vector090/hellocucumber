package hellocucumber.defsInPkg;

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("^A step in a separate package$")
    public void a_step_in_a_separate_package() throws Exception {
        System.out.println("a_step_in_a_separate_package\n");
    }
}
