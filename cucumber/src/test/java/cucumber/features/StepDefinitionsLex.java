package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/27/2016.
 */
public class StepDefinitionsLex {

	WebDriver driver = null;

	@Given("^I navigate to lex site$")
	public void shouldNavigateToLexShop() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.lexshop.ro/");
	}

	@When("^I access Deteriorate page$")
	public void shouldAccessDeterioratePage() throws Throwable {
		WebElement deteriorateLink = driver.findElement(By.xpath(".//*/a[@href='/deteriorate.html']"));
		deteriorateLink.click();
	}

	@Then("^I verify the Sequence item$")
	public void checkTheExistenceOfSequenceGame() throws Throwable {
		WebElement sequence = driver.findElement(By.xpath(".//*/img[@title='sequence a']"));
		assertTrue("The Sequence product is not displayed", sequence.isDisplayed());
		driver.close();
	}

}
