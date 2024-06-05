package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelBookingPage extends BookingConformationPage {

	@FindBy(xpath="//a[@href=\"BookedItinerary.php\"]")
	private WebElement clickBookItenery;
	
	@FindBy(xpath="//input[@name=\"order_id_text\"]")
	private WebElement selctOrderId;
	
	@FindBy(xpath="//input[@name=\"search_hotel_id\"]")
	private WebElement goBtn;
	
	@FindBy(xpath ="//input[@name=\"check_all\"]")
	private WebElement radioBtn;
	
	@FindBy(xpath="//input[@name=\"cancelall\"]")
	private WebElement cancelBtn;
	
	//Getters only

	public WebElement getClickBookItenery() {
		return clickBookItenery;
	}

	public WebElement getSelctOrderId() {
		return selctOrderId;
	}

	public WebElement getGoBtn() {
		return goBtn;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	
	public void cancelBooking() {
		elementClick(getClickBookItenery());
		elementSendKeys(getSelctOrderId(),value);
		elementClick(getGoBtn());
		elementClick(getRadioBtn());
		elementClick(getCancelBtn());
		acceptAlert();

	}
	

	
	
	
	
	
	
	
}
