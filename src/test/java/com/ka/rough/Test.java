package com.ka.rough;

import com.ka.base.page;
import com.ka.page.actions.HomePage;

public class Test extends page {

	
	public static void main(String[] args) {
		
		
		page.initConfiguration();
		HomePage hp = new HomePage();
		hp.goToFlights().bookAFlights("Bengaluru, India (BLR-Kempegowda Intl.)", "Madrid, Spain (MAD-All Airports)", "04/11/2020", "18/11/2020");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.quitBrowser();
	}
	
	
}
