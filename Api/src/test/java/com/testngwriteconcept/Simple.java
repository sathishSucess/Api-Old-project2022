package com.testngwriteconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Simple extends BaseClass {

	
@Test
	
	public void login(){
		
		addHeader("accept", "application/json");
		basicAuth("sathishmec97@gmail.com","Sathish$123");
		Response response=requestType("POST","https://omrbranch.com/api/postmanBasicAuthLogin");
	    int statusCode = getStatusCode(response);
	    System.out.println(statusCode);
	    String bodyAsPrettyString = getBodyAsPrettyString(response);
	    System.out.println(bodyAsPrettyString);
	    
	    AddUserAddressOutput root = response.as(AddUserAddressOutput.class);
	    String message = root.getMessage();

	   Assert.assertEquals(message, "Login successfully", "VerifySuccesslogin");
	    
		
	}
	@Test
	
	public void addAddress() {
		
		//1. Headers
	   addheaders();
	   //2. pass the pay load
	  // AddUserAddress addUserAddress = new AddUserAddress("Viki","R","9876543210","TheDark","103","12","101","600045","64/63 clay nagar","RVILLAM");
	   
	   
	   AddUserAddress address=new AddUserAddress("denesh", "dan", "9876543210", "dan", 103, 12, 101, "600045", "64/63 omr nagar","samson");
	   addBody(address);
	   
	   //3. req type
	   Response requestType = requestType("POST", "https://omrbranch.com/api/addUserAddress");
	   int statusCode = getStatusCode(requestType);
	  // System.out.println(statusCode);
	   
	   Assert.assertEquals(statusCode, 200, "VerifyStatusCodeSucessful");
	   
	   System.out.println(getBodyAsPrettyString(requestType));
	   
	   AddUserAddressOutput outPut = requestType.as(AddUserAddressOutput.class);
	   String message = outPut.getMessage();
	   System.out.println(message);
	//   Assert.assertEquals(message, "Address added successfully","VerifyAddressAddSuccesfuly");
	   
	   

	}
	
	
	
	
}
