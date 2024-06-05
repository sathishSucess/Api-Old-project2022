package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;

import com.base.BaseClass;
import com.endpoints.EndPoints;
import com.testngwriteconpart2.UpdateAdress_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC1_LoginStep extends BaseClass {

	
	

	@Given("User should add header")
	public void userShouldAddHeader() {

		// 1.Header

		addHeader("accept", "application/json");
		
		
	}
	@Given("User should add basic authentication for login")
	public void userShouldAddBasicAuthenticationForLogin() throws FileNotFoundException, IOException {
		// 2.Basic Authentication

				basicAuth(getPropertyFileValue("username"), getPropertyFileValue("password"));

				
	}
	@When("User should {string} request for login endpoint")
	public void userShouldRequestForLoginEndpoint(String reqType) {
	   
		// 3.Request Type

		Response response = requestType(reqType, EndPoints.POSTMANBASICAUTHLOGIN);


		
		
	}
	
	
	@Then("User verify the login response body firstName present as {string} and get the logtoken")
	public void userVerifyTheLoginResponseBodyFirstNamePresentAsAndGetTheLogtoken(String string) {

		UpdateAdress_Output_Pojo updateAdress_Output_Pojo = response.as(UpdateAdress_Output_Pojo.class);
		String message = updateAdress_Output_Pojo.getMessage();
		Assert.assertEquals(message, "Address updated successfully", "verify  updateAddress added successfully");

	}



	
	
	
	
	
	
	
	
	
	
	
	
}
