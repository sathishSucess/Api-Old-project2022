package com.testngwriteconpart2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testngreadreadconcept.Data;

import com.endpoints.EndPoints;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class SampleLogin extends BaseClass {
	String logtoken;
	String address_id;

	@Test(priority = 6)@Ignore
	public void updateProfilePic() {

		// 1.Headers

		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "multipart/form-data");

		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);

		// 2.pass the payload
		formData();
		// 3.RequestType
		Response response = requestType("POST", EndPoints.CHANGEPROFILEPIC);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify status code");
		System.out.println(getAsPretty(response));

	}

	@Test(priority = 5)@Ignore
	public void getUserAddress() {

		// 1.Headers

		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		listHeaders.add(h1);
		listHeaders.add(h2);
		Headers headers = new Headers(listHeaders);
		addHeaders(headers);
		// 2.pass the payload

		// 3.RequestType
		Response response = requestType("GET", EndPoints.GETADDRESS);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify status code");

		System.out.println(getAsPretty(response));

		GetUserAddress_Output_Pojo getUserAddress_Output_Pojo = response.as(GetUserAddress_Output_Pojo.class);
		String message = getUserAddress_Output_Pojo.getMessage();
		System.out.println(message);
		Assert.assertEquals(message, "OK", "Verify GetUserData Sucess Msg");

//		ArrayList<GetUserAddress_Input_Pojo> listData = getUserAddress_Output_Pojo.getData();
//		for (GetUserAddress_Input_Pojo listnew : listData) {
//			System.out.println(listnew.getId());
//}
	}

	@Test(priority = 4)
	public void deleteAdress() {

		// 1.Headers

		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);

		Headers headers = new Headers(listHeaders);
		addHeaders(headers);
		// 2.pass the payload
		Delete_Input_Pojo delete_Input_Pojo = new Delete_Input_Pojo("19836");
		addBody(delete_Input_Pojo);
		// 3.RequestType
		Response response = requestType("DELETE", EndPoints.DELETEADDRESS);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify status code");

		System.out.println(getAsPretty(response));
		Delete_Output_Pojo delete_Output_Pojo = response.as(Delete_Output_Pojo.class);
		String message = delete_Output_Pojo.getMessage();
		Assert.assertEquals(message, "Address deleted successfully", "Verify Delete Sucess Msg");
	}

	@Test(priority = 3)@Ignore
	public void updateAdress() {

		// 1.Headers

		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);

		Headers headers = new Headers(listHeaders);
		addHeaders(headers);
		// 2.pass the payload

		UpdateAdress_Input_Pojo updateAdress_Input_Pojo = new UpdateAdress_Input_Pojo(address_id, "Sara", "kumarraj",
				"544646464", "bala aprt", 600456, 2233, 5555, "chennai5000", "Balamurgan vels", "S.k manson");
		addBody(updateAdress_Input_Pojo);
		// 3.RequestType

		Response response = requestType("PUT", EndPoints.UPDATEADDRESS);
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify status code");

		System.out.println(getAsPretty(response));

		UpdateAdress_Output_Pojo updateAdress_Output_Pojo = response.as(UpdateAdress_Output_Pojo.class);
		String message = updateAdress_Output_Pojo.getMessage();
		Assert.assertEquals(message, "Address updated successfully", "verify  updateAddress added successfully");

	}

	@Test(priority = 2)@Ignore
	private void addUserAddress() {

		// 1.Headers

		List<Header> listHeaders = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeaders.add(h1);
		listHeaders.add(h2);
		listHeaders.add(h3);

		Headers headers = new Headers(listHeaders);
		addHeaders(headers);

		// 2.pass the payload

		AddUserAddress_Input_Pojo addUserAddress_Input_Pojo = new AddUserAddress_Input_Pojo("jan", "james",
				"8939282410", "casa apartment", 33, 3378, 101, "609887", "994/6355 gani street main road",
				"S.k Office");

		addBody(addUserAddress_Input_Pojo);

		// 3.RequestType

		Response response = requestType("POST", EndPoints.ADDUSERADDRESS);

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		Assert.assertEquals(statusCode, 200, "verify status code");
		System.out.println(getAsPretty(response));

		AddUserAddress_Output_Pojo addUserAddress_Output_Pojo = response.as(AddUserAddress_Output_Pojo.class);
		String message = addUserAddress_Output_Pojo.getMessage();
		Assert.assertEquals(message, "Address added successfully", "verify Address added successfully");
		int id = addUserAddress_Output_Pojo.getAddress_id();
		address_id = Integer.toString(id);

	}

	@Test(priority = 1)
	public void login() throws FileNotFoundException, IOException {

		// 1.Header

		addHeader("accept", "application/json");
		// 2.Basic Authentication

		basicAuth(getPropertyFileValue("username"), getPropertyFileValue("password"));

		// 3.Request Type

		Response response = requestType("POST", EndPoints.POSTMANBASICAUTHLOGIN);

		int statusCode = getStatusCode(response);
		Assert.assertEquals(statusCode, 200, "verify status code");

		String resBodyAsPrettyString = getAsPretty(response);
		System.out.println(resBodyAsPrettyString);

		Login_Output_Pojo as = response.as(Login_Output_Pojo.class);

		System.out.println(as);

		Login_Input_Pojo data = as.getData();

		String first_name = data.getFirst_name();
		Assert.assertEquals(first_name, "sathish", "verifying first name");
		System.out.println(first_name);

		Login_Output_Pojo login_Output_Pojo = response.as(Login_Output_Pojo.class);
		String message = login_Output_Pojo.getMessage();
		Assert.assertEquals(message, "Login successfully", "verify Login successfully");

		// get the logtoken
		logtoken = login_Output_Pojo.getData().getLogtoken();

	}

}
