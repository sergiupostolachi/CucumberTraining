package runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/28/2016.
 */
public class SearchResultsPageStepDef extends WebdriverFactory {

	WebDriver driver = getDriver();

	@Then("^I verify the ([^\"]*) item$")
	public void checkTheExistenceOfItemOutline(String item) throws Throwable {
		WebElement product = WebdriverFactory.getDriver().findElement(By.xpath(item));
		assertTrue("The Sequence product is not displayed", product.isDisplayed());
	}

	@And("^I order the products by \"([^\"]*)\"$")
	public void i_order_the_products_by(String selectOption) throws Throwable {
		Select dropdown = new Select(WebdriverFactory.getDriver().findElement(By.xpath(".//*[@id='body']/section/div[4]/div[1]/form/div[1]/select")));
		dropdown.selectByVisibleText(selectOption);
	}

	@Then("^I filter products by \"([^\"]*)\"$")
	public void i_filter_products_by(String filterStoc) throws Throwable {
		WebElement inStoc = WebdriverFactory.getDriver().findElement(By.id(filterStoc));
		inStoc.click();
	}

}
