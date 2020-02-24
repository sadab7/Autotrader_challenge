package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

public static WebDriver dr;
	
	public static void click(WebElement ele) {
		//waitForElement(ele).click();
		ele.click();
	}
	public static void type(WebElement ele, String value) {
//		waitForElement(ele).sendKeys(value);
		ele.sendKeys(value);
	}
	
	public static void verifyAnyElement(WebElement ele, String eleName) {
		if(ele.isDisplayed()) {
			System.out.println(eleName + " is displayed.");
		}else {
			System.out.println(eleName + " is not displayed.");
		}
		
		
	}
	
	public static WebElement waitForElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
}
