package com.automationpractice.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserAccountPageLocators {

	@FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement tab_Dress;

	@FindBy(how = How.CSS, using = ".product-image-container>a>img")
	public WebElement quickView;

	@FindBy(how = How.CSS, using = "#add_to_cart>button")
	public WebElement addTocart;

	@FindBy(how = How.NAME, using = "processAddress")
	public WebElement address_Checkout;

	@FindBy(how = How.XPATH, using = ".//a[contains(@title,'Proceed to checkout')]")
	public WebElement proceedToCheckout;

	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/p[2]/a[1]")
	public WebElement cartSummuaryCheckout;

	@FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button")
	public WebElement shippingCheckout;

	@FindBy(how = How.NAME, using = "cgv")
	public WebElement termsofService;

	@FindBy(how = How.CSS, using = "#HOOK_PAYMENT>div:nth-child(1)>div>p>a")
	public WebElement paybyWire;

	@FindBy(how = How.XPATH, using = "//*[@id='cart_navigation']/button")
	public WebElement confirm_Button;

	@FindBy(how = How.ID, using = "create_account_error")
	public WebElement account_Exists;

}
