package com.ka.rough;

import com.ka.base.page;
import com.ka.page.actions.loginPage;

public class loginTest {

	
	public static void main(String[] args) {
		
		
		page.initConfiguration();
		loginPage  lp= page.topNav.goToSignin();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.signIn("karthikbdvt6@gmail.com", "wsgdhjeklce");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.quitBrowser();
		
		
	}
	
	
}
