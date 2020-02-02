package com.ka.base;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ka.listeners.customlistener;
import com.ka.page.actions.topNavigation;
import com.ka.utilities.ExcelReader;
import com.ka.utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class page {

	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\testData.xlsx");
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;

	public static Date d = new Date();
	//static String fileName = d.toString().replace(":", "_").replace(" ", "_")+".html";
	 static String fileName = "Extent.html"; // this is for the extent reports to
	// Jenkins

	public static ExtentReports extent = ExtentManager
			.createInstance(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + fileName);

	public static ExtentTest test;
	public static String browser;
	public static topNavigation topNav;
	

	public static void initConfiguration() {

		if (constants.browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable_extensions");
			options.addArguments("--disable_infobars");
			options.addArguments("--incognito");

			driver = new ChromeDriver(options);
			log.debug("Launching Chrome");

		} else if (constants.browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.debug("Launching firefox");
		} else if (constants.browser.equals("ie")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			log.debug("Launching ie");
		}

		driver.get(constants.testURL);
		log.debug("Navigated to Expedia website");
		driver.manage().window().maximize();
		
		topNav = new topNavigation(driver);
		/*
		 * driver.manage().timeouts().implicitlyWait(constants.implicitWait,
		 * TimeUnit.SECONDS); wait = new WebDriverWait();
		 */

	}
	
	public static void click(WebElement element) {
	
		element.click();
		log.debug("clicking on the Element"+element);
		customlistener.testReport.get().log(Status.INFO, element+"");
		
	}
	
	public static void type(WebElement element, String value) {
		
		element.sendKeys(value);
		log.debug("Typing on Element "+element+" with value as "+value);
		customlistener.testReport.get().log(Status.INFO, "typing on Element "+element+"  with value as "+value);
		
	}
	

	public static void quitBrowser() {
		driver.quit();

	}

}
