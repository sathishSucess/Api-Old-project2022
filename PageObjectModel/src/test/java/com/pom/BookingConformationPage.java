package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConformationPage extends BaseLib {
	static String value;
	public BookingConformationPage() {
		PageFactory.initElements(driver, this);
	}

	// Booking confirmation order number locator
	
	@FindBy(xpath="//input[@name=\"order_no\"]")
	private WebElement txtOrderNo;
  //getter only
	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
	
	public void bookingConformation() {
		 value = elementGetAttributeValue(getTxtOrderNo());
		System.out.println(value);
	}
	

	
	
	
	
}
