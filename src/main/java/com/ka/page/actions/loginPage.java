package com.ka.page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ka.base.page;

import comka.page.locators.loginPageLocators;

public class loginPage extends page{

	public loginPageLocators loginpageL;
	
	public loginPage() {
		this.loginpageL = new loginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.loginpageL);
		
	}
	
	
	public void signIn(String username, String password) {
	
		type(loginpageL.username,username);
		type(loginpageL.password,password);
		click(loginpageL.submit);
		
	}
	
	
	
}
