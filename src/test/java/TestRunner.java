import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by udit on 16/09/18.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
        glue = {"FanPassStepDefs"},
        plugin = { "html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt"}
)
public class TestRunner {
}
