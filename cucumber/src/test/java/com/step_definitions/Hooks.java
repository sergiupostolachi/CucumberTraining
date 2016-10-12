package com.step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by P3700522 on 10/6/2016.
 */
public class Hooks {

	@Before
	public void setUp() {
		String baseUrl = "https://www.lexshop.ro/";
		WebdriverFactory.getDriver().get(baseUrl);
	}

	@After
	public void tearDown(){
		WebdriverFactory.quit();
	}
}
