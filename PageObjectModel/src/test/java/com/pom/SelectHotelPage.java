package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseLib {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	//SelectHotel locators
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(id="continue")
	private WebElement contBtn;
	
	//Getters only
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContBtn() {
		return contBtn;
	}
	
	public void selectHotelBtn() {
		elementClick(getRadioButton());
		elementClick(getContBtn());
	}
	

	
	
	
	
	
	
	
}
