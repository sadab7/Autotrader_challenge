package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class ResultPage {
	WebDriver dr;

	public ResultPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void sizeOfResult() {

		int totalResults = dr.findElements(By.xpath("//*[@id=\"mountNode\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/div/div[2]/div")).size();
		System.out.println("Total Number of Result : "+ totalResults);
		

	}
	
	public void verifyResultPageTitle() {
		String title = dr.getTitle();
		Assert.assertEquals("BMW Convertibles for Sale in Alpharetta, GA 30004 - Autotrader", title);
	}
	
	public void assertAllResultBMW() {
		int totalResult = dr.findElements(By.xpath("//*[@id=\"mountNode\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/div/div[2]/div")).size();

		for (int i = 1; i < totalResult; i++) {
			String resultelement = dr.findElement(By.xpath("//*[@id=\"mountNode\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/div/div[2]/div[" + i + "]")).getText();
			if (resultelement.contains("BMW")) {
				System.out.println("It is a BMW Vehichle");
			}else {
				System.out.println("Not BMW car");
			}

		}
		
	}
	
	
	 

}
