package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;
import com.seleniumreUsableFunction.seleniumUtility;

public class AdminPage extends Library{
	
	seleniumUtility utility = new seleniumUtility(driver);
	
	@FindBy(linkText = "Admin")
	WebElement adminClick;
	
	@FindBy(xpath="//*[@id='searchSystemUser_userName']")
	WebElement userName1;
	@FindBy(xpath="//*[@id='searchSystemUser_userType']")
	WebElement userRole;
	@FindBy(xpath="//*[@id='searchSystemUser_employeeName_empName']")
	WebElement Employeename;
	@FindBy(xpath="//*[@id=\"searchSystemUser_status\"]")
	WebElement statusdropDown;
	@FindBy(xpath="//*[@id=\"searchBtn\"]")
	WebElement submitButton;

	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);			
}
	public void adminCli() {
		adminClick.click();
	}
	
	public void search(String uname,String selectedValue, String eName, String selectedValue1) {
		userName1.sendKeys(uname);
		utility.dropDown(selectedValue, userRole);
		Employeename.sendKeys(eName);
		utility.dropDown(selectedValue1, statusdropDown);
		submitButton.click();

	}


}
