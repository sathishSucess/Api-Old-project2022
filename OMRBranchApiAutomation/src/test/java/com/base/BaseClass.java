package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	RequestSpecification reqspec;
	Response response;

	public void addHeader(String key, String value) {
		reqspec = RestAssured.given().header(key, value);
	}

	public void addHeaders(Headers headers) {
		reqspec = RestAssured.given().headers(headers);

	}

	public void queryParam(String key, String value) {

		reqspec = reqspec.queryParam(key, value);

	}

	public void pathParam(String key, String value) {
		reqspec.pathParam(key, value);
	}

	public void addBody(Object body) {
		reqspec = reqspec.body(body);
	}

	public void addBody(String body) {
		reqspec = reqspec.body(body);
	}

	public Response requestType(String type, String endpoint) {
		switch (type) {
		case "GET":
			response = reqspec.log().all().get(endpoint);
			break;
		case "POST":
			response = reqspec.log().all().post(endpoint);
			break;
		case "PUT":
			response = reqspec.log().all().put(endpoint);
			break;

		case "DELETE":
			response = reqspec.log().all().delete(endpoint);
			break;

		default:
			break;
		}
		return response;

	}

	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}

	public String getAsString(Response response) {
		String asString = response.asString();

		return asString;
	}

	public String getAsPretty(Response response) {
		String asPrettyString = response.asPrettyString();

		return asPrettyString;
	}

	public void basicAuth(String username, String password) {
		reqspec.auth().preemptive().basic(username, password);

	}

	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\ConfigFile\\config.properties"));
		// Object value = (Object) properties.get(key);
		String value = (String) properties.get(key);
		return value;
	}

	public void formData() {
		reqspec = reqspec.multiPart("profile_picture",new File("C:\\Users\\sathish\\OneDrive\\Pictures\\profile pic6.png"));
		
	}
	
	
	
}
