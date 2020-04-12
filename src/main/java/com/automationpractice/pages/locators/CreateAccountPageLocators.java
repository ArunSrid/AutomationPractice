package com.automationpractice.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPageLocators {

	@FindBy(how = How.ID, using = "id_gender1")
	public WebElement radio_gender1;

	@FindBy(how = How.ID, using = "customer_firstname")
	public WebElement firstName;

	@FindBy(how = How.ID, using = "customer_lastname")
	public WebElement lastName;

	@FindBy(how = How.ID, using = "email")
	public WebElement email;

	@FindBy(how = How.ID, using = "passwd")
	public WebElement password;

	@FindBy(how = How.ID, using = "days")
	public WebElement days;

	@FindBy(how = How.ID, using = "months")
	public WebElement months;

	@FindBy(how = How.ID, using = "years")
	public WebElement years;

	@FindBy(how = How.ID, using = "firstname")
	public WebElement firstName_Address;

	@FindBy(how = How.ID, using = "lastname")
	public WebElement lastName_Address;

	@FindBy(how = How.ID, using = "company")
	public WebElement company_Address;

	@FindBy(how = How.ID, using = "address1")
	public WebElement addressLine1_Address;

	@FindBy(how = How.ID, using = "address2")
	public WebElement addressLine2_Address;

	@FindBy(how = How.ID, using = "city")
	public WebElement city_Address;

	@FindBy(how = How.ID, using = "id_state")
	public WebElement state;

	@FindBy(how = How.ID, using = "postcode")
	public WebElement postcode_Address;

	@FindBy(how = How.ID, using = "id_country")
	public WebElement country_Address;

	@FindBy(how = How.ID, using = "other")
	public WebElement additionalInfo_Address;

	@FindBy(how = How.ID, using = "phone")
	public WebElement homePhone_Address;

	@FindBy(how = How.ID, using = "phone_mobile")
	public WebElement mobile_Number;

	@FindBy(how = How.ID, using = "alias")
	public WebElement alias_Address;

	@FindBy(how = How.ID, using = "submitAccount")
	public WebElement submit_CreateAcc;

}
