package com.ka.page.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	public HomePage goToFlightsAndHotels() {
		
		click(home.hotelAndFlightTab);
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
	
	public void bookHotelAndFlight(String origin, String destination, String departing2, String returning2, String age1, String age2, String checkin, String checkout, String value) {
		
		
		type(home.Origin, origin);
		type(home.destination, destination);
		type(home.departing2, departing2);
		home.returning2.sendKeys(Keys.CONTROL+"a"+Keys.CONTROL+returning2);	
		//type(home.returning2, returning2);
		click(home.traveller);
		
		click(home.adults);
		
		click(home.children);
		type(home.childAge, age1);
		click(home.infants);
		type(home.infantAge, age2);
		click(home.checkbox);
		type(home.checkin, checkin);
		home.checkout.sendKeys(Keys.CONTROL+"a"+Keys.CONTROL+checkout);
		//type(home.checkout, checkout);
		/*
		 * Select select = new Select(home.classOptions); select.selectByValue(value);
		 */
		select(home.classOptions, value);
		click(home.searchbtn2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	

}
