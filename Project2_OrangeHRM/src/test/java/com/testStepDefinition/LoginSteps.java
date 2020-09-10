package com.testStepDefinition;

import com.baseClass.Library;
import com.pages.LogInPages;
import com.seleniumreUsableFunction.seleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Library {
	LogInPages lpage;
	seleniumUtility su;
	
	@Given("To Launch the browser and navigate to the URL")
	public void to_Launch_the_browser_and_navigate_to_the_URL() {
		browserSetUp();
		logger.info("Browser launced and navigate to url");
		}
	
	@When("Enter username and password")
	public void enter_username_and_password() {
		lpage=new LogInPages(driver);
		lpage.login(properties.getProperty("userName"),properties.getProperty("password"));
		//lpage.login("Admin", "admin123");
		logger.info("Enter Uname & Password Seccessful");
	}

	@Then("Cllick submit button")
	public void cllick_submit_button() {
		lpage.loginButtonClick();
		logger.info("Login Seccessful");


	}
	
	@Then("Get the page title and screen shot")
	public void get_the_page_title_and_screen_shot() {
		 su= new seleniumUtility(driver);
			//su.getTitle1();
			su.to_take_screenshot("src/test/resources/screenshots/cucumbers.png");
			logger.info("Screen shot successfull");
			tearDown(); 

	}


}
