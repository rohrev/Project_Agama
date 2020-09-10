package com.testStepDefinition;

import com.baseClass.Library;
import com.pages.LogInPages;
import com.seleniumreUsableFunction.seleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataDriven extends Library {
	LogInPages lpage;
	seleniumUtility su;

	@Given("Launch the browser and navigate to the URL")
	public void launch_the_browser_and_navigate_to_the_URL() {
		browserSetUp();
		logger.info("Browser launced and navigate to url");
	}

	@When("Enter {string} and {string}")
	public void enter_and(String uName, String psw) {
		lpage = new LogInPages(driver);
		// lpage.login(properties.getProperty("userName"),properties.getProperty("password"));
		lpage.login(uName, psw);
		logger.info("Enter Uname & Password Seccessful");
	}

	@Then("Cllick submitt button")
	public void cllick_submitt_button() {
		lpage.loginButtonClick();
		logger.info("Login Seccessful");

	}
	

	@Then("Get the page title and Screenshot")
	public void get_the_page_title_and_Screenshot() {
		su = new seleniumUtility(driver);
		su.getTitle1();
		su.to_take_screenshot("src/test/resources/screenshots/.cucumbers.png");
		logger.info("Screen shot successfull");
		tearDown();
		System.out.println("Screen shot successfull");
	}

}
