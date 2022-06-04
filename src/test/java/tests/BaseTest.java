package tests;
/*
 author: Nasir Sultan
 linkedin: https://www.linkedin.com/in/nasirpk3/
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	//this method will run before each testcase.	
	@BeforeMethod
	public void setup() {
		String baseURL = "https://www.amazon.in/";
		String driverPath ="C:\\eclipse\\eclipse-workspace\\ams\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	
	//this method will run after each testcase
	@AfterMethod
	public void teardown( ) {
		driver.close();
	}

}
