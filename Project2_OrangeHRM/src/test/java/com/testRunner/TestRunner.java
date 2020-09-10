package com.testRunner;


import org.testng.annotations.AfterClass;

import com.vimalselvam.cucumber.listener.Reporter;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
				plugin = {"pretty",
						"html:Reports/cucumber-html-report", 
						"json:Reports/cucumber-html-report/jsonreport.json",
						"rerun:target/cucumber-reports/rerun.txt",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: ",
						"testng:target/testng-cucumber-reports/cuketestng.xml",
						},monochrome=true,tags="@Pay_Grade",dryRun =false,
		glue="com.StepDefinition.Admin"
		
		//strict= true
					
		)

public class TestRunner extends AbstractTestNGCucumberTests{	
	
 @AfterClass	  
	  public static void Extentsreport()
	  
	  {
	  Reporter.loadXMLConfig("src/test/resources/Extent-config.xml");
	  Reporter.setSystemInfo("user", System.getProperty("user.name"));
	  Reporter.setSystemInfo("os", "Windows");
	  Reporter.setTestRunnerOutput("Sample test runner output message"); }
	 

}
	



