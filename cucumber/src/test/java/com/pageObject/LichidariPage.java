package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by P3700522 on 10/7/2016.
 */
public class LichidariPage extends TopMenuPage{

	public LichidariPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*/img[@src='/app/images/buton-lichidate.png']")
		WebElement lichidateFilter;


}
