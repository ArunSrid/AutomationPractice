package com.automationpractice.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.automationpractice.pages.locators.UserAccountPageLocators;
import com.automationpractice.testengine.TestDriver;
import com.automationpractice.utils.TestUtilities;

public class UserAccountPageActions {

	UserAccountPageLocators UserAccountPageLocators = null;
	TestUtilities testUtil;

	public UserAccountPageActions() {

		this.UserAccountPageLocators = new UserAccountPageLocators();
		PageFactory.initElements(TestDriver.getDriver(), UserAccountPageLocators);
		testUtil = new TestUtilities(TestDriver.driver);

	}

	public void click_DressTab() {
		UserAccountPageLocators.tab_Dress.click();
	}

	public void scrollToQuickView() {
		testUtil.ScrollToView(UserAccountPageLocators.quickView);
	}

	public void clickonQuickView() {
		testUtil.movetoElementandClick(UserAccountPageLocators.quickView);
	}

	public void addtoCart() throws InterruptedException {
		TestDriver.driver.switchTo().frame(0);
		UserAccountPageLocators.addTocart.click();
		Thread.sleep(2000);

	}

	public void proceedToCheckout() {
		UserAccountPageLocators.proceedToCheckout.click();
	}
	
	public void cartSummaryCheckout() {
		UserAccountPageLocators.cartSummuaryCheckout.click();
	}
	
	public void addressCheckout() {
		UserAccountPageLocators.address_Checkout.click();
	}
	
	public void termsofService() {
		UserAccountPageLocators.termsofService.click();
	}
	
	public void shippingCheckout() throws InterruptedException {
		UserAccountPageLocators.shippingCheckout.click();
		Thread.sleep(2000);
	}

	public void paybyWire() {
		UserAccountPageLocators.paybyWire.click();
	}
	
	public void confirmButton() {
		UserAccountPageLocators.confirm_Button.click();
	}
	
	public boolean checkForTitle(String title) {
		if (title == null || title.isEmpty())
			throw new IllegalArgumentException(title);
		return TestDriver.driver.getTitle().trim().contains(title);
	}
	
	public String getAccountExistsError() {
		String errorText = UserAccountPageLocators.account_Exists.getText();
		return errorText;
	}

}
