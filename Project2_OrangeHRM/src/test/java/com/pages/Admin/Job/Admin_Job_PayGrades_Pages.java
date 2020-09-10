package com.pages.Admin.Job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;
import com.seleniumreUsableFunction.seleniumUtility;
import com.utility.OrangeHRMUtilities;

import io.cucumber.java.en.Then;

public class Admin_Job_PayGrades_Pages  extends Library {
	seleniumUtility utility = new seleniumUtility(driver);
	OrangeHRMUtilities  ohUtility =new OrangeHRMUtilities(driver);;
	Actions act;
	
	@FindBy(linkText = "Admin") // adminTab
	WebElement adminClick;
	@FindBy(xpath = "//a[@class='arrow'][contains(text(),'Job')]") // jobtab
	WebElement jobTab;
	@FindBy(xpath = "//input[@name='btnAdd']") // add tab
	WebElement addTab;
    //input[@id='btnAddCurrency']
	@FindBy(xpath = "//input[@id='btnAddCurrency']") // add tab
	WebElement addTab2;
	@FindBy(xpath = "//input[@name='payGrade[name]']") // add in the text
	WebElement PayGradetxt ;	
	@FindBy(xpath = "//input[@name='btnAdd']") // add
	WebElement addButton ;
	@FindBy(xpath = "//input[@name='btnSave']") // save
	WebElement saveBtn ;
	@FindBy(xpath = "//div/div[@class='message success fadable']") //dsuccessmsg
	WebElement successaddmsg;
	@FindBy(xpath = "//input[@name='btnCancel']") // cancel
	WebElement cancel ;	
	@FindBy(xpath = "//input[@name='btnDelete']") // deleye
	WebElement delete ;	
	@FindBy(xpath = "//*[@id='frmList_ohrmListComponent']/div[@class='message success fadable']") // alert_ok
	WebElement successmsgDelete;	
	@FindBy(xpath = "//input[@name='btnSave']") // alert_ok
	WebElement deletebtn;

	public Admin_Job_PayGrades_Pages(WebDriver driver) {
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
		seleniumUtility.sleep();
		addButton.click();
	}	
	
	public void enter_PayGradesnamw(String PayGradeNAme) {
		PayGradetxt.sendKeys(PayGradeNAme);
	}
	public void save_btn() {
		saveBtn.click();
	}
	
	public String successSavedmsg() {
		String success= successaddmsg.getText();
		return success;
	}

	public void cancel_btn() {
		cancel.click();
	}
	public String verifyingTheTitle() {
		String pTitle= driver.getTitle();
		return pTitle;
	}
	
	public void clickcheck_box(String CheckBXList,String PayNameList,String PayName) {
		ohUtility.delete_ok(CheckBXList,PayNameList,PayName);
	}

	public void clickdelete() {
		seleniumUtility.sleep();
		delete.click();
	}

	public void click_Okpopup(String PopUpOk) {
		utility.windoHandling(PopUpOk);		
	}
	public String verifydeleted_msg() {
		String 	deeletemsg = successmsgDelete.getText();
		return deeletemsg;
	}
	public void click_cancelpopup(String PopUpcancel) {
		utility.windoHandling(PopUpcancel);
	}		

	public void click_name_link(String nameList,String PayName) {
		ohUtility.jobName_EditSave(nameList, PayName);
	}	
	public void Editbn() {
		seleniumUtility.sleep();
		deletebtn.click();		
	}
	public void cleartxt_box() {
		PayGradetxt.clear();
	}

	public void enter_the_name(String PayGradeNAme) {
		PayGradetxt.sendKeys(PayGradeNAme);
	}
	
	public String validate_the_success_msg() {
		String success= successaddmsg.getText();
		return success;
	}

	public void clickname_link(String nameList,String PayName) {
		ohUtility.jobName_EditSave(nameList, PayName);
	}

	public void clicks_Edit_button() {
		seleniumUtility.sleep();
		deletebtn.click();	
	}

	

	

	

}


	

