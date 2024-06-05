package com.jsonobjectandarray;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonArray {

	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader filereader=new FileReader("C:\\Users\\sathish\\eclipseAug3\\2022\\Api\\src\\test\\resources\\jsonfile\\arrayTask1.json");
		JSONParser jsonParser=new JSONParser();
		
		Object obj = jsonParser.parse(filereader);
		
		JSONObject j=(JSONObject)obj;
		Object objData = j.get("data");
		JSONArray a=(JSONArray)objData;
		for (int i = 0; i < a.size(); i++) {
			Object object = a.get(i);
			
			
			JSONObject j1=(JSONObject)object;
			System.out.println(j1.get("id"));
			System.out.println(j1.get("email"));
			System.out.println(j1.get("first_name"));
			System.out.println(j1.get("last_name"));
			System.out.println(j1.get("avatar"));
		
		
		
		
		
		}
			
			
			
		
		
		
		
	}
	
}
