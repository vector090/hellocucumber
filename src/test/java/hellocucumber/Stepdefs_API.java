package hellocucumber;

import org.junit.BeforeClass;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Stepdefs_API {

    @Before
    // This "Before" is just like junit's "Before".
    // And it affects ALL scenarios, not only those related to this Stepdefs.
    //
    // The recommended approach to clean a database between scenarios is to use a Before hook to remove all data before a scenario starts.
    public void doSomethingBefore() {
        System.out.println(" >> This is something done BEFORE any scenarios are run.\n");
    }

    @BeforeClass
    public static void oneTimeInit() {
        System.out.println("This JUnit @BeforeClass is never run at all in cucumber");
    }

    @After
    //    public void doSomethingAfter() { // This signature works too.
    public void doSomethingAfter(Scenario s) {
        System.out.printf(" << This is something done AFTER any scenarios are run."
                        + "Scenario id:%s, lines:%s, name:%s, sourceTagNames:%s, status:%s, uri:%s \n\n",
                s.getId(), s.getLines(), s.getName(), s.getSourceTagNames(), s.getStatus(),
                s.getUri());
    }

    //    @Given("^I have the following animals: cow, horse, sheep$")
    // Modify the expression by hand:
    @Given("^I have the following animals: (.*)")
    public void i_have_the_following_animals(List<String> animals) throws Exception {
        System.out.printf("The Stepdefs got animals: %s\n\n", animals);
    }

    // This method signature is auto generated by cucumber
    @Given("^I have the following friends:$")
    public void i_have_the_following_friends(DataTable table) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<String> list = table.asList(String.class);
        System.out.printf("The Stepdefs got friends: %s\n\n", list);
    }

    @Given("^I have the following livings:$")
    // Modify the arg from DataTable to List by hand:
    public void i_have_the_following_livings(List<String> list) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        System.out.printf("The Stepdefs got livings: %s\n\n", list);
    }
}
