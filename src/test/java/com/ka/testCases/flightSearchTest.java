package com.ka.testCases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ka.base.page;
import com.ka.errorCollectors.ErrorCollector;
import com.ka.page.actions.HomePage;
import com.ka.utilities.Utilities;

public class flightSearchTest {



	@Test(dataProviderClass = Utilities.class, dataProvider="dp")
	public void FlightSearchTest(Hashtable<String, String> data) {
		
		
		if(data.get("runmode").equalsIgnoreCase("N")) {
			
			throw new SkipException("Skipping the test case as the runmode is N");
		}
		page.initConfiguration();
		
		HomePage hp = new HomePage();
		
		//Assert.assertEquals(hp.menuCount(), 6);
		
		/*
		 * ErrorCollector.verifyEquals(hp.menuCount(), 6);
		 * ErrorCollector.verifyEquals(hp.menuCount(), 7);
		 */                                               //********************************************Important*****************************//
		ErrorCollector.verifyEquals(hp.menuCount(), 5);// while reading the data from excel if in case the date is not reading in the format then
		                                               // try adding ' in every date column
		hp.goToFlights().bookAFlights(data.get("from"), data.get("to"), data.get("departing"), data.get("returning"));
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
