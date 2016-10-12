package com.step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by P3700522 on 9/27/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
//		glue = {""},
//		format = {"pretty", "html:target/cucumber-reports/REPORT1.html"},
		format = {"pretty", "json:target/cucumber-reports/REPORT1.json"},
//		features = "src/test/resources/features/search.feature",
		features = "src/test/resources/features",
//		tags = {"@Application, @Server"}
		tags = {"@background"}
//		glue = {"com.pure360.automation.testcases.ui.stepdefinition"},
//		plugin = {"pretty", "json:target/cucumber-reports/REPORT1.json"}
//		tags = {"@reports,@sms,@PRT-5917"}
)
public class CucumberRunner {

}
