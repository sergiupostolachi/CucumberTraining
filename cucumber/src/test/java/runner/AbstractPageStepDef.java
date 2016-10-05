package runner;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by P3700522 on 10/5/2016.
 */
public class AbstractPageStepDef {

	protected static WebDriver driver;

	protected WebDriver getDriver() {
		if (driver == null){
			driver = new FirefoxDriver();
		}
		return driver;
	}


}


