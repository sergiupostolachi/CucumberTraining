package com.pageObject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by P3700522 on 10/7/2016.
 */
public class AbstractPage {

	protected static WebDriver driver;

	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}

}
