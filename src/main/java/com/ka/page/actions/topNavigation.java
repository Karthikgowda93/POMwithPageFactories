package com.ka.page.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ka.base.page;

import comka.page.locators.topNavigationPageLocators;

public class topNavigation {
	
	public topNavigationPageLocators topNavigation; 
	
	public topNavigation(WebDriver driver) {
		
		this.topNavigation = new topNavigationPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
		
	}
	
	
	public loginPage goToSignin() {
		
		page.click(topNavigation.account);
		page.click(topNavigation.signIn);
		return new loginPage();
	}
	
	public void goToMyLiss() {
		
	}
	
	public void goToManageTrips() {
		
	}
	
	public void goToSupport() {
		
		
	}
	
	
	
	

}
