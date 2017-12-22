import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty" },
        features = { "src/test/resources/features" },
        glue = { "stepDefinitions" },
        tags = { "@smoke" },
        plugin = { "json:target/Reports/SmokeTest.json", "html:target/Reports/SmokeTestReport.html"}
)
public class SmokeTest{
}