package com.StepDefinition.Admin;

import org.testng.Assert;

import com.baseClass.Library;
import com.pages.LogInPages;
import com.pages.Admin.Job.Admin_Job_PayGrades_Pages;
import com.pages.Admin.Job.Admin_job_jobTitles_Page;
import com.seleniumreUsableFunction.seleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_Job_PayCard_SD extends Library {

	LogInPages lpage;// = new LogInPages(driver);
	seleniumUtility su;
	Admin_Job_PayGrades_Pages aj_payPage; // = new Admin_job_jobTitles_Page(driver);;

	@Given("Navigates to OrangeHRM")
	public void navigates_to_OrangeHRM() {
		browserSetUp();
		logger.info("Browser launced and navigate to url");
	}

	@Given("Validate the url")
	public void validate_the_url() {
		String actual_URL = driver.getCurrentUrl();
		Assert.assertEquals(actual_URL, "https://opensource-demo.orangehrmlive.com/", "Launched the incorrect url");

	}

	@When("Enter the  userNam and pwd")
	public void enter_the_userNam_and_pwd() {
		lpage = new LogInPages(driver);
		// lpage.login(properties.getProperty("userName"),properties.getProperty("password"));
		lpage.login("Admin", "admin123");

	}

	@When("click on the loginbutton")
	public void click_on_the_loginbutton() {
		lpage = new LogInPages(driver);
		lpage.loginButtonClick();
		logger.info("Login Successful");
	}

	@Then("Get the page title ,take Screenshot")
	public void get_the_page_title_take_Screenshot() {
		lpage = new LogInPages(driver);
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, "OrangeHRM", " NOt Successfully loggged");
	}

	@Then("Click   Admin tab")
	public void click_Admin_tab() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.adminClick();
		seleniumUtility.sleep();
		logger.info("Admin tab was clickedl");
	}

	@Then("click JobTab menu")
	public void click_JobTab_menu() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.a_JobClick();
		seleniumUtility.sleep();
		logger.info("job subtab clicked Seccessful");
	}	

	@Given("Click PayGrades menu")
	public void click_PayGrades_menu() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.jobtitleclick("//li[1]//ul[1]//li[2]//ul[1]/li", "Pay Grades");
		logger.info("job title from job subtab clicked  Seccessful");

	}
	@Then("click Add button at the buttom")
	public void click_Add_button_at_the_buttom() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.addclick();
	}	

	@Then("Enter PayGradesnamw")
	public void enter_PayGradesnamw() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.enter_PayGradesnamw("Something10");
		logger.info("Entered Pay Grade Successfully");

	}

	@Then("click save")
	public void click_save() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.save_btn();

	}

	@Then("verify the success msg")
	public void verify_the_success_msg() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String actualSuccess = aj_payPage.successSavedmsg();
		System.out.println(actualSuccess);
		seleniumUtility.sleep();
		String expectedMsg = "Successfully Saved";
		Assert.assertEquals(actualSuccess, expectedMsg, "NOt Successfully saved");
		logger.info("Success mesage was captured successfully");

	}

	@Then("clicks add button")
	public void clicks_add_button() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		// aj_payPage.navigateBack();
		aj_payPage.cancel_btn();
		aj_payPage.addclick();
	}

	@Then("Enter name in the PayGrades textbox")
	public void enter_name_in_the_PayGrades_textbox() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.enter_PayGradesnamw("Something10");
		logger.info("Entered Pay Grade Successfully");
	}

	@Then("click cancel")
	public void click_cancel() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.cancel_btn();

	}

	@Then("verify the page title")
	public void verify_the_page_title() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String actual_title = aj_payPage.verifyingTheTitle();
		String Expected = "OrangeHRM";
		Assert.assertEquals(actual_title, Expected, " NOt Successfully loggged");
		logger.info("VAldating the page title");

	}

	@Then("click the check box")
	public void click_the_check_box() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String checkBoxN = "//table/tbody/tr/td/input";
		String tableNameList = "//table/tbody/tr/td[@class='left']/preceding-sibling::td/a";
		String PayName = "Something10";
		aj_payPage.clickcheck_box(checkBoxN, tableNameList, PayName);

	}

	@Then("click delete")
	public void click_delete() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.clickdelete();
		seleniumUtility.sleep();
		logger.info("Deleted Successfully");

	}

	@Then("Click Ok in the popup")
	public void click_Ok_in_the_popup() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.click_Okpopup("//div/div/input[@class='btn']");

	}

	@Then("verify the successfully deleted msg")
	public void verify_the_successfully_deleted_msg() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String actualSeletemsg = aj_payPage.verifydeleted_msg();
		String expectedMsg = "Successfully Deleted";
		Assert.assertEquals(actualSeletemsg, expectedMsg, "NOt Successfully loggged");
		logger.info("Success  delete mesage was captured successfully");

	}

	@Then("click the check box next to the name")
	public void click_the_check_box_next_to_the_name() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String checkBoxN = "//table/tbody/tr/td/input";
		String tableNameList = "//table/tbody/tr/td[@class='left']/preceding-sibling::td/a";
		String PayName = "Something";
		aj_payPage.clickcheck_box(checkBoxN, tableNameList, PayName);

	}

	@Then("clicks delete")
	public void clicks_delete() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.clickdelete();
		//seleniumUtility.sleep();
	}	

	@Then("Click cancel in the popup")
	public void click_cancel_in_the_popup() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		//seleniumUtility.sleep();
		aj_payPage.click_cancelpopup("//div//div/input[contains(@class,'btn reset')]");

	}

	@Then("validate the page title")
	public void validate_the_page_title() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String actual_title = aj_payPage.verifyingTheTitle();
		String Expected = "OrangeHRM";
		Assert.assertEquals(actual_title, Expected, " Page Title not matching");
		logger.info("Verified the page title successfully");

	}

	@Then("click the name link in the table")
	public void click_the_name_link_in_the_table() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.click_name_link("//table/tbody/tr/td[@class='left']/preceding-sibling::td/a", "Something");
		seleniumUtility.sleep();
		logger.info("The name was clicked successfully");
	}
		
