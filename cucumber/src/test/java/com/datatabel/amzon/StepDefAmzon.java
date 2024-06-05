package com.datatabel.amzon;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.stepdefinition.BaseLib;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefAmzon extends BaseLib {

	@Given("User is on the Amazon login page")
	public void user_is_on_the_amazon_login_page() {
	    getDriver();
	    enterUrl("https://www.amazon.in/");
	    maximizeWindow();
	    
	    
	}

	@When("User should perform login")
	public void user_should_perform_login(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String>  emp= dataTable.asMap();// asList 1D without header//asMap 1D With header
	   String s = emp.get("laptop");
	   WebElement txtSearch = elementFindById("twotabsearchtextbox");
	   txtSearch.sendKeys(s,Keys.ENTER);
		
		
	}

	@Then("User should verify after login")
	public void user_should_verify_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	
	
	
}
