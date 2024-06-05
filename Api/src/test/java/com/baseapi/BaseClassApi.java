package com.baseapi;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassApi {

	 Response response;
	 RequestSpecification reqSpec;
		
	 public void addHeader(String key, Object value) {
	  reqSpec = RestAssured.given().header(key,value);
		
	}
	 
	 public void quaryParam(String Key, Object Value) {
		 reqSpec= reqSpec.queryParam(Key, Value);

	}
	
	 public void pathParam(String key, Object Value) {
		 reqSpec = reqSpec.pathParam(key, Value);

	}
	 
	 public void addBody(String body) {
		 reqSpec = reqSpec.body(body);

	}
	
	 public Response requestType(String type , String endPoint) {
		 switch (type) {
		case "GET":
		response = reqSpec.get(endPoint);
			break;
		case "POST":
		 response = reqSpec.post(endPoint);
		 break;
		case "DELETE":
			response = reqSpec.delete(endPoint);
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
	 
	 public String getBodyAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;

	}
	 
	 public void basicAuth(String username, String password) {
		reqSpec.auth().preemptive().basic(username, password);

	}
	 
//	 public void addHeaders() {
//		List<Header> header=new ArrayList<Header>();
//		Header h1=new Header("","");
//		Header h2=new Header("","");
//		Header h3=new Header("","");
//		Header h4=new Header("","");
//		
//		
//		header.add(h1);
//		header.add(h2);
//		header.add(h3);
//		header.add(h4);
//
//		Headers header=new Headers(header);
//	}
//	 
//	 
	 
	 
	 
	 

}
