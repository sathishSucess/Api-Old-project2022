package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseLib {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);

	}

	// Search hotel locators

	@FindBy(xpath = "//select[@name=\"location\"]")
	private WebElement dDnLocation;
	@FindBy(xpath = "//select[@name=\"hotels\"]")
	private WebElement dDnHotel;
	@FindBy(xpath = "//select[@name=\"room_type\"]")
	private WebElement dDnRoomType;
	@FindBy(xpath = "//select[@name=\"room_nos\"]")
	private WebElement dDnRoomNum;
	@FindBy(xpath = "//input[@name=\"datepick_in\"]")
	private WebElement dDnCheckIn;
	@FindBy(xpath = "//input[@name=\"datepick_out\"]")
	private WebElement dDnCheckOut;
	@FindBy(xpath = "//select[@name=\"adult_room\"]")
	private WebElement dDnAdultRoom;
	@FindBy(xpath = "//select[@name=\"child_room\"]")
	private WebElement dDnChildRoom;
	@FindBy(id = "Submit")
	private WebElement submitBtn;

	// Getters only
	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNum() {
		return dDnRoomNum;
	}

	public WebElement getdDnCheckIn() {
		return dDnCheckIn;
	}

	public WebElement getdDnCheckOut() {
		return dDnCheckOut;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void searchHotelData(String location, String hotel, String roomType, String roomNum, String checkIn,
			String checkOut, String adultRoom, String childRoom) {

		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnHotel(), hotel);
		selectOptionByText(getdDnRoomType(), roomType);
		selectOptionByText(getdDnRoomNum(), roomNum);
		elementSendKeys(getdDnCheckIn(), checkIn);
		elementSendKeys(getdDnCheckOut(), checkOut);
		selectOptionByText(getdDnAdultRoom(), adultRoom);
		selectOptionByText(getdDnChildRoom(), childRoom);
		elementClick(getSubmitBtn());

	}

}
