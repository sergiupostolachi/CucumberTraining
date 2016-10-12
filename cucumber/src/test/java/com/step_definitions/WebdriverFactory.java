package com.step_definitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by P3700522 on 10/5/2016.
 */
public class WebdriverFactory {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null){
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void quit() {
		driver.quit();
		driver = null;
	}



}


