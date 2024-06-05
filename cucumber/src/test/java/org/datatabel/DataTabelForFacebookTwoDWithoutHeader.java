package org.datatabel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.stepdefinition.BaseLib;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTabelForFacebookTwoDWithoutHeader extends BaseLib {


@Given("User is on the Facebook login page")
public void user_is_on_the_facebook_login_page() {
    
	getDriver();
	enterUrl("https://en-gb.facebook.com/");
	maximizeWindow();
	implicitWait(30);
	
	
}
@When("User should perform login")
public void user_should_perform_login(io.cucumber.datatable.DataTable dataTable) {
    
	List<List<String>> list = dataTable.asLists();
	List<String> e = list.get(0);
	String s1 = e.get(0);
	String s2 = e.get(1);
	WebElement txtUser = elementFindById("email");
	elementSendKeys(txtUser, s1);
	WebElement txtPass = elementFindById("pass");
	elementSendKeys(txtPass, s2);
}
@Then("User should verify after login")
public void user_should_verify_after_login() {
    
}



	
	
	
	
	
}
