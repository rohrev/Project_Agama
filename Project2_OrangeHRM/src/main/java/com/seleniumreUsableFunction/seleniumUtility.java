package com.seleniumreUsableFunction;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseClass.Library;

public class seleniumUtility extends Library {

	public seleniumUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void to_take_screenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getTitle1() {
		
		System.out.println(driver.getTitle());

	}

	// Thread.sleep
	public static void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//explicit wait
	public void Explicitlywait(String Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));

	}

	// select dropdown
	public void dropDown(String selectedValue, WebElement locator) {
		Select selectdropdown = new Select(locator);
		selectdropdown.selectByVisibleText(selectedValue);
	}

	// List drop down
	@SuppressWarnings("unlikely-arg-type")
	public void lisDropDown(String subTabList, String subTabName) {
		List<WebElement> li = driver.findElements(By.xpath(subTabList));
		// System.out.println(li);
		seleniumUtility.sleep();
		for (WebElement w : li) {
			System.out.println("text " + w.getText());
			if (w.getText().equals(subTabName)) {
				// System.out.println("Hello");
				w.click();
				break;
			}
		}

	}
	public void windoHandling(String popUp) {
		//String popUpMsg= "";
		Set<String> winhandles = driver.getWindowHandles();// all the windows
		System.out.println("the number of window are:" + winhandles.size());

		for (String winhandle : winhandles) {
			driver.switchTo().window(winhandle);
			System.out.println("Window Switch");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// popUpMsg = driver.findElement(By.xpath(popUp)).getText();
			driver.findElement(By.xpath(popUp)).click();
		}
		String title = driver.getTitle();
		System.out.println("the page title is" + title);
		//return popUpMsg;
	}
	
	public void acceptPopUp1() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		seleniumUtility.sleep();
		System.out.println(driver.switchTo().alert().getText());
	}	
	
	public void CancelPopUp() {
		driver.switchTo().alert().dismiss();
		seleniumUtility.sleep();
	}

	public void quit() {
		driver.close();

	}


	

}
