package org.testngtask.sabasir;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNg extends BaseLib {

	@DataProvider(name="login")
	private Object[][] getDatas() throws IOException {
		return new Object[][] {{"sathishFam","741@85BN","Melbourne","Hotel Creek"},
			{"sathishFam","741@85BN","Sydney","Hotel Sunshine"},
			{"sathishFam","741@85BN","Adelaide","Hotel Cornice"},
			{"sathishFam","741@85BN","Brisbane","Hotel Hervey"}};
	}
	
	@Test(dataProvider = "login")
	private void adctinLogin(String useId,String passWord,String location,String hotel ) {
		getDriver();
		enterUrl("http://adactinhotelapp.com/");
		maximizeWindow();
		WebElement txtUser = elementFindById("username");
		elementSendKeys(txtUser, useId);
		WebElement txtPass = elementFindById("password");
		elementSendKeys(txtPass, passWord);
		WebElement btnClick = elementFindById("login");
		elementClick(btnClick);
		implicitWait(30);
		
	
		//search hotel
				WebElement txtloc = elementFindById("location");
				elementSendKeys(txtloc, location);
				WebElement txtHotel = elementFindById("hotels");
				elementSendKeys(txtHotel, hotel);
				
//				WebElement txtRoom = elementFindById("room_type");
//				elementSendKeys(txtRoom, roomType);		
//				WebElement txtNum = elementFindById("room_nos");
//				elementSendKeys(txtNum, roomNum);
//				WebElement txtCheckIn = elementFindById("datepick_in");
//				elementSendKeys(txtCheckIn, checkIn);
//				WebElement txtCheckOut = elementFindById("datepick_out");
//				elementSendKeys(txtCheckOut, checkOut);
//				WebElement txtAdultRoom = elementFindById("adult_room");
//				elementSendKeys(txtAdultRoom, adultRoom);
//				WebElement txthildRoom = elementFindById("child_room");
//				elementSendKeys(txthildRoom, childRoom);
//				WebElement btnSubmit = elementFindById("Submit");
//				elementClick(btnSubmit);
//		//select hotel
//				WebElement radioBtn = elementFindById("radiobutton_0");
//				elementClick(radioBtn);
//				WebElement btnCont = elementFindById("continue");
//				elementClick(btnCont);
//				
//		// Book Hotel locator
//		
//				WebElement txtFirstName = elementFindById("first_name");
//				elementSendKeys(txtFirstName, fristName);
//				WebElement txtLastName = elementFindById("last_name");
//				elementSendKeys(txtLastName, lastName);
//				WebElement txtAddress = elementFindById("address");
//				elementSendKeys(txtAddress, address);
//				WebElement txtCardNum = elementFindById("cc_num");
//				elementSendKeys(txtCardNum, ccNum);
//				WebElement txtCardType = elementFindById("cc_type");
//				elementSendKeys(txtCardType, ccType);
//				WebElement txtExpMonth = elementFindById("cc_exp_month");
//				elementSendKeys(txtExpMonth, expMonth);
//				WebElement txtExpYear = elementFindById("cc_exp_year");
//				elementSendKeys(txtExpYear, expYear);
//				WebElement txtCardCvv = elementFindById("cc_cvv");
//				elementSendKeys(txtCardCvv, ccCvv);
//				WebElement btnBookNow = elementFindById("book_now");
//				elementClick(btnBookNow);
//	
//	
//		  //Booking Confirmation locator
//		WebElement txtOrder = elementFindById("order_no");
//				String attributeValue = elementGetAttributeValue(txtOrder);
//				

	}
	
	
	
	
}
