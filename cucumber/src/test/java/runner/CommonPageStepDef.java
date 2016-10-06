package runner;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/28/2016.
 */
public class CommonPageStepDef {

	@Given("^I navigate to lex site$")
	public void shouldNavigateToLexShop() throws Throwable {
		WebdriverFactory.getDriver().navigate().to("https://www.lexshop.ro/");
	}

	@When("^I type a product in search field$")
	public void shouldTypeASearchedProduct(DataTable dataTable) throws Throwable {
		System.out.println(dataTable);
		List<List<String>> data = dataTable.raw();
		WebElement searchBox = WebdriverFactory.getDriver().findElement(By.xpath(".//*[@id='search_text']"));
		searchBox.sendKeys(data.get(1).get(1));
	}

	@And("^I search for a product$")
	public void shouldClickOnSearchButton() throws Throwable {
		WebElement searchButton= WebdriverFactory.getDriver().findElement(By.xpath(".//*[@id='searchform']/input[3]"));
		searchButton.click();
	}

	@Then("^I check the results are in place$")
	public void checkTheSearchResults() throws Throwable {
		WebElement searchResultsHead= WebdriverFactory.getDriver().findElement(By.xpath(".//*[@id='body']/section/div[4]/h3"));
		int numberOfResults = WebdriverFactory.getDriver().findElements(By.xpath(".//div[2][@class='cele_mai_vandute no_mg']/div[contains(@class,'produs')]")).size();
		System.out.println(numberOfResults);
		assertTrue("No results", searchResultsHead.getText().contains(String.valueOf(numberOfResults)));
	}

	@When("^I access on ([^\"]*)$")
	public void shouldClickOnLinkOutline(String link) throws Throwable {
		WebElement topMenuLink = WebdriverFactory.getDriver().findElement(By.xpath(link));
		topMenuLink.click();
	}

	@When("^I access \"([^\"]*)\"$")
	public void shouldClickOnLink(String link) throws Throwable {
		WebElement topMenuLink = WebdriverFactory.getDriver().findElement(By.xpath(link));
		topMenuLink.click();
	}
}
