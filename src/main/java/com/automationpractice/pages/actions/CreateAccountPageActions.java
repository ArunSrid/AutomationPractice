package com.automationpractice.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.automationpractice.pages.locators.CreateAccountPageLocators;
import com.automationpractice.testengine.TestDriver;
import com.automationpractice.utils.TestUtilities;

public class CreateAccountPageActions {

	CreateAccountPageLocators CreateAccountPageLocators = null;
	TestUtilities testUtil;

	public CreateAccountPageActions() {
		this.CreateAccountPageLocators = new CreateAccountPageLocators();
		PageFactory.initElements(TestDriver.getDriver(), CreateAccountPageLocators);
		testUtil = new TestUtilities(TestDriver.driver);
	}

	public void enter_FirstName(String firstName) {
		CreateAccountPageLocators.firstName.sendKeys(firstName);
	}

	public void enter_LastName(String LastName) {
		CreateAccountPageLocators.lastName.sendKeys(LastName);
	}

	public void enter_Password(String Password) {
		CreateAccountPageLocators.password.sendKeys(Password);
	}

	public void select_Day(String day) {
		testUtil.select_dropdownByValue(CreateAccountPageLocators.days, day);
	}

	public void select_Month(String month) {
		testUtil.select_dropdownByValue(CreateAccountPageLocators.months, month);
	}

	public void select_Year(String year) {
		testUtil.select_dropdownByValue(CreateAccountPageLocators.years, year);
	}

	public void enter_FN_Address(String FirstName) {
		CreateAccountPageLocators.firstName_Address.sendKeys(FirstName);
	}

	public void enter_LN_Address(String LastName) {
		CreateAccountPageLocators.lastName_Address.sendKeys(LastName);
	}

	public void enter_Address(String Address) {
		CreateAccountPageLocators.addressLine1_Address.sendKeys(Address);
	}

	public void enter_City(String City) {
		CreateAccountPageLocators.city_Address.sendKeys(City);
	}

	public void select_State(String State) {
		testUtil.select_dropdownByValue(CreateAccountPageLocators.state, State);
	}

	public void enter_PostalCode(String PostalCode) {
		CreateAccountPageLocators.postcode_Address.sendKeys(PostalCode);
	}

	public void select_Country(String Country) {
		testUtil.select_dropdownByValue(CreateAccountPageLocators.country_Address,Country);
	}

	public void enter_MobileNumber(String mobileNumber) {
		CreateAccountPageLocators.mobile_Number.sendKeys(mobileNumber);
	}

	public void click_Submit() throws InterruptedException {
		CreateAccountPageLocators.submit_CreateAcc.click();
		Thread.sleep(1000);
	}

}
