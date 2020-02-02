package com.ka.page.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ka.base.page;

import comka.page.locators.HomePageLocators;

public class HomePage extends page {
	
	public HomePageLocators home;
	
	public HomePage() {

		this.home = new HomePageLocators();
		
		// it will get used only when the element in use
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 6);
		PageFactory.initElements(factory, this.home);
	}
	
	
	public HomePage goToFlights() {
		
		click(home.flightsTab);
		return this;
		
	}
	
	
	public void goToHotels() {
		
		
	}
	
	public void goToCarHire() {
		
		
	}
	
	public void goToHolidayActivities() {
		
		
	}
	
	public int menuCount() {
		
		return home.menucount.size();
	}
	
	
	public void bookAFlights(String from, String to, String departing, String returning) {
		
		type(home.fromCity,from);
		type(home.ToCity,to);
		type(home.departing,departing);
		//action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		home.returning.sendKeys(Keys.CONTROL+"a"+Keys.CONTROL+returning);	
		click(home.adult);
		click(home.addAdultbtn);
		
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ESCAPE).perform();
		
		//Thread.sleep(2000);
		click(home.block);
		
		//Thread.sleep(2000);
		click(home.searchbtn);
		
		
	}
	
	
	

}
