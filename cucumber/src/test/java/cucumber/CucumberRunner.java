package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by P3700522 on 9/27/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target"},
		features = {"cucumber"}
)
public class CucumberRunner {
}
