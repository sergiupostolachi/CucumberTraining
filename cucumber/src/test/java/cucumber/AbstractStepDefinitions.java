package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by P3700522 on 9/29/2016.
 */
public class AbstractStepDefinitions {

	protected WebDriver driver;

	public AbstractStepDefinitions(){
		this.driver = new FirefoxDriver();
	}

}

