package com.ka.testCases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ka.base.page;
import com.ka.page.actions.loginPage;
import com.ka.utilities.Utilities;

public class testCaseLogin {

	
	
	
	@Test(dataProviderClass = Utilities.class, dataProvider="dp")
	public void TestCaseLogin(Hashtable<String, String> data) {
		
		
		if(data.get("runmode").equalsIgnoreCase("N")) {
			
			throw new SkipException("Skipping the Test case as the runmode is N");
		}
		
		page.initConfiguration();
		loginPage lp = page.topNav.goToSignin();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lp.signIn(data.get("username"), data.get("password"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@AfterMethod
	public void tearDown() {
		if(page.driver!=null)
		page.quitBrowser();

	}
	
}
