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
 * Created by P3700522 on 9/27/2016.
 */
public class StepDefinitionsLex {

	/*WebDriver driver = null;

	@Given("^I navigate to lex site$")
	public void shouldNavigateToLexShop() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.lexshop.ro/");
	}

	@When("^I access Deteriorate$")
	public void shouldAccessDeterioratePage() throws Throwable {
		WebElement deteriorateLink = driver.findElement(By.xpath("./*//*//*a[@href='/deteriorate.html']"));
		deteriorateLink.click();
	}

	@Then("^I verify the Sequence item$")
	public void checkTheExistenceOfSequenceGame() throws Throwable {
		WebElement sequence = driver.findElement(By.xpath("./*//*//*img[@title='sequence a']"));
		assertTrue("The Sequence product is not displayed", sequence.isDisplayed());
	}

	@And("^I verify the Bruges item$")
	public void checkTheExistenceOfBrugesGame() throws Throwable {
		WebElement bruges = driver.findElement(By.xpath("./*//*//*img[@title='bruges a']"));
		assertTrue("The Sequence product is not displayed", bruges.isDisplayed());
	}

	@And("^I verify the TicketToRide item$")
	public void checkTheExistenceOfTicketToRideGame() throws Throwable {
		WebElement ticket = driver.findElement(By.xpath("./*//*//*img[@title='ticket to ride anniversary']"));
		assertTrue("The Sequence product is not displayed", ticket.isDisplayed());
	}

	@When("^I access Lichidare$")
	public void shouldAccessLichidarePage() throws Throwable {
		WebElement lichidareLink = driver.findElement(By.xpath("./*//*//*a[@href='/lichidari.html']"));
		lichidareLink.click();
	}

	@Then("^I verify the Lichidare Stoc element$")
	public void verifyLichidareStocIsDisplayed() throws Throwable {
		WebElement lichidareStoc= driver.findElement(By.xpath(".//*//*img[@src='/app/images/buton-lichidate.png']"));
		assertTrue("The element is not displayed", lichidareStoc.isDisplayed());
	}

	@And("^I close the browser$")
	public void closeTheBrowser() throws Throwable {
		driver.close();
	}*/


}
