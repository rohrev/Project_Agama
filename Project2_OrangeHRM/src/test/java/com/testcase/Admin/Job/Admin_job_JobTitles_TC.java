package com.testcase.Admin.Job;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.LogInPages;
import com.pages.Admin.Job.Admin_job_jobTitles_Page;
import com.seleniumreUsableFunction.seleniumUtility;

public class Admin_job_JobTitles_TC extends Library {
	LogInPages lpage;// = new LogInPages(driver);
	seleniumUtility su;
	Admin_job_jobTitles_Page a_jobTitle; // = new Admin_job_jobTitles_Page(driver);;

	@BeforeClass
	public void stratUp() {
		browserSetUp();
		String actual_URL = driver.getCurrentUrl();
		Assert.assertEquals(actual_URL, "https://opensource-demo.orangehrmlive.com/", "Launched the correct url");
		// taskkill /F /IM chromedriver.exe
		logger.info("Browser launced and navigate to url");

	}

	@Test(priority = 1)
	public void login() {
		lpage = new LogInPages(driver);
		// lpage.login(properties.getProperty("userName"),properties.getProperty("password"));
		lpage.login("Admin", "admin123");
		lpage.loginButtonClick();
		logger.info("Login Successful");
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, "OrangeHRM", " NOt Successfully loggged");

	}

	@Test(priority = 2)
	public void adminClick() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.adminClick();
		seleniumUtility.sleep();
		logger.info("Admin tab was clickedl");

	}

	@Test(priority = 3)
	public void jobclick() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.a_JobClick();
		seleniumUtility.sleep();
		logger.info("job subtab clicked Seccessful");

	}

	@Test(priority = 4)
	public void a_JobTitleClick() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		a_jobTitle.jobtitleclick("//li[1]//ul[1]//li[2]//ul[1]/li", "Job Titles");
		logger.info("job title from job subtab clicked  Seccessful");
		// a_jobTitle.addsave();
		// a_jobTitle.Edit();
	}

	@Test(priority = 5)
	public void addSave() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		String actual_msgSave = a_jobTitle.addSave("HRM25");
		String expectedMsg = "Successfully Saved";
		// System.out.println("meassage " + actual_msgSave);
		Assert.assertEquals(actual_msgSave, expectedMsg, "sucessmessage is not displayed");
		logger.info("jobTitle was saved Successfuly");

	}

	@Test(priority = 6)
	public void addCancel() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		String actual = a_jobTitle.addCancel("HRM25");
		String expectedMsg = "OrangeHRM";
		System.out.println("meassage " + actual);
		Assert.assertEquals(actual, expectedMsg, "Title not displayed");
		logger.info("jobTitle was captured Successfuly");
	}

	@Test(priority = 7)
	public void Delete_OK() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		String actual_msgDeletee = a_jobTitle.deleteJobName_Ok("//table/tbody/tr/td/input",
				"//table/tbody/tr/td[@class='left']/preceding-sibling::td/a", "Tester",
				"//input[@id='dialogDeleteBtn']");
		String expectedMsg = "Successfully Deleted";
		// System.out.println("meassage " + actual_msgSave);
		Assert.assertEquals(actual_msgDeletee, expectedMsg, "sucessmessage is not displayed");
		logger.info("jobTitleNmae was deleted Successfuly");

	}

	@Test(priority = 8)
	public void Delete_CAncelK() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);

		String checkBoxN = "//table/tbody/tr/td/input";
		String tableNameList = "//table/tbody/tr/td[@class='left']/preceding-sibling::td/a";
		String popUpCancel = "//input[@class='btn reset']";

		String actual_msgDeletee = a_jobTitle.deleteJobName_cancel(checkBoxN, tableNameList, "Tester2", popUpCancel);
		String expectedMsg = "OrangeHRM";
		// System.out.println("meassage " + actual_msgSave);
		Assert.assertEquals(actual_msgDeletee, expectedMsg, "sucessmessage is not displayed");
		logger.info("jobTitleNmae was deleted Successfuly");

	}

	@Test(priority = 9)
	public void Edit_jobNameSave() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		String tableListName = "//table/tbody/tr/td[@class='left']/preceding-sibling::td/a ";
		String actual_msgUpdate = a_jobTitle.EditJobNameSave(tableListName, "Tester2", "SeniorTester");
		String expectedMsg = "Successfully Updated";
		// System.out.println("meassage " + actual_msgSave);
		Assert.assertEquals(actual_msgUpdate, expectedMsg, "sucessmessage is not displayed");
		logger.info("jobTitleNmae was Edited and updated Successfuly");

	}

	@Test(priority = 10)
	public void Edit_jobNameCAncel() {
		a_jobTitle = new Admin_job_jobTitles_Page(driver);
		String tableListName = "//table/tbody/tr/td[@class='left']/preceding-sibling::td/a ";
		String actualTitle = a_jobTitle.EditJobNameCAncel(tableListName, "Manger");
		String expectTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectTitle, "sucessmessage is not displayed");
		logger.info("jobTitleNmae was Edited was not saved but canceled Successfuly");

	}

	@AfterClass
	public void quitBrowser() {
		tearDown();
	}

}
