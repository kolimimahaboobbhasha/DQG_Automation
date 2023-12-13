package com.global;


import org.openqa.selenium.WebElement;

/* This class contains all the generic methods which is related to Validations
 * @Author Bhasha.k */

public class Validations { 
	/* This method will checks the intendent and realized value are equal
	 * @Param intendent
	 * @Param realized */
	public void verifyTwoValues(String intendent, String realized) {
		assertionEquals(realized, intendent);
	}
	/* This method will checks the element is visible 
	 * @Param element */
	public void validatingElementVisibility(WebElement element) {
		boolean value=isDisplay(element);
		assertionTrue(value);
	} 
	
	/*
	 * This method will checks the element not visible 
	 * @Param element */
	public void validatingElementInvisibility(WebElement element) {
		boolean value=!isDisplay(element);
		assertionTrue(value);
	}
	
	/* This method is for assertionTrue
	 * @Param value */
	public void assertionTrue(boolean value) {
		//Assert.assertTrue(value);
	}
	
	/* This method is for retreiving the text from the webelement
	 * @Param element */
	public String getText(WebElement element) {
		return element.getText();
	}
	
	/* This method is for element is displayed or not
	 * @Param element */
	public boolean isDisplay(WebElement element) {
	   return element.isDisplayed();
	}
	
	/* This method is for checking assertionsEquals 
	 * @Param intendentValue
	 * @Param realizedValue */
	public void assertionEquals(String intendentValue, String realizedValue) {
	//	Assert.assertEquals(realizedValue, intendentValue);
	}
	
}
