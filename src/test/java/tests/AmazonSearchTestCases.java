package tests;
/*
author: Nasir Sultan
linkedin: https://www.linkedin.com/in/nasirpk3/
* 
*/
import org.testng.annotations.Test;

import pages.AmazonSearch;

public class AmazonSearchTestCases extends BaseTest{
	
	
	@Test
	public void searchWristWatchWithFilters() throws InterruptedException {
		AmazonSearch obj = new AmazonSearch(driver, wait);
		obj.searchWristWatch();
		Thread.sleep(2000);
	}
}
