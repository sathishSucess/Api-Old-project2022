package com.datatabel.variousdomain;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.stepdefinition.BaseLib;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionForTwoDWithHeader extends BaseLib{

	
	

@Given("User is on the Instagram login page")
public void user_is_on_the_instagram_login_page() {
    getDriver();
    enterUrl("https://www.instagram.com/accounts/login/");
	maximizeWindow();
	
	
	
}

@When("User should perform login")
public void user_should_perform_login(io.cucumber.datatable.DataTable data) {
   
	List<Map<String,String>> list = data.asMaps();
	Map<String, String> emp = list.get(4);
	String s1 = emp.get("useName");
	String s2 = emp.get("password");
	implicitWait(30);
	WebElement txtUser = elementFindXpath("//input[@name=\"username\"]");
	elementSendKeys(txtUser, s1);
	WebElement txtPass = elementFindXpath("//input[@aria-label=\"Password\"]");
	elementSendKeys(txtPass, s2);
	
}

@Then("User should verify after login")
public void user_should_verify_after_login() {
    
}


	
	
	
	
	
}
