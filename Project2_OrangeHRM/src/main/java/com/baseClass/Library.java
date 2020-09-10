package com.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	//public ExtentReports extent;


	public  Library() {

		properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream(
					//"./src/test/resources/configurationProperties/config.property");
					"./src/test/resources/configurationProperties/config.properties");
			try {
				properties.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		logger = Logger.getLogger(Library.class);
		//PropertyConfigurator.configure("./src/test/resources/Log4jproperty/log4j.property");     
		PropertyConfigurator.configure("src/test/resources/Log4jProperties/Log4j.properties");

		//.configure("./src/test/resources/Log4jproperty/log4j.properties");
		
		///src/test/resources/Log4jproperty/log4j.properties
	}

	public static void browserSetUp() {

		logger.info("Starting with Browser Set Up");
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
			break;
		case "headlessbrowser":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			driver = new ChromeDriver(options);

		default:
			logger.info(String.format("Could not identify the browser as %s. Please specify correct browser", browser));
			break;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		logger.info("Launched the OrangeHRM Application");
	}
	public static void tearDown() {
		driver.quit();
		logger.info("Exiting the application and closing the browser");
	}


}
