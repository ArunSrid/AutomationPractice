package com.automationpractice.pages.actions;

import org.openqa.selenium.support.PageFactory;
import com.automationpractice.pages.locators.SignInPageLocators;
import com.automationpractice.testengine.TestDriver;
import com.automationpractice.utils.TestUtilities;

public class SignInPageActions {

	SignInPageLocators SignInPageLocators = null;

	public SignInPageActions() {

		this.SignInPageLocators = new SignInPageLocators();
		PageFactory.initElements(TestDriver.getDriver(), SignInPageLocators);

	}

	public boolean checkForTitle(String title) {
		if (title == null || title.isEmpty())
			throw new IllegalArgumentException(title);
		return TestDriver.driver.getTitle().trim().contains(title);
	}

	public SignInPageActions enter_Email() {
		SignInPageLocators.email.sendKeys(TestUtilities.random_Email());
		return new SignInPageActions();
	}

	public SignInPageActions enter_Existing_Email(String email) {
		SignInPageLocators.email.sendKeys(email);
		return new SignInPageActions();
	}

	public void click_Submit() throws InterruptedException {
		SignInPageLocators.Submit.click();
		Thread.sleep(4000);

	}

	public void email_login(String email) {
		SignInPageLocators.email_login.sendKeys(email);
	}

	public void password_login(String password) {
		SignInPageLocators.password.sendKeys(password);
	}

	public void submit_login() throws InterruptedException {
		SignInPageLocators.login.click();
		Thread.sleep(1000);
	}

}
