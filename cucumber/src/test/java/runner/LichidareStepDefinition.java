package runner;

import com.pageObject.LichidariPage;
import com.pageObject.TopMenuPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by P3700522 on 10/7/2016.
 */
public class LichidareStepDefinition {

	 WebDriver driver =  WebdriverFactory.getDriver();
	TopMenuPage topMenuPage;
	LichidariPage lichidariPage;

	@When("^I click on page <Lichidari>$")
	public void i_click_on_page_Lichidari() throws Throwable {
		topMenuPage = PageFactory.initElements(driver, LichidariPage.class);
		lichidariPage = topMenuPage.navigateToLichidariPage();
	}

	@Then("^I check the filter <Lichidate>$")
	public void i_check_the_filter_Lichidate() throws Throwable {
//		assertTrue("The element is not displayed",lichidariPage.lichidateFilter.isDisplayed());
	}

}
