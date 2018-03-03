import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = {"src/test/resources/features"},
        glue = {"com.test.steps"}
)
public class RunCukes {
}
