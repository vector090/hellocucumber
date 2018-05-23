package hellocucumber;

import cucumber.api.java.en.Given;

public class Stepdefs_tags {
    @Given("^hello$")
    public void hello() throws Exception {
        System.out.println("Hello\n");
    }
}
