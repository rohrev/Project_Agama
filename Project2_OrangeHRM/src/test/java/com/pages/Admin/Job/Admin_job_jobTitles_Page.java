package com.pages.Admin.Job;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;
import com.seleniumreUsableFunction.seleniumUtility;
import com.utility.OrangeHRMUtilities;

public class Admin_job_jobTitles_Page extends Library {

	seleniumUtility utility = new seleniumUtility(driver);
	OrangeHRMUtilities  ohUtility =new OrangeHRMUtilities(driver);;
	Actions act;
	
	@FindBy(linkText = "Admin") // adminTab
	WebElement adminClick;
	@FindBy(xpath = "//a[@class='arrow'][contains(text(),'Job')]") // jobtab
	WebElement jobTab;
	@FindBy(xpath = "//input[@name='btnAdd']") // add tab
	WebElement addTab;
	@FindBy(xpath = "//input[@name='jobTitle[jobTitle]']") // add in the text
	WebElement jobtitle;
	@FindBy(xpath = "//input[@name='btnSave']") // Save
	WebElement save_btn;
	@FindBy(id = "btnCancel") // cancel
	WebElement Cancel_btn;
	//@FindBy(xpath = "//div[@class='message success fadable']") //dsuccessmsg
	@FindBy(xpath = "//*[@id='frmList_ohrmListComponent']/div[2]") //dsuccessmsg
	WebElement successaddmsg;
	@FindBy(xpath = "//span[text()='Required']") // required
	WebElement required;
	@FindBy(xpath = "//span[text()='Already exists']") // alreadyexist msg
	WebElement alreadyExist;
	@FindBy(xpath = "//input[@id='btnDelete']") // deletebutton
	WebElement deletebtn;
	@FindBy(xpath = "//input[@id='btnSave']") // Editbutton
	WebElement editButton;
	@FindBy(xpath = "//*[@id='frmList_ohrmListComponent']/div[@class='message success fadable']") // alert_ok
	WebElement successmsgDelete;
	

	String alert_ok = "//input[@id='dialogDeleteBtn']";
	String alert_Cancel = "//input[@class='btn reset']";

	
	public Admin_job_jobTitles_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void adminClick() {
		adminClick.click();
		
	}
	public void a_JobClick() {
		jobTab.click();
	}	

	public void jobtitleclick(String subMenuDropdown, String dropDownNAme) {
		utility.lisDropDown(subMenuDropdown, dropDownNAme);

	}
	public void addclick() {
		addTab.click();
	}

	public String addSave(String jobTitleName) {
		seleniumUtility.sleep();
		String msg =ohUtility.addSave(jobtitle, save_btn, jobTitleName, successaddmsg);
		seleniumUtility.sleep();	
		return msg;

	}
	public String addCancel(String jobNAme) {
		addTab.click();
		seleniumUtility.sleep();
		ohUtility.addCancel(jobtitle, jobNAme, alreadyExist, Cancel_btn);
		//.seleniumUtility.sleep();
		String title= driver.getTitle();
		return title;
	}


	public String deleteJobName_Ok(String checkBoxNL,String tableNameListLL, String JTitleName, String popUpOkL) {
		String deletemsg = ohUtility.delete_ok(checkBoxNL, tableNameListLL, JTitleName, deletebtn,popUpOkL,successmsgDelete);
		 //String successdelete= successmsgDelete.getText();
		 return deletemsg;		
	}
	

	public String deleteJobName_cancel(String checkBoxNL,String tableNameListLL, String JTitleName, String popUpCancelL) {
		ohUtility.delete_Cancel(checkBoxNL, tableNameListLL, JTitleName, deletebtn, popUpCancelL);
		String title= driver.getTitle();		
		System.out.println("title after clickung delete cancel " + title);
		return title;	
	}
	
	public String EditJobNameSave(String tableNameListLL, String JNametoBeEdited, String JNametEdited) {
		String updatedmsg = ohUtility.jobName_EditSave(tableNameListLL, JNametoBeEdited,editButton, jobtitle, JNametEdited, save_btn, successaddmsg);
		 return updatedmsg;		
	}

	public String EditJobNameCAncel(String tableNameListLL,String jNameToBeEdited) {
		
		ohUtility.Edt_jobNameCanceli(tableNameListLL, jNameToBeEdited, editButton, Cancel_btn);
		String title= driver.getTitle();		
		System.out.println("title after clickung update Cancel cancel " + title);
		return title;		
	}

	
	

	
}
