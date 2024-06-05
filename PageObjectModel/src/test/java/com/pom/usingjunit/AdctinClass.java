package com.pom.usingjunit;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class AdctinClass extends BaseLib {

	@BeforeClass
	public static void browserLanuch() {
		getDriver();
		enterUrl("http://adactinhotelapp.com/");
		maximizeWindow();
	}
	
	
	@Test
	public void listOfpages() throws IOException {

		// loginpage
		LoginPage log = new LoginPage();
		log.loginData("sathishFam", "741@85BN");

		// SearchHotelpage
		SearchHotelPage serhHotel = new SearchHotelPage();
		serhHotel.searchHotelData("London", "Hotel Sunshine ", "Double", "8 - Eight", "12-08-2022", "15-08-2022",
				"2 - Two", "3 - Three");

		// SelectHotelPage
		SelectHotelPage selHotel = new SelectHotelPage();
		selHotel.selectHotelBtn();

		// BookHotelPage
		BookHotelPage bookHotel = new BookHotelPage();
		bookHotel.bookHotelData("Sathish", "Kumar", "Omr Chennai", "1234567891234560", "VISA", "November", "2022",
				"1211");
		implicitWait1(30);

		// BookingConformationPage
		BookingConformationPage bookConfPage = new BookingConformationPage();
		bookConfPage.bookingConformation();

	}
}
