package pages;
/*
author: Nasir Sultan
linkedin: https://www.linkedin.com/in/nasirpk3/
* 
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions actions;
	
	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	// generic methods to perform different actions
	
	public void click(By elementlocation) {
		driver.findElement(elementlocation).click();
	}
	
	public void writeText(By elementlocation, String text) {
		driver.findElement(elementlocation).sendKeys(text);
	}
	
	public String readText(By elementlocation) {
		return driver.findElement(elementlocation).getText();	
	}
	
	public void waitVisibility(By elementlocation) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementlocation));
	}
}
