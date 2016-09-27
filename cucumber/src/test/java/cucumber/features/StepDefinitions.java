package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by P3700522 on 9/27/2016.
 */
public class StepDefinitions {

	@When("^I click on the adoption link$")
	public void shouldClickOnAdoption() throws Throwable {
		System.out.println("Expected to click on adoption link");
	}

	@Then("^I check to see that no animals are available$")
	public void checkAnimalStringAvailable() throws Throwable {
		System.out.println("Checked that no animals are available");
	}
}
