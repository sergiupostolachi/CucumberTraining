package cucumber.features;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/28/2016.
 */
public class StepDefinitionsWithParameter {

	WebDriver driver = null;

	@Given("^I navigate to lex site$")
	public void shouldNavigateToLexShop() throws Throwable {
		driver = new FirefoxDriver();
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

	@Then("^I verify the filter \"([^\"]*)\"$")
	public void checkTheExistenceOfFilter(String filter) throws Throwable {
		WebElement filterElement= driver.findElement(By.xpath(filter));
		assertTrue("The element is not displayed", filterElement.isDisplayed());
	}

	@And("^I close the browser$")
	public void closeBrowser() throws Throwable {
	}
}
