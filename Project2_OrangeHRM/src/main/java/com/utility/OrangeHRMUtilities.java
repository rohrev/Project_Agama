package com.utility;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseClass.Library;
import com.seleniumreUsableFunction.seleniumUtility;

public class OrangeHRMUtilities extends Library {
	Actions act;
	 seleniumUtility utility =new seleniumUtility(driver);

	public OrangeHRMUtilities(WebDriver driver) {
		this.driver = driver;
	}		
		
	public String addSave(WebElement textBoxLocator, WebElement savebtnLocator, String sendName,WebElement smsg) {

		textBoxLocator.sendKeys(sendName);
		savebtnLocator.click();
		String successSave= smsg.getText();
		System.out.println(successSave);
		return successSave;
	}
	
	public void addCancel(WebElement txtSendKey, String jobName, WebElement alreay,WebElement Cancelbtn ) {
		txtSendKey.sendKeys(jobName);
		if (alreay.isDisplayed()) {
			Cancelbtn.click();
		}	
	}
	//for deleting entry in the table and clickung ok	
	public String delete_ok(String checkBox, String JobTitleNameList,String jobName, WebElement delete, String  popUp_Ok,WebElement SmsgSelete) {			
			List<WebElement> checkxBoxlist= driver.findElements(By.xpath(checkBox));
			int checkxBoxlistSize= checkxBoxlist.size();
			System.out.println( "CheckBox " + checkxBoxlist.size());
			List<WebElement> jobTitlelist = driver
					.findElements(By.xpath(JobTitleNameList));
			int jobTitlelistSize = jobTitlelist.size();
			System.out.println("JobTitleName " + jobTitlelist.size());
			for(int i=0;i< jobTitlelistSize; i++) {	
				
					if(jobTitlelist.get(i).getText().contains(jobName)){
						checkxBoxlist.get(i).click();
						delete.click();						
						break;
					}
				}
		
			utility.windoHandling(popUp_Ok);			
			String successDelete= SmsgSelete.getText();

			//System.out.println("Deleted "+ SmsgSelete.getText());
			return successDelete;		
		}
	//for deleting entry in the table and clickung ok	
	public void delete_ok(String checkBox, String JobTitleNameList,String jobName) {			
			List<WebElement> checkxBoxlist= driver.findElements(By.xpath(checkBox));
			int checkxBoxlistSize= checkxBoxlist.size();
			System.out.println( "CheckBox " + checkxBoxlist.size());
			List<WebElement> jobTitlelist = driver
					.findElements(By.xpath(JobTitleNameList));
			int jobTitlelistSize = jobTitlelist.size();
			System.out.println("JobTitleName " + jobTitlelist.size());
			for(int i=0;i< jobTitlelistSize; i++) {	
				
					if(jobTitlelist.get(i).getText().contains(jobName)){
						checkxBoxlist.get(i).click();
						break;
					}
				}
		
			
		}
	
	
	//for deleting entry in the table	and clicking cancel
	public void delete_Cancel(String checkBox, String JobTitleNameList,String jobName, WebElement delete, String  popUp_Cancel) {			
		List<WebElement> checkxBoxlist= driver.findElements(By.xpath(checkBox));
		int checkxBoxlistSize= checkxBoxlist.size();
		System.out.println( "CheckBox " + checkxBoxlist.size());
		List<WebElement> jobTitlelist = driver
				.findElements(By.xpath(JobTitleNameList));
		int jobTitlelistSize = jobTitlelist.size();
		System.out.println("JobTitleName " + jobTitlelist.size());
		for(int i=0;i< jobTitlelistSize; i++) {	
			
				if(jobTitlelist.get(i).getText().contains(jobName)){
					checkxBoxlist.get(i).click();
					delete.click();						
					break;
				}
			}
	
		utility.windoHandling(popUp_Cancel);
	}
	
	//editing the job name and clicking save
	public String jobName_EditSave(String JobTitleList, String joBNameToBeEdited, WebElement editbtn,WebElement jobtitletxt, String joBNameEdited, WebElement savebtn, WebElement sucssmsgupdate) {
		List<WebElement> jobTitlelist = driver
				.findElements(By.xpath(JobTitleList));
		System.out.println(jobTitlelist.size());
		for (WebElement w : jobTitlelist) {
			if (w.getText().equals(joBNameToBeEdited)) {
				w.click();
				break;
			}
		}
		editbtn.click();
		jobtitletxt.clear();
		jobtitletxt.sendKeys(joBNameEdited);
		savebtn.click();
		String smsgupdate= sucssmsgupdate.getText();
		System.out.println(smsgupdate);
		return smsgupdate;

	}
	public void jobName_EditSave(String JobTitleList, String joBNameToBeEdited){
		List<WebElement> jobTitlelist = driver
				.findElements(By.xpath(JobTitleList));
		System.out.println(jobTitlelist.size());
		for (WebElement w : jobTitlelist) {
			if (w.getText().equals(joBNameToBeEdited)) {
				w.click();
				break;
			}
		}
	}
	//editing the job name and clicking cancel
	public void Edt_jobNameCanceli(String JobTitleList, String joBNameToBeEdited, WebElement editbtn,WebElement cancelbtn) {
		List<WebElement> jobTitlelist = driver
				.findElements(By.xpath(JobTitleList));
		System.out.println(jobTitlelist.size());
		for (WebElement w : jobTitlelist) {
			if (w.getText().equals(joBNameToBeEdited)) {
				w.click();
				break;
			}
		}
		editbtn.click();		
		cancelbtn.click();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
