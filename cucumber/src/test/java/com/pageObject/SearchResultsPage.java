package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by P3700522 on 10/10/2016.
 */
public class SearchResultsPage extends AbstractPage{
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='body']/section/div[4]/h3")
	WebElement headerResults;

	@FindAll({@FindBy (xpath = ".//div[2][@class='cele_mai_vandute no_mg']/div[contains(@class,'produs')]")})
	List<WebElement> searchedProducts;

	public String getHeaderText(){
		return headerResults.getText();
	}

	public int getSearchedProductsSize(){
		return searchedProducts.size();
	}

	public boolean resultContainsNoOfProducts(){
		return getHeaderText().contains(String.valueOf(getSearchedProductsSize()));
	}

	public boolean resultContainsSearchedProduct(String value){
		return getHeaderText().contains(value);
	}

}
