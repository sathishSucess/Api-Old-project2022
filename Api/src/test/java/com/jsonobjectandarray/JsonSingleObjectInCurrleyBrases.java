package com.jsonobjectandarray;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSingleObjectInCurrleyBrases {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		FileReader fileReader=new FileReader("C:\\Users\\sathish\\eclipseAug3\\2022\\Api\\src\\test\\resources\\jsonfile\\singleobject.json");
		JSONParser jsonPaser=new JSONParser();
		Object objRef = jsonPaser.parse(fileReader);
		
		System.out.println(objRef);
		
	JSONObject j= (JSONObject)objRef;
		Object objUpdateAt = j.get("updatedAt");
		String objCast= (String)objUpdateAt;
		System.out.println(objCast);
	}
	
	
	
	
	
}
