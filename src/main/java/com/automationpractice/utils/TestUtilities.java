package com.automationpractice.utils;

import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestUtilities {
	
	
	
	public RemoteWebDriver driver;

    public TestUtilities(RemoteWebDriver driver) {
        this.driver=driver;
    }

	public static String getWebDriverServerURL() {
		String ServerURL = "http://localhost:4444/wd/hub"; // Selenium Server URL
		return ServerURL;
	}

	public static String random_Email()
	{
		
		String random = "Automation" + getTimeStamp() +"@yopmail.com";
		return random;
	}

	public static long getTimeStamp() {

		Date date = new Date();
		long time = date.getTime();
		return time;

	}
	
	public void select_dropdownByValue(WebElement ele, String enterValue) {
        Select select=new Select(ele);
        select.selectByValue(enterValue);
    }
	
	
	 public void ScrollToView(WebElement element){
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }

	 public void movetoElementandClick(WebElement element){

	        Actions action = new Actions(driver);
	        action.moveToElement(element).click().build().perform();
	    }

}
