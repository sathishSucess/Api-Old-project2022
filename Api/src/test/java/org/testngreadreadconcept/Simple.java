package org.testngreadreadconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseapi.BaseClassApi;

import io.restassured.response.Response;


public class Simple extends BaseClassApi {

	@Test
	public void login() {
		
		addHeader("accept"," application/json");
		basicAuth("sathishmec97@gmail.com", "Sathish$123");
		Response response = requestType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		String bodyAsPrettyString = getBodyAsPrettyString(response);
		System.out.println(bodyAsPrettyString);
		
		Root root = response.as(Root.class);
		String message = root.getMessage();
		System.out.println(message);
		Assert.assertEquals(message, "Login successfully","VerifyLoginSucessfullMsg");
	}
	
	
	
	
}
