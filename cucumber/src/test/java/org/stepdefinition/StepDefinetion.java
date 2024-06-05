package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinetion extends BaseLib {
	
	@Given("User is on the Adactin Page")
	public void browserLanuch() {
		getDriver();
		enterUrl("http://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait(30);
	}
	
	@When("User Should Enter {string} and {string}")
	public void user_should_enter_and(String userName, String pass) {
		WebElement txtUser = elementFindById("username");
		elementSendKeys(txtUser, userName);
		WebElement txtPass = elementFindById("password");
		elementSendKeys(txtPass, pass);
		
	}
	@When("User Should Click Login button")
	public void user_should_click_login_button() {
		WebElement btnClick = elementFindById("login");
		elementClick(btnClick);
	}
	@When("User is on the Search Hotel Page {string} {string} {string} {string} {string} {string} {string} and {string}")
	public void user_is_on_the_search_hotel_page_and(String location, String hotel, String roomType, String roomNum, String checkIn, String checkOut, String adultRoom, String childRoom) {
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
	}




	
	@Then("User is on the Select Hotel Page to Select Hotel and Click continue button")
	public void user_is_on_the_select_hotel_page_to_select_hotel_and_click_continue_button() {
		driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]")).click();
		driver.findElement(By.id("continue")).click();

	}
	@When("User is on Book Hotel Page {string} {string} {string} {string} {string} {string} {string} and {string}")
	public void user_is_on_book_hotel_page_and(String fristName, String lastName, String address, String ccNum, String ccType, String month, String year, String cvvNo) {
	    
		driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys(fristName);

		driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys(lastName);

		driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys(address);

		WebElement cardNum = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
		cardNum.sendKeys(ccNum);
		WebElement cardType = driver.findElement(By.xpath("//select[@name=\"cc_type\"]"));
		Select selectCardType = new Select(cardType);
		selectCardType.selectByVisibleText(ccType);
		WebElement monthExp = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		Select selectMonthExp = new Select(monthExp);
		selectMonthExp.selectByVisibleText(month);
		WebElement expYear = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
		Select selectExpireYear = new Select(expYear);
		selectExpireYear.selectByVisibleText(year);
		driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]")).sendKeys(cvvNo);
        driver.findElement(By.xpath("//input[@name=\"book_now\"]")).click();


	
	
	}
	@Then("User Should Print Oder Id")
	public void user_should_print_oder_id() {
		WebElement orderId = driver.findElement(By.xpath("//input[@name=\"order_no\"]"));
        String attributeValue = orderId.getAttribute("value");
        System.out.println(attributeValue);
	windowQuit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
