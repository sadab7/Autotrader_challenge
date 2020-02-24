package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Helper;
import junit.framework.Assert;


public class HomePage {
	
	WebDriver dr;
	
	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath = "//div/span[contains(text(),'Browse by Make')]") WebElement browseBymake;
	@FindBy(xpath = "//div/span[contains(text(),'Browse by Style')]") WebElement browseByStyle;
	@FindBy(xpath = "//a[@data-qaid='adv_srch']") WebElement advanceSearch;
	@FindBy(xpath = "//select[@id='modelCodeListPlaceHolder']") WebElement anyMake;
	@FindBy(xpath = "//select[@id='makeCodeListPlaceHolder']") WebElement anyModel;
	@FindBy(xpath = "//button[@id='search']") WebElement searchButton;

	
	public void verifyHomePageURL() {
		String actURL = dr.getCurrentUrl();
		Assert.assertEquals("https://www.autotrader.com", actURL);
	}
	
	public void verifyHomePageTitle() {
		String title = dr.getTitle();
		Assert.assertEquals("New Cars, Used Cars - Find Cars for Sale and Reviews at Autotrader", title);
	}
	public void verifyBrosweByMake() {
		Helper.verifyAnyElement(browseBymake, "Browse By Make");
		
	}
	public void verifyBroseByStyle() {
		Helper.verifyAnyElement(browseByStyle, "Browse By Style");
		
	}
	
	public void verifyAdvanceSearch() {
		Helper.verifyAnyElement(advanceSearch, "Advance search");
		
	}
	
	public void verifyDropDownMake() {
		Helper.verifyAnyElement(anyMake, "Any Make");
	}
	
	public void verifyDrowpDownModel() {
		Helper.verifyAnyElement(anyModel, "Any Model");
	}
	
	public void verifySearchButton() {
		Helper.verifyAnyElement(searchButton, "Search Button");
	}
	
	public AdvancedSearchPage clickOnAdvanceSearch() {
		Helper.click(advanceSearch);
		return new AdvancedSearchPage(dr);
	}
	
	
	

}
