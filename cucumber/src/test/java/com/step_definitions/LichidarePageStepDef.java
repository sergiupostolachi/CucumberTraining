package com.step_definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/28/2016.
 */
public class LichidarePageStepDef extends WebdriverFactory {

	WebDriver driver = getDriver();

	@Then("^I verify the filter \"([^\"]*)\"$")
	public void checkTheExistenceOfFilter(String filter) throws Throwable {
		WebElement filterElement = getDriver().findElement(By.xpath(filter));
		assertTrue("The element is not displayed", filterElement.isDisplayed());
	}

}