//	@Then("Click the button add")		
//	public void click_the_button_add() {
//			aj_payPage = new Admin_Job_PayGrades_Pages(driver);
//			aj_payPage.addclick();
//		}	

	@Then("clicks Edit")
	public void clicks_Edit() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.Editbn();
		seleniumUtility.sleep();

	}

	@Then("clear the name in the txt box")
	public void clear_the_name_in_the_txt_box() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.cleartxt_box();
	}

	@Then("enter the name")
	public void enter_the_name() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.enter_the_name("GradeA");
		seleniumUtility.sleep();

	}

	@Then("Click save button")
	public void click_save_button() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.save_btn();
		logger.info("Successfully saves");

	}

	@Then("validate the success msg")
	public void validate_the_success_msg() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String actualSuccess = aj_payPage.successSavedmsg();
		System.out.println(actualSuccess);
		seleniumUtility.sleep();
		String expectedMsg = "Successfully Saved";
		Assert.assertEquals(actualSuccess, expectedMsg, "NOt Successfully loggged");
		logger.info("Success mesage was captured successfully");

	}

	@Then("Click the name link")
	public void click_the_name_link() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.click_name_link("//table/tbody/tr/td[@class='left']/preceding-sibling::td/a", "GradeA");
		logger.info("The name was clicked successfully");
	}
//
//	@Then("Add button click")
//	public void add_button_click() {
//		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
//		aj_payPage.addclick();
//
//	}

	@Then("clicks Edit button")
	public void clicks_Edit_button() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.Editbn();
		seleniumUtility.sleep();

	}

	@Then("clear the name from the txt box")
	public void clear_the_name_from_the_txt_box() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.cleartxt_box();

	}

	@Then("enter the name un the txt box")
	public void enter_the_name_un_the_txt_box() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.enter_the_name("GradeB");
		seleniumUtility.sleep();

	}

	
	
	@Then("Click cancel button again")
	public void click_cancel_button_again() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		aj_payPage.cancel_btn();
		logger.info("Cancelled successfullys");

	}

	@Then("validate the page title	 is displated")
	public void validate_the_page_title_is_displated() {
		aj_payPage = new Admin_Job_PayGrades_Pages(driver);
		String actual_title = aj_payPage.verifyingTheTitle();
		String Expected = "OrangeHRM";
		Assert.assertEquals(actual_title, Expected, " Page Title not matching");
		logger.info("Verified the page title successfully");

	}

}
