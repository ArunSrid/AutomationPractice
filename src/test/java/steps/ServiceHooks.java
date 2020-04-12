package steps;

import com.automationpractice.configdetails.ConfigDetails;
import com.automationpractice.testengine.TestDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {

	@Before
	public static void setUp() {

		ConfigDetails.setConfigDetails();
		TestDriver.initiateDriverSession();
	}

	@After
	public static void tearDown() {
		System.out.println("Entered AfterAction");
		if (TestDriver.driver != null)
			TestDriver.driver.quit();
	}

}
