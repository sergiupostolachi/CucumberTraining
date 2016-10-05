package runner;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/28/2016.
 */
public class LichidarePageStepDef extends AbstractPageStepDef {

	WebDriver driver = getDriver();

	@Then("^I verify the filter \"([^\"]*)\"$")
	public void checkTheExistenceOfFilter(String filter) throws Throwable {
		WebElement filterElement= driver.findElement(By.xpath(filter));
		assertTrue("The element is not displayed", filterElement.isDisplayed());
	}

}
