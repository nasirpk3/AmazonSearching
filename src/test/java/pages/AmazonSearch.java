package pages;
/*
author: Nasir Sultan
linkedin: https://www.linkedin.com/in/nasirpk3/
* 
*/
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearch extends BasePage{

	public AmazonSearch(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//locators
	
	By searchField = By.id("twotabsearchtextbox");
	By searchIcon = By.id("nav-search-submit-button");
// 	By seeMore = By.xpath("(//span[text()='See more'])[1]");
	By clickTitan = By.xpath("//li[@aria-label='Titan']//span//a");
	By click25PercentOff = By.xpath("//span[text()='25% Off or more']");
	By clickAnalouge = By.xpath("//li[@aria-label='Analogue']//span//a");
	By clickLeather = By.xpath("//li[@aria-label='Leather']//span//a");
		By searchResultsFifthItem = By.xpath("//img[@data-image-index='5']/parent::div/parent::a/parent::span");
	By productTitleBy = By.id("productTitle");

	//testmethod
	
	public void searchWristWatch() throws InterruptedException {
		
		//wait for search field and write text into it.
		waitVisibility(searchField); writeText(searchField, "Wrist Watches");
		
		//wait for search icon and clickon it
		waitVisibility(searchIcon);	click(searchIcon);
		
		//wait for Titan checkbox and click on it.		
		waitVisibility(clickTitan); click(clickTitan);
		
		//wait for Analouge checkbox and click on it.
		waitVisibility(clickAnalouge); click(clickAnalouge);
		
		//wait for Leather checkbox and click on it.
		waitVisibility(clickLeather); click(clickLeather);
		
		//wait for 25 percentoff and click on it.
		waitVisibility(click25PercentOff); click(click25PercentOff);
		
		//wait for search results and click on fifth item.
		waitVisibility(searchResultsFifthItem); click(searchResultsFifthItem);
		
		//code for switching to new tab.
		
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1)); //Tab number

			//Can change it for next tab like that or previous:

			driver.switchTo().window(tabs.get(1));
		
			//wait for product title visibility
			waitVisibility(productTitleBy);				
			System.out.println("Fifth Item in search results is: " + readText(productTitleBy));
		
			//close newly opened tab
			driver.close();
		
		//switch the handle back to the parrent tab.
		driver.switchTo().window(tabs.get(0));
			
		
	}

}
