package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;

public class BaseTest {
	
	public WebDriver dr;

	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadab\\Downloads\\Bittech\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public HomePage navigateToUrl() {
		dr.get("https://www.autotrader.com/");
		return new HomePage(dr);
	}

	public void closeBrowser() {
		dr.quit();
	}

}
