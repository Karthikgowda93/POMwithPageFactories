package com.ka.testCases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ka.base.page;
import com.ka.page.actions.HomePage;
import com.ka.utilities.Utilities;

public class hotelAndFlightTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void HotelAndFlightTest(Hashtable<String, String> data) {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping thetest case as runmode is N");
		}

		page.initConfiguration();

		HomePage hp = new HomePage();
		hp.goToFlightsAndHotels().bookHotelAndFlight(data.get("origin"), data.get("destination"), data.get("departing2"),
				data.get("returning2"), data.get("age1"), data.get("age2"), data.get("checkin"), data.get("checkout"),
				data.get("value"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@AfterMethod
	public void tearDown() {
		
		if(page.driver!=null) {
			page.quitBrowser();
		}
		
	}

}
