package com.step_definitions;

import com.pageObject.SearchPage;
import com.pageObject.SearchResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by P3700522 on 10/10/2016.
 */
public class SearchResultsPageStepDefinition {

	WebDriver driver =  WebdriverFactory.getDriver();
	SearchPage searchPage;
	SearchResultsPage searchResultsPage;

	@When("^I type a product in search field \"([^\"]*)\"$")
	public void fillSearchInputBox(String value) throws Throwable {
		searchPage = new PageFactory().initElements(driver, SearchPage.class);
		searchPage.fillSearchInputField(value);
	}

	@And("^I click on search$")
	public void clickOnSearchButton() throws Throwable {
		searchResultsPage = searchPage.performSearching();
	}

	@Then("^I check for results \"([^\"]*)\"$")
	public void i_check_for_results(String value) throws Throwable {
		assertTrue("The number of search results is wrong", searchResultsPage.resultContainsNoOfProducts());
		assertTrue("the product is missing", searchResultsPage.resultContainsSearchedProduct(value));
	}
}
