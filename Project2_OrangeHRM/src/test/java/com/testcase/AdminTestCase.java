package com.testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.AdminPage;
import com.pages.LogInPages;
import com.seleniumreUsableFunction.seleniumUtility;

public class AdminTestCase extends Library{
	LogInPages lpage;
	AdminPage ad;
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
			logger.info("Login Seccessful");

		}
		@Test(priority=2)
		public void adminClick() {
			ad =new AdminPage(driver);
			ad.adminCli();
		}
		@Test(priority=3)
		public void Adminclicksearch() {
			ad =new AdminPage(driver);
			//ad.adminCli();
			// String Kevin =properties.getProperty("kevin") ;
			 //String ESS = properties.getProperty("ESS");
			 //String KevinMathews = properties.getProperty("Kevin Mathews");
			 //String Enabled = properties.getProperty("Enabled");
			ad.search(properties.getProperty("userN"), properties.getProperty("selectedValue"), properties.getProperty("eName"), properties.getProperty("selectedValue1"));
		}	
		
		@AfterClass
		public void close() throws IOException {
			 su= new seleniumUtility(driver);
			su.to_take_screenshot("src/test/resources/screenshots/orangeHRM.png");
			//su.screenshot("src/test/resources/screenshots/facebook.png");
			tearDown();
}


}

	
	


