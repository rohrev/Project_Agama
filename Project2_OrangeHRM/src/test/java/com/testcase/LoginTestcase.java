package com.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.LogInPages;
import com.seleniumreUsableFunction.seleniumUtility;

public class LoginTestcase extends Library {
	LogInPages lpage;
	seleniumUtility su;
	@BeforeClass
		public void stratUp() {
			browserSetUp();
			logger.info("Browser launced and navigate to url");
			}
		@Test(priority=1)
		public void login() {
			lpage=new LogInPages(driver);
			lpage.login(properties.getProperty("userName"),properties.getProperty("password"));
			//lpage.login("Admin", "admin123");
			logger.info("Enter Uname & Password Seccessful");

		}
		@Test(priority=2)
		public void click() {
			lpage.loginButtonClick();
			logger.info("Login Seccessful");

		}

		@AfterClass
		public void close() throws IOException {
			 su= new seleniumUtility(driver);
			su.to_take_screenshot("src/test/resources/screenshots/orangeHRM.png");
			//su.screenshot("src/test/resources/screenshots/facebook.png");
			logger.info("Screen shot successfull");
			//tearDown();
			
			}


}
