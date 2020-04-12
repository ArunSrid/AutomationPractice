package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.automationpractice.helper.Constants;
import com.automationpractice.pages.actions.*;
import com.automationpractice.testengine.TestDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCartandPaymentSteps {

	HomePageActions homePage = new HomePageActions();
	SignInPageActions signInPage = new SignInPageActions();
	CreateAccountPageActions accountPage = new CreateAccountPageActions();
	UserAccountPageActions userPage = new UserAccountPageActions();

	@Given("user is on the Sign in home page")
	public void user_is_on_the_Sign_in_home_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		homePage.clickonSignIn();
	}

	@When("I provide the email address")
	public void i_provide_the_email_address() {
		// Write code here that turns the phrase above into concrete actions
		signInPage.enter_Email();
	}

	@When("I click on the Create an account button")
	public void i_click_on_the_Create_an_account_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		signInPage.click_Submit();
		Assert.assertTrue(signInPage.checkForTitle(Constants.SIGNIN_TITLE));
	}

	@When("I enter the First name <FirstName> and Last Name <LastName> and Password <Password>")
	public void i_enter_the_First_name_FirstName_and_Last_Name_LastName_and_Password_Password(
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		accountPage.enter_FirstName(list.get(0).get(Constants.FIRSTNAME));
		accountPage.enter_LastName(list.get(0).get(Constants.LASTNAME));
		accountPage.enter_Password(list.get(0).get(Constants.PASSWORD));

	}

	@When("I select the Date <Date> Month <Month> and Year <Year>")
	public void i_select_the_Date_Date_Month_Month_and_Year_Year(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);

		accountPage.select_Day(list.get(0).get(Constants.DATE));
		accountPage.select_Month(list.get(0).get(Constants.MONTH));
		accountPage.select_Year(list.get(0).get(Constants.YEAR));

	}

	@When("I select the address details with FirstName <FirstName> LastName <LastName> Address <Address> City <City> State <State> ZipCode <PostalCode> Country <Country> MobilePhone <PhoneNumber>")
	public void i_select_the_address_details_with_FirstName_FirstName_LastName_LastName_Address_Address_City_City_State_State_ZipCode_PostalCode_Country_Country_MobilePhone_PhoneNumber(
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);

		accountPage.enter_FN_Address(list.get(0).get(Constants.FIRSTNAME));
		accountPage.enter_LN_Address(list.get(0).get(Constants.LASTNAME));
		accountPage.enter_Address(list.get(0).get(Constants.ADDRESS));
		accountPage.enter_City(list.get(0).get(Constants.CITY));
		accountPage.select_State(list.get(0).get(Constants.STATE));
		accountPage.enter_PostalCode(list.get(0).get(Constants.POSTALCODE));
		accountPage.select_Country(list.get(0).get(Constants.COUNTRY));
		accountPage.enter_MobileNumber(list.get(0).get(Constants.PHONENUMBER));

	}

	@When("I click on the Register button")
	public void i_click_on_the_Register_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		accountPage.click_Submit();
		Assert.assertTrue(signInPage.checkForTitle(Constants.USERPAGE_TITLE));
	}

	@When("I navigate to dress tab")
	public void i_navigate_to_dress_tab() {
		// Write code here that turns the phrase above into concrete actions
		userPage.click_DressTab();
	}

	@When("I Select a dress and Add to cart")
	public void i_Select_a_dress_and_Add_to_cart() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		userPage.scrollToQuickView();
		userPage.clickonQuickView();
		userPage.addtoCart();

	}

	@When("Click on the Proceed to checkout on Summary tab")
	public void click_on_the_Proceed_to_checkout_on_Summary_tab() {
		// Write code here that turns the phrase above into concrete actions
		userPage.proceedToCheckout();
		userPage.cartSummaryCheckout();
	}

	@When("Click on the Proceed to checkout on Address tab")
	public void click_on_the_Proceed_to_checkout_on_Address_tab() {
		// Write code here that turns the phrase above into concrete actions
		userPage.addressCheckout();
	}

	@When("I check the Terms of service and Click on the Proceed to checkout on Shipping tab")
	public void i_check_the_Terms_of_service_and_Click_on_the_Proceed_to_checkout_on_Shipping_tab()
			throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		userPage.termsofService();
		userPage.shippingCheckout();

	}

	@When("I click on the Pay by wire option")
	public void i_click_on_the_Pay_by_wire_option() {
		// Write code here that turns the phrase above into concrete actions
		userPage.paybyWire();
	}

	@When("I click on the I confirm my order")
	public void i_click_on_the_I_confirm_my_order() {
		// Write code here that turns the phrase above into concrete actions
		userPage.confirmButton();
		System.out.println(TestDriver.driver.getTitle());
	}

	@Then("I should be able to view the order confirmation page")
	public void i_should_be_able_to_view_the_order_confirmation_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(userPage.checkForTitle(Constants.ORDER_TITLE));
	}

	@When("I provide the existing email address <email>")
	public void i_provide_the_existing_email_address_email(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		signInPage.enter_Existing_Email(list.get(0).get(Constants.EMAIL));

	}

	@Then("I should be getting an error message stating account already exists")
	public void i_should_be_getting_an_error_message_stating_account_already_exists() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(userPage.getAccountExistsError());
		Assert.assertEquals("Error information is prompted appropriately", userPage.getAccountExistsError(),
				Constants.ACCOUNTEXISTS_ERROR);
	}

	@When("I provide the existing email address <email> and password <password> in the already registered section")
	public void i_provide_the_existing_email_address_email_and_password_password_in_the_already_registered_section(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		signInPage.email_login(list.get(0).get(Constants.EMAIL));
		signInPage.password_login(list.get(0).get(Constants.PASSWORD_LOGIN));
		signInPage.submit_login();
	}

	@Then("I should be able to login and land in the account me page")
	public void i_should_be_able_to_login_and_land_in_the_account_me_page() {
		// Write code here that turns the phrase above into concrete actsions
		Assert.assertTrue(signInPage.checkForTitle(Constants.USERPAGE_TITLE));

	}

	@Given("user is on the Automation Practice home page")
	public void user_is_on_the_Automation_Practice_home_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(userPage.checkForTitle(Constants.HOMEPAGE_TITLE));
	}

	@When("I click on the Sign in Page")
	public void i_click_on_the_Sign_in_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		homePage.clickonSignIn();
	}

	@Then("I should be able to view the Sign In page")
	public void i_should_be_able_to_view_the_Sign_In_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(signInPage.checkForTitle(Constants.SIGNIN_TITLE));
	}

}
