package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by P3700522 on 9/27/2016.
 */
public class StepDefinitionsSecond {

	@Given("^I navigated to the zoo website$")
	public void shouldNavigateToZoo() throws Throwable {
		System.out.println("Expected to navigate to website");
	}

	@When("^I click on the about link$")
	public void shouldClickOnAbout() throws Throwable {
		System.out.println("Expected to click on about link");
	}
}
