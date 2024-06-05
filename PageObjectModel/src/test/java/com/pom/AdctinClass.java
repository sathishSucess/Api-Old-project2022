package com.pom;

public class AdctinClass extends BaseLib {

public static void main(String[] args) {
	
	BaseLib lib=new BaseLib();
	
	BaseLib.getDriver();
	BaseLib.enterUrl("http://adactinhotelapp.com/");
	BaseLib.maximizeWindow();
	
	
	//loginpage Object
	LoginPage log=new LoginPage();
	log.loginData("sathishFam","741@85BN");
	
	
	//SearchHotelpage Object
	SearchHotelPage serhHotel=new SearchHotelPage();
	serhHotel.searchHotelData("London", "Hotel Sunshine ", "Double", "8 - Eight", "12-08-2022", "15-08-2022", "2 - Two", "3 - Three");
	
	//SelectHotelPage object
	SelectHotelPage selHotel=new SelectHotelPage();
	selHotel.selectHotelBtn();
	
	//BookHotelPage object
	BookHotelPage bookHotel=new BookHotelPage();
	bookHotel.bookHotelData("Sathish", "Kumar", "Omr Chennai", "1234567891234560", "VISA", "November", "2022", "1211");
	bookHotel.implicitWait1(30);
	
	BookingConformationPage bookConfPage=new BookingConformationPage();
	bookConfPage.bookingConformation();
	
	CancelBookingPage cancelBooking=new CancelBookingPage();
	cancelBooking.cancelBooking();
 }	
	

}
