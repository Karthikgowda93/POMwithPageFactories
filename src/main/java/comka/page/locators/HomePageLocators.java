package comka.page.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class HomePageLocators {

	
	@FindBy(css="#tab-flight-tab-hp")
	public WebElement flightsTab;
	
	// locators to book a flight
	
	@FindBy(css="#flight-origin-hp-flight") 
	public WebElement fromCity;
	@FindBy(css="#flight-destination-hp-flight")
	public WebElement ToCity;
	@FindBy(css="#flight-departing-hp-flight")
	public WebElement departing;

	@FindAll({  // benefit of using FindAll will find the element even when one of the locators is wrong or dynamic for ex: if css is wrong then it will find element by xpath
		
		@FindBy(css="#flight-returning-hp-flight"),
		@FindBy(xpath = "//input[@id='flight-returning-hp-flight']")
		
	})
	public WebElement returning;
	
	@FindBys({ // benefit of using FindBys is that, it will find the element within the block
		//for ex: first FindBy will be the block Css, within that the second FindBy will locate the Element 
		
		@FindBy(css="#wizard-tabs"),
		@FindBy(xpath="//div[@class='menu-bar gcw-travel-selector-wrapper']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")
		
	})
	public WebElement adult;
	
	@FindBy(xpath="//div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']/div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']/div[@class='uitk-col all-col-shrink']/button[@class='uitk-step-input-button uitk-step-input-plus']/span[@class='uitk-icon']/*[1]")
	public WebElement addAdultbtn;
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	public WebElement searchbtn;
	@FindBy(css="#wizard-tabs")
	public WebElement block;
	
	// finding all the menu's on the block
	@FindBy(xpath ="//li[@style='display: list-item;']//button[@type='button']")
	public List<WebElement> menucount;
	

	// locators for booking Flight And Hotel 
	
	@FindBy(css="#tab-package-tab-hp")
	public WebElement hotelAndFlightTab;
	
	@FindBy(css="#package-origin-hp-package")
	public WebElement Origin;
	@FindBy(css="#package-destination-hp-package")
	public WebElement destination;
	@FindBy(css="#package-departing-hp-package")
	public WebElement departing2;
	@FindBy(css="#package-returning-hp-package")
	public WebElement returning2;
	@FindBy(xpath="//div[@id='traveler-selector-hp-package']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")
	public WebElement traveller;
	@FindBy(xpath="//div[@class='traveler-selector-room-data target-clone-field']/div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']/div[@class='uitk-col all-col-shrink']/button[@class='uitk-step-input-button uitk-step-input-plus']/span[@class='uitk-icon']/*[1]")
	public WebElement adults;
	@FindBy(xpath="//div[@class='infants-wrapper']//div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']//button[@class='uitk-step-input-button uitk-step-input-plus']//*[@class='uitk-icon-svg uitk-step-input-icon']")
	public WebElement infants;
	
	@FindBy(xpath="//*[@id=\"traveler-selector-hp-package\"]/div/ul/li/div/div/div[1]/div[3]/div[1]/div[4]/button/span[1]")
	public WebElement addChild;
	
	
	@FindBy(xpath="//div[@class='traveler-selector-room-data target-clone-field']//div[@class='children-wrapper']//button[@class='uitk-step-input-button uitk-step-input-plus']//*[@class='uitk-icon-svg uitk-step-input-icon']")
	public WebElement children;
	@FindBy(xpath="(//select[@class='gcw-storeable gcw-toggles-field-by-value gcw-child-age-select gcw-child-age-1-1-fh'])[2]")
	public WebElement childAge;
	@FindBy(xpath="//label[@class='select icon icon-toggle180 col gcw-infant-field infant-age-1-hp-package gcw-child-field']//select[@class='gcw-storeable gcw-toggles-field-by-value gcw-child-age-select gcw-infant-age-1-fh']")
	public WebElement infantAge;
	@FindBy(css="#partialHotelBooking-hp-package")
	public WebElement checkbox;
	@FindBy(css="#package-checkin-hp-package")
	public WebElement checkin;
	@FindBy(css="#package-checkout-hp-package")
	public WebElement checkout;
	@FindBy(css="#package-advanced-preferred-class-hp-package")
	public WebElement classOptions;
	
	@FindBy(css="#search-button-hp-package")
	public WebElement searchbtn2;


	
	
}
