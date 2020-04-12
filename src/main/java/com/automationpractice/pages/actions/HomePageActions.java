package com.automationpractice.pages.actions;

import org.openqa.selenium.support.PageFactory;
import com.automationpractice.pages.locators.HomePageLocators;
import com.automationpractice.testengine.TestDriver;

public class HomePageActions {

	HomePageLocators HomePageLocators = null;

	public HomePageActions() {
		this.HomePageLocators = new HomePageLocators();
		PageFactory.initElements(TestDriver.getDriver(), HomePageLocators);
	}

	public SignInPageActions clickonSignIn() throws InterruptedException {
		HomePageLocators.signIn_Button.click();
		Thread.sleep(3000);
		return new SignInPageActions();
	}

	public boolean checkForTitle(String title) {
		if (title == null || title.isEmpty())
			throw new IllegalArgumentException(title);
		return TestDriver.driver.getTitle().trim().contains(title);
	}

}