package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by P3700522 on 10/7/2016.
 */
public class TopMenuPage extends AbstractPage {

	public TopMenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*/a[@href='/lichidari.html']")
	WebElement lichidari;

	@FindBy(xpath = ".//*/a[@href='/deteriorate.html']")
	WebElement deteriorate;


	public LichidariPage navigateToLichidariPage(){
		lichidari.click();
		return new LichidariPage(driver);
	}


	public DeterioratePage navigateToDeterioratePage(){
		deteriorate.click();
		return new DeterioratePage(driver);
	}
}
