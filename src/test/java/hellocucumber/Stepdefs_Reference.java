package hellocucumber;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;

public class Stepdefs_Reference {
    @Given("^the following users exist:$")
    public void the_following_users_exist(List<Map<String, String>> accounts) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        System.out.println("The Stepdefs got accounts:" + accounts);
        Map<String, String> acc = accounts.get(0);
        System.out.println("Account 1:" + acc);
    }
}
