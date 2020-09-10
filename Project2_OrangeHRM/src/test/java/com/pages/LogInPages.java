package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;

public class LogInPages extends Library {
	
		@FindBy(id="txtUsername")
		WebElement username;
		@FindBy(id="txtPassword")
		WebElement pwd;
		@FindBy(xpath="//input[@name='Submit']")
		WebElement loginbutton;
		
		public LogInPages(WebDriver driver) {
			//this.driver=driver;
			PageFactory.initElements(driver, this);	//LAZY INITIALIZATION		
	}
		public void login(String uName,String psw) {
			username.sendKeys(uName);
			pwd.sendKeys(psw);			
			//loginbutton.click();
			
		}		
		public void loginButtonClick() {
			loginbutton.click();
			
		}


}
