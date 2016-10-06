package runner;

import cucumber.api.java.After;

/**
 * Created by P3700522 on 10/6/2016.
 */
public class Hooks {

	@After
	public void tearDown(){
		WebdriverFactory.quit();
	}
}
