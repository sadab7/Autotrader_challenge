package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.AdvancedSearchPage;
import Pages.HomePage;
import Pages.ResultPage;
import Tests.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AutoTraderStepDefinition {
	
	BaseTest b;
	HomePage hp;
	AdvancedSearchPage asp;
	ResultPage rp;
	
	WebDriver dr;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		  b = new BaseTest();
		  b.openBrowser();
	}

	@Then("^navigate to URL$")
	public void navigate_to_URL() throws Throwable {
		 hp =  b.navigateToUrl();
	}
	
//	@Given("^User is on the homepage of Autotrader$")
//	public void user_is_on_the_homepage_of_Autotrader() throws Throwable {
//		hp.verifyHomePageURL();
//	}
//
//	@When("^Title of the homepage is New Cars, Used Cars - Find Cars for Sale and Reviews at Autotrader$")
//	public void title_of_the_homepage_is_New_Cars_Used_Cars_Find_Cars_for_Sale_and_Reviews_at_Autotrader() throws Throwable {
//		hp.verifyHomePageTitle();
//	}

	@Then("^Verify all the links are present$")
	public void verify_all_the_links_are_present() throws Throwable {
		 hp.verifyBrosweByMake();
		 hp.verifyBroseByStyle();
		 hp.verifyAdvanceSearch();
	}

	@Then("^Verify Search button is present$")
	public void verify_Search_button_is_present() throws Throwable {
		 hp.verifySearchButton();
	}

	@Then("^Verify Drop-Downs are present$")
	public void verify_Drop_Downs_are_present() throws Throwable {
		 hp.verifyDropDownMake();
		 hp.verifyDrowpDownModel();
	}

	@Then("^Click on Advanced Search$")
	public void click_on_Advanced_Search() throws Throwable {
		asp = hp.clickOnAdvanceSearch();
	}

//	@When("^Title of the Advanced Search page is Search for Cars For Sale Online - Find a Car at Autotrader$")
//	public void title_of_the_Advanced_Search_page_is_Search_for_Cars_For_Sale_Online_Find_a_Car_at_Autotrader() throws Throwable {
//		asp.verifyASPTitle();
//	}

	@Then("^User enters zipcode$")
	public void user_enters_zipcode() throws Throwable {
		asp.enterZipCode();
	}

	@Then("^User selects Certified option under Condition$")
	public void user_selects_Certified_option_under_Condition() throws Throwable {
		asp.selectCondition();
	}

	@Then("^User selects Convertible option under Style$")
	public void user_selects_Convertible_option_under_Style() throws Throwable {
		asp.selectStyle();
	}

	@Then("^User sets the desired from and to years under Years$")
	public void user_sets_the_desired_from_and_to_years_under_Years() throws Throwable {
		asp.selectYearFrom();
		asp.selectYearTo();
	}

	@Then("^User selects the make of the car under Make, Model & Trim$")
	public void user_selects_the_make_of_the_car_under_Make_Model_Trim() throws Throwable {
		asp.selectMake();
	}

	@Then("^User clicks on the Search button$")
	public void user_clicks_on_the_Search_button() throws Throwable {
		rp = asp.clickOnSearch();
	}

	@When("^Title of the Result page is BMW Convertibles for Sale in Alpharetta, GA (\\d+) - Autotrader$")
	public void title_of_the_Result_page_is_BMW_Convertibles_for_Sale_in_Alpharetta_GA_Autotrader(int arg1) throws Throwable {
	    rp.verifyResultPageTitle();
	}

	@Then("^Assert that user only sees BMW cars$")
	public void assert_that_user_only_sees_BMW_cars() throws Throwable {
	    rp.assertAllResultBMW();
	}

	@Then("^log total number of cars$")
	public void log_total_number_of_cars() throws Throwable {
	   rp.sizeOfResult();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    b.closeBrowser();
	}

}
