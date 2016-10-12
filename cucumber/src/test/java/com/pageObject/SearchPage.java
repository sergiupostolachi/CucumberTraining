package com.pageObject;

import com.step_definitions.SearchResultsPageStepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by P3700522 on 10/10/2016.
 */
public class SearchPage extends AbstractPage{

	@FindBy(xpath = ".//*[@id='search_text']")
	WebElement inputBox;

	@FindBy(xpath = ".//*[@id='searchform']/select")
	WebElement searchFilter;

	@FindBy(xpath = ".//*[@id='searchform']/input[3]")
	WebElement searchButton;

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public SearchPage fillSearchInputField(String value){
		inputBox.sendKeys(value);
		return this;
	}

	public SearchPage selectDropDownSearchFilter(String selectOption){
//	public void selectDropDownSearchFilter(String selectOption){
		Select dropdown = new Select(searchFilter);
		dropdown.selectByVisibleText(selectOption);
		return this;
	}

	public SearchResultsPage performSearching(){
		searchButton.click();
		return new PageFactory().initElements(driver, SearchResultsPage.class);
	}
}
