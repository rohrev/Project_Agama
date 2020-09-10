package com.StepDefinition.Admin;

import org.testng.Assert;

import com.baseClass.Library;
import com.pages.LogInPages;
import com.pages.Admin.Job.Admin_job_jobTitles_Page;
import com.seleniumreUsableFunction.seleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_Job_jobTitle_SD extends Library{
	LogInPages lpage;// = new LogInPages(driver);
	seleniumUtility su;
	Admin_job_jobTitles_Page a_jobTitle; // = new Admin_job_jobTitles_Page(driver);;

	
	@Given("Navigates to OrangeHRM website")
	public void navigates_to_OrangeHRM_website() {
		browserSetUp();
		logger.info("Browser launced and navigate to url");
	}

	@Given("Verify the url")
	public void verify_the_url() {
		String actual_URL = driver.getCurrentUrl();
		Assert.assertEquals(actual_URL, "https://opensource-demo.orangehrmlive.com/", "Launched the incorrect url");

	}

	@When("Enter the  uNam and pwd")
	public void enter_the_uNam_and_pwd() {

		lpage = new LogInPages(driver);
		// lpage.login(properties.getProperty("userName"),properties.getProperty("password"));
		lpage.login("Admin", "admin123");
	}

	@When("clicks on the loginbutton")
	public void clicks_on_the_loginbutton() {
		lpage = new LogInPages(driver);
		lpage.loginButtonClick();
		logger.info("Login Successful");
	}	

	@Then("Get the page title and  take Screenshot")
	public void get_the_page_title_and_take_Screenshot() {
		lpage = new LogInPages(driver);
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, "OrangeHRM", " NOt Successfully loggged");

	}
	@Given("ClickS ON   Admimin tab")
	public void clicks_ON_Admimin_tab() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.adminClick();
		seleniumUtility.sleep();
		logger.info("Admin tab was clickedl");

	}

	@Then("Click the Job subtab")
	public void click_the_Job_subtab() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.a_JobClick();
		seleniumUtility.sleep();
		logger.info("job subtab clicked Seccessful");

	}

	@Then("Click jobtitle menu")
	public void click_jobtitle_menu() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.jobtitleclick("//li[1]//ul[1]//li[2]//ul[1]/li", "Job Titles");
		logger.info("job title from job subtab clicked  Seccessful");
	}

	@Then("click Add button")
	public void click_Add_button() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.addclick();
		logger.info("add button clicked  Seccessful");
	}

	@Then("Enter jobTitle, click,save and verify the message")
	public void enter_jobTitle_click_save_and_verify_the_message() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		String actual_msgSave = a_jobTitle.addSave("HRM25");
		String expectedMsg = "Successfully Saved";
		// System.out.println("meassage " + actual_msgSave);
		Assert.assertEquals(actual_msgSave, expectedMsg, "sucessmessage is not displayed");
		logger.info("jobTitle was saved Successfuly");
	}


	@Then("clicks Add button")
	public void clicks_Add_button() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.addclick();
		logger.info("add button clicked  Seccessful");

	}
	@Then("Enter jobTitle in text")
	public void enter_jobTitle_in_text() {


	}

	@Then("Click cancel button")
	public void click_cancel_button() {


	}

	@Then("Get the page title")
	public void get_the_page_title() {


	}

	@Then("Validate page title")
	public void validate_page_title() {


	}

	@Given("Select the link under the jobTitle Table")
	public void select_the_link_under_the_jobTitle_Table() {


	}

	@Given("Check the checkbox next to selection")
	public void check_the_checkbox_next_to_selection() {


	}

	@Then("Click the Edit button")
	public void click_the_Edit_button() {


	}

	@Then("Edit the entry in the jobtitletxt box")
	public void edit_the_entry_in_the_jobtitletxt_box() {


	}

	@Then("Click the save")
	public void click_the_save() {


	}

	@Then("VAlidate the success messsage after saving")
	public void validate_the_success_messsage_after_saving() {


	}

	@Given("Select the link injob Title Table")
	public void select_the_link_injob_Title_Table() {


	}

	@Given("Check the checkbox near to selection")
	public void check_the_checkbox_near_to_selection() {


	}

	@Then("Click Edit button")
	public void click_Edit_button() {


	}

	@Then("Edit the entry in the text box")
	public void edit_the_entry_in_the_text_box() {


	}

//	@Then("Click cancel")
//	public void click_cancel1() {
//
//
//	}

	@Given("Check the check box next to an entry")
	public void check_the_check_box_next_to_an_entry() {


	}

	@Given("Cliclk delete button")
	public void cliclk_delete_button() {


	}

	@When("Popup window will open")
	public void popup_window_will_open() {


	}

	@When("Verify the msg in the pop up")
	public void verify_the_msg_in_the_pop_up() {


	}

	@When("Click ok")
	public void click_ok() {


	}

	@When("Validate the success deleted msg")
	public void validate_the_success_deleted_msg() {


	}

	@Given("Check the check box in the table")
	public void check_the_check_box_in_the_table() {


	}

	@Given("Click delete button")
	public void click_delete_button() {


	}

	@When("Popupwindow opens")
	public void popupwindow_opens() {


	}

	@When("Click cancel")
	public void click_cancel() {


	}

	@When("Validate the page heading of the page")
	public void validate_the_page_heading_of_the_page() {


	}




}
