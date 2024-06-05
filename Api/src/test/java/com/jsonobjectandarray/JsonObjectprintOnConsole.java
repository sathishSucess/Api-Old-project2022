package com.jsonobjectandarray;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonObjectprintOnConsole {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(
				"C:\\Users\\sathish\\eclipseAug3\\2022\\Api\\src\\test\\resources\\jsonfile\\testfile.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		System.out.println(parse);
		
	JSONObject j=(JSONObject)parse;
	
	
		Object objData = j.get("data");
		JSONObject jData=(JSONObject)objData;
		Object objFristName = jData.get("first_name");
		System.out.println(objFristName);
	}

}
