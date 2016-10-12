package com.step_definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by P3700522 on 9/28/2016.
 */
public class DeterioratePageStepDef extends WebdriverFactory {



	@Then("^I verify the \"([^\"]*)\" item$")
	public void checkTheExistenceOfItem(String item) throws Throwable {
		WebElement product = getDriver().findElement(By.xpath(item));
		assertTrue("The Sequence product is not displayed", product.isDisplayed());
	}

}
