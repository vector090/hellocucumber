package hellocucumber;

import cucumber.api.java.en.Given;

public class Stepdefs_stepArgs {
    @Given("^a blog post named \"([^\"]*)\" with Markdown body$")
    public void a_blog_post_named_with_Markdown_body(String arg1, String arg2) throws Exception {
        System.out.printf("a_blog_post_named_with_Markdown_body:%s\n%s\n\n", arg1, arg2);
    }
}
