package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs_background {
    @Given("^a global administrator named \"([^\"]*)\"$")
    public void a_global_administrator_named(String arg1) throws Exception {
        System.out.printf("BG: a_global_administrator_named:%s\n\n", arg1);
    }

    @Given("^a blog named \"([^\"]*)\"$")
    public void a_blog_named(String arg1) throws Exception {
        System.out.printf("BG: a_blog_named:%s\n\n", arg1);
    }

    @Given("^a customer named \"([^\"]*)\"$")
    public void a_customer_named(String arg1) throws Exception {
        System.out.printf("BG: a_customer_named:%s\n\n", arg1);
    }

    @Given("^a blog named \"([^\"]*)\" owned by \"([^\"]*)\"$")
    public void a_blog_named_owned_by(String arg1, String arg2) throws Exception {
        System.out.printf("BG: a_blog_named_owned_by:%s %s\n\n", arg1, arg2);
    }

    @Given("^I am logged in as Dr\\. Bill$")
    public void i_am_logged_in_as_Dr_Bill() throws Exception {
        System.out.println("i_am_logged_in_as_Dr_Bill\n");
    }

    @When("^I try to post to \"([^\"]*)\"$")
    public void i_try_to_post_to(String arg1) throws Exception {
        System.out.printf("i_try_to_post_to:%s\n\n", arg1);
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Exception {
    }

    @Given("^I am logged in as Greg$")
    public void i_am_logged_in_as_Greg() throws Exception {
    }
}
