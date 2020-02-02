package comka.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class topNavigationPageLocators {
	
	
	@FindBy(css= "#header-account-menu")
	public WebElement account;
	
	@FindBy(css="#account-signin")
	public WebElement signIn;
	
	

}
