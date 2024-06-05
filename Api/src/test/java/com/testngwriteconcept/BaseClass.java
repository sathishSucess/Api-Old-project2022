package com.testngwriteconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	static Response response;
	static RequestSpecification reqspec;

	public static void addHeader(String key, Object value) {
		reqspec = RestAssured.given().header(key, value);

	}

	public static void quaryParam(String Key, Object Value) {
		reqspec = reqspec.queryParam(Key, Value);

	}

	public static void pathParam(String key, Object Value) {
		reqspec = reqspec.pathParam(key, Value);

	}

	public static void addBody(Object body) {
		reqspec = reqspec.body(body);

	}

	public static Response requestType(String type, String endPoint) {
		switch (type) {
		case "GET":
			response = reqspec.get(endPoint);
			break;
		case "POST":
			response = reqspec.post(endPoint);
			break;
		case "DELETE":
			response = reqspec.delete(endPoint);
			break;
		default:
			break;
		}
		return response;

	}

	public static int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}

	public static String getBodyAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;

	}

	public static void basicAuth(String username, String password) {
		reqspec.auth().preemptive().basic(username, password);

	}

	public static String getPropertyValue(Object key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir" + "/Endpoints.properties")));
		Object object = properties.get(key);
		String value = (String) object;
		return value;

	}

	public void addheaders() {
		List<Header> header = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjNiMmUwMDE3NWQzNzY5ODkyM2FmYmVkNTc4OTRkYjYzNTNmNGE1NTVhYjdmOWYyYWUyM2ZjMGM4NmUwZDVjYzBiMGQwMDI4MzdkYTg1OTIwIn0.eyJhdWQiOiIzIiwianRpIjoiM2IyZTAwMTc1ZDM3Njk4OTIzYWZiZWQ1Nzg5NGRiNjM1M2Y0YTU1NWFiN2Y5ZjJhZTIzZmMwYzg2ZTBkNWNjMGIwZDAwMjgzN2RhODU5MjAiLCJpYXQiOjE2NjEzMDY5NzksIm5iZiI6MTY2MTMwNjk3OSwiZXhwIjoxNjkyODQyOTc5LCJzdWIiOiI3NzYiLCJzY29wZXMiOltdfQ.rWJRVl3GooGYiqDYBYJ20YKXV90Rl-nw9oPK6BP7Xs8WLcWQNQB74g78siJY8-e0Fib-2T4TQt7gBMjmm_wSbV2BUZSkAAMZz8Knx7ajDXSuMAJ-sW1zwe_kWwK1VN2ZbKvo9DgxKlDOfkWw31vOMakrKGJUtCKnSFGoNjs3lszw9jxTTPC8oBziH44nknsnLCip_yop87aCk-p1S-vY4BKJl8bqyzqMh5L-IKUHZWmeaazBMv1oJBqL4ILYzwz0FTjrbgeOyEtubdb0J8Gbqlh8Ol9uFkVFHencR4AIKcp8_uVhSeMdgmUVUfV-q-KfzCTBrZ26D2EqSXOz4qsgDlVX8dOfU3lcPiT295Vm3RptedkG3ysCRJP1AqMWVSn90v1uETTgrZAbItBykgGxSHre9bO3ypE5eXzaJj0qtGZTT63USwhf_ewLW6Df-4I3drM7DmnJVp2ZvaMce4ddz7auabW0zWlGooyV2LvU601bXERef4erwdP6WS6rrGMNXpiBfRY5Toi7tsO5pwrFftw0dgLlnI6oV0iYBJrlrwtxlpjVdbWyXDhYmwOm2JL0WVUKEt4vYpeXWcKSmp2OgpxLGqs9vhseVBovmz3Js1gjkoSOSgqLSO5pT4_NLLQlL3Z7OWswbnyTEVcr9y1iMR34QC24lV55N5sEVDL26Sk");
		Header h3 = new Header("Content-Type", "application/json");
		header.add(h1);
		header.add(h2);
		header.add(h3);

		Headers headers = new Headers(header);
		reqspec = RestAssured.given().headers(headers);

	}

}
