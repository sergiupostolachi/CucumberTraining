package cucumber.features;

import cucumber.AbstractStepDefinitions;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/28/2016.
 */
public class StepDefinitionsWithParameter extends AbstractStepDefinitions{

	@Before("@web")
	public void setUp(){
		this.driver = new FirefoxDriver();
	}

	@Given("^I navigate to lex site$")
	public void shouldNavigateToLexShop() throws Throwable {
		driver.navigate().to("https://www.lexshop.ro/");
	}

	@When("^I access \"([^\"]*)\"$")
	public void shouldClickOnLink(String link) throws Throwable {
		WebElement topMenuLink = driver.findElement(By.xpath(link));
		topMenuLink.click();
	}

	@Then("^I verify the \"([^\"]*)\" item$")
	public void checkTheExistenceOfItem(String item) throws Throwable {
		WebElement product = driver.findElement(By.xpath(item));
		assertTrue("The Sequence product is not displayed", product.isDisplayed());
	}

	@When("^I access on ([^\"]*)$")
	public void shouldClickOnLinkOutline(String link) throws Throwable {
		WebElement topMenuLink = driver.findElement(By.xpath(link));
		topMenuLink.click();
	}

	@Then("^I verify the ([^\"]*) item$")
	public void checkTheExistenceOfItemOutline(String item) throws Throwable {
		WebElement product = driver.findElement(By.xpath(item));
		assertTrue("The Sequence product is not displayed", product.isDisplayed());
	}

	@Then("^I verify the filter \"([^\"]*)\"$")
	public void checkTheExistenceOfFilter(String filter) throws Throwable {
		WebElement filterElement= driver.findElement(By.xpath(filter));
		assertTrue("The element is not displayed", filterElement.isDisplayed());
	}

	@When("^I type a product in search field$")
	public void shouldTypeASearchedProduct(DataTable dataTable) throws Throwable {
		System.out.println(dataTable);
		List<List<String>> data = dataTable.raw();
		WebElement searchBox = driver.findElement(By.xpath(".//*[@id='search_text']"));
		searchBox.sendKeys(data.get(1).get(1));
	}

	@And("^I search for a product$")
	public void shouldClickOnSearchButton() throws Throwable {
		WebElement searchButton= driver.findElement(By.xpath(".//*[@id='searchform']/input[3]"));
		searchButton.click();
	}

	@Then("^I check the results are in place$")
	public void checkTheSearchResults() throws Throwable {
		WebElement searchResultsHead= driver.findElement(By.xpath(".//*[@id='body']/section/div[4]/h3"));
		int numberOfResults = driver.findElements(By.xpath(".//*/div[2][@class='cele_mai_vandute no_mg']/div[contains(@class,'produs')]")).size();
		assertTrue("No results", searchResultsHead.getText().contains(String.valueOf(numberOfResults)));
	}

	@And("^I close the browser$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}
}
