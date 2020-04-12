package com.automationpractice.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPageLocators 
{
	@FindBy(how=How.ID , using="email_create")
    public WebElement email;

    @FindBy(how=How.ID , using="SubmitCreate")
    public WebElement Submit;

    @FindBy(how=How.ID , using="email")
    public WebElement email_login;

    @FindBy(how=How.ID , using="passwd")
	public WebElement password;

    @FindBy(how= How.ID , using="SubmitLogin")
    public WebElement login;
}
