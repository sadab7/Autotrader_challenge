package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.Helper;
import junit.framework.Assert;


public class AdvancedSearchPage {
	
	@FindBy(xpath = "//input[@name='zip']") WebElement zipCode;
	@FindBy(xpath = "//div[text()='Certified']") WebElement clickOnCertified;
	@FindBy(xpath = "//div[text()='Convertible']") WebElement clickOnConvertible;
	@FindBy(xpath = "//select[@id='4101482096']") WebElement selectYearFrom;
	@FindBy(xpath = "//select[@id='258002540']") WebElement selectYearTo;
	@FindBy(xpath = "//select[@id='1970425032']") WebElement selectBMW;
	@FindBy(xpath = "//button[@type='submit']") WebElement clickOnSearch;
	
	public WebDriver dr;
	WebElement ele;
	
	
	public AdvancedSearchPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void verifyASPTitle() {
		String title = dr.getTitle();
		Assert.assertEquals("Search for Cars For Sale Online - Find a Car at Autotrader", title);
	}
	
	public void enterZipCode() {
		Helper.type(zipCode, "30004");
	}
	
	public void selectCondition() {
		Helper.click(clickOnCertified);
	}
	
	public void selectStyle() {
		Helper.click(clickOnConvertible);
	}
	
	public void selectYearFrom() {
		Select slt=new Select(selectYearFrom);
		slt.selectByIndex(37);
		
	}
	
	public void selectYearTo() {
		Select slt= new Select(selectYearTo);
		slt.selectByIndex(4);
	}
	
	public void selectMake() {
		Select slt = new Select(selectBMW);
		slt.deselectByIndex(8);
	}
	
	public ResultPage clickOnSearch() {
		Helper.click(clickOnSearch);
		return new ResultPage(dr);
	}

}
