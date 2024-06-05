package org.testngtask.sabasir;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNgDataProviderInDiffClassUsingAdactinHotel extends BaseLib {

	@Test(dataProvider = "Adactin automation", dataProviderClass = SperateDataProviderClass.class)
	private void browserLanunchAndLoginFunction(String useId, String passWord, String location, String hotel,
			String roomType, String roomNum, String checkIn, String checkOut, String adultRoom, String childRoom,
			String fristName, String lastName, String address, String ccNum, String ccType, String expMonth,
			String expYear, String ccCvv) {

		getDriver();
		enterUrl("http://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait(30);

		WebElement txtUser = elementFindById("username");
		elementSendKeys(txtUser, useId);
		WebElement txtPass = elementFindById("password");
		elementSendKeys(txtPass, passWord);
		WebElement btnClick = elementFindById("login");
		elementClick(btnClick);
		implicitWait(30);

		// search hotel
		WebElement txtloc = elementFindById("location");
		selectOptionByText(txtloc, location);
		WebElement txtHotel = elementFindById("hotels");
		selectOptionByText(txtHotel, hotel);
		WebElement txtRoom = elementFindById("room_type");
		selectOptionByText(txtRoom, roomType);
		WebElement txtNum = elementFindById("room_nos");
		selectOptionByText(txtNum, roomNum);
		WebElement txtCheckIn = elementFindById("datepick_in");
		elementSendKeys(txtCheckIn, checkIn);
		WebElement txtCheckOut = elementFindById("datepick_out");
		elementSendKeys(txtCheckOut, checkOut);
		WebElement txtAdultRoom = elementFindById("adult_room");
		selectOptionByText(txtAdultRoom, adultRoom);
		WebElement txthildRoom = elementFindById("child_room");
		selectOptionByText(txthildRoom, childRoom);
		WebElement btnSubmit = elementFindById("Submit");
		elementClick(btnSubmit);

		// select hotel
		WebElement radioBtn = elementFindById("radiobutton_0");
		elementClick(radioBtn);
		WebElement btnCont = elementFindById("continue");
		elementClick(btnCont);

		// Book Hotel locator
		WebElement txtFirstName = elementFindById("first_name");
		elementSendKeys(txtFirstName, fristName);
		WebElement txtLastName = elementFindById("last_name");
		elementSendKeys(txtLastName, lastName);
		WebElement txtAddress = elementFindById("address");
		elementSendKeys(txtAddress, address);
		WebElement txtCardNum = elementFindById("cc_num");
		elementSendKeys(txtCardNum, ccNum);
		WebElement txtCardType = elementFindById("cc_type");
		selectOptionByText(txtCardType, ccType);
		WebElement txtExpMonth = elementFindById("cc_exp_month");
		selectOptionByText(txtExpMonth, expMonth);
		WebElement txtExpYear = elementFindById("cc_exp_year");
		selectOptionByText(txtExpYear, expYear);
		WebElement txtCardCvv = elementFindById("cc_cvv");
		elementSendKeys(txtCardCvv, ccCvv);
		WebElement btnBookNow = elementFindById("book_now");
		elementClick(btnBookNow);

		// Booking Confirmation locator
		WebElement txtOrder = elementFindById("order_no");
		String attributeValue = elementGetAttributeValue(txtOrder);
		System.out.println(attributeValue);
		windowQuit();
		
	}

}
