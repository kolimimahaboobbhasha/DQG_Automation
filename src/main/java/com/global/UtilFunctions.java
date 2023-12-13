package com.global;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* This class contains all the generic methods which is related to WebDriver
 *@Author Bhasha.k */
public class UtilFunctions {
	Actions action;
	WebDriverWait wait;
	JavascriptExecutor js;
	 WebDriver driver;
	
	public  UtilFunctions(WebDriver driver) {
		this.driver=driver;
	}
	 /* This method is used to move the curser on the element
	  * @Param element */
	public void moveToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	 /* This method is used to maximize the window */
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	/* This method is used to do window handle from one tab to another tab
	  *@Param title */
	public void windowHandle(String title) {
		Set<String>allwindowhandleID=driver.getWindowHandles();
		for(String wind:allwindowhandleID) {
		String currentTitle=driver.switchTo().window(wind).getTitle();
			if (currentTitle.contains(title)) {
				break;
			}
	}
		}
	/* This method will wait for particular element to be clickable
	  * @Param element
	  * @Param time */
	public void explicitWaitForElementClickable(WebElement element, int time) {
	    wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/* This method is used to scroll the page upto particular webelement
	  * @Param element */
	public void scrollToParticularElement(WebElement element) {
      js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	/*
	  * This method will wait till the particular webelement get visible
	  * @Param element
	  * @Param time */
	public void expicitWaitForVisibilityOfElement(WebElement element, int time) {
	    wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/* This method is used to click the webelement
	  *@Param element */
	public void ClickOnElement(WebElement element) {
		element.click();
	}
	/* This method is used to send data to element
	 * @Param element
	 * @Param data */
	public void sendText(WebElement element,String data) {
		element.sendKeys(data);	
	}
	/* This method is used to get the url
	 * @Param url */
	public void url(String url) {
		driver.get(url);
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void expicitWaitForVisibilityOfTitle(String title, int time) {
	    wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public void waitUntillElementVisible( WebElement ele)
	{
		try {
		Thread.sleep(5000);
		}
		catch(Exception e) {
			
		}
	}
	
	public void downKey() 
	{
		try {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		}
		catch (Exception e) {
			
		}
	}
	
	public void scrolltoElement(WebElement ele)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", ele);
				
	}
	
	public void scrollby()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", " ");
	}
	
}
	
	
