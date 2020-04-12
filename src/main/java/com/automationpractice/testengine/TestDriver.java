package com.automationpractice.testengine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.automationpractice.configdetails.ConfigDetails;
import com.automationpractice.helper.Constants;
import com.automationpractice.utils.TestUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDriver {
	public static RemoteWebDriver driver = null;

	@SuppressWarnings("deprecation")
	public static void initiateDriverSession() {

		try {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities = setDriverCapabilities(capabilities);
			String serverURL = TestUtilities.getWebDriverServerURL();
			// driver = new RemoteWebDriver(new URL(serverURL), capabilities);
			driver = new ChromeDriver(capabilities);
			driver.manage().timeouts().pageLoadTimeout(Long.valueOf(Constants.GLOBAL_TIMEOUT), TimeUnit.SECONDS);
			driver.manage().window().fullscreen();
			driver.get(Constants.AUTOMATION_URL);

		} catch (Exception e) {
			Assert.fail();
		}

	}

	public static DesiredCapabilities setDriverCapabilities(DesiredCapabilities capabilities) {

		try {

			switch (ConfigDetails.browser.toLowerCase().trim()) {

			case "chrome":

				WebDriverManager.chromedriver().setup();
				// WebDriverManager.chromedriver().setup();
				capabilities = DesiredCapabilities.chrome();
				ChromeOptions chromeoptions = new ChromeOptions();
				chromeoptions.addArguments("test-type");
				chromeoptions.addArguments("disable-session-crashed-bubble");
				chromeoptions.addArguments("disable-popup-blocking");
				capabilities.setCapability(ChromeOptions.CAPABILITY, chromeoptions);
				capabilities.setCapability("browserName", ConfigDetails.browser);

				break;

			default:
				break;
			}

			capabilities.setCapability("autoGrantPermissions", true);
			capabilities.setCapability("acceptInsecureCerts", true);
		} catch (Exception e) {
			Assert.fail();
		}
		return capabilities;

	}

	public static RemoteWebDriver getDriver() {
		return driver;
	}

}
