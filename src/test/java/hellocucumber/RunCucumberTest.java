package hellocucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"}, tags = "@important") // Running with tag works.
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
}