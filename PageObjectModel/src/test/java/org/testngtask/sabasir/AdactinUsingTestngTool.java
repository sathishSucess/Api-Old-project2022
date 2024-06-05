package org.testngtask.sabasir;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinUsingTestngTool extends BaseLib {
	
	@Parameters({"User","pass","location","hotel","room","roomno","checkin","checkout","adultroom","childroom","firstname","lastname","adress","ccnum","cctype","expmonth","expyear","cvv"})
	@Test
	
	public void loginPage( @Optional("sathishFam")String useId,String passWord,String location,String hotel,String roomType,String roomNum,String checkIn,String checkOut,String adultRoom,String childRoom,String fristName,String lastName,String address,String ccNum,String ccType,String expMonth,String expYear,String ccCvv ) {
			
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
				WebElement txtRoom = elementFindById("room_type");
				elementSendKeys(txtRoom, roomType);		
				WebElement txtNum = elementFindById("room_nos");
				elementSendKeys(txtNum, roomNum);
				WebElement txtCheckIn = elementFindById("datepick_in");
				elementSendKeys(txtCheckIn, checkIn);
				WebElement txtCheckOut = elementFindById("datepick_out");
				elementSendKeys(txtCheckOut, checkOut);
				WebElement txtAdultRoom = elementFindById("adult_room");
				elementSendKeys(txtAdultRoom, adultRoom);
				WebElement txthildRoom = elementFindById("child_room");
				elementSendKeys(txthildRoom, childRoom);
				WebElement btnSubmit = elementFindById("Submit");
				elementClick(btnSubmit);
		//select hotel
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
				elementSendKeys(txtCardType, ccType);
				WebElement txtExpMonth = elementFindById("cc_exp_month");
				elementSendKeys(txtExpMonth, expMonth);
				WebElement txtExpYear = elementFindById("cc_exp_year");
				elementSendKeys(txtExpYear, expYear);
				WebElement txtCardCvv = elementFindById("cc_cvv");
				elementSendKeys(txtCardCvv, ccCvv);
				WebElement btnBookNow = elementFindById("book_now");
				elementClick(btnBookNow);
	
	
		  //Booking Confirmation locator
		WebElement txtOrder = elementFindById("order_no");
				
	}
	
	
	
	
	
	
	
	
}
