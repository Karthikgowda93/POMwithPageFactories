package comka.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageLocators {
	
	
	
	@FindBy(css= "#gss-signin-email")
	public WebElement username;
	@FindBy(css= "#gss-signin-password")
	public WebElement password;
	
	@FindBy(css="#gss-signin-submit")
	public WebElement submit;

}
