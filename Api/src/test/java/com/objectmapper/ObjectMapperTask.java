package com.objectmapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperTask {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\sathish\\eclipseAug3\\2022\\Api\\src\\test\\resources\\jsonfile\\objectmapperarry.json");
		ObjectMapper mapper=new ObjectMapper();
		Root readValue = mapper.readValue(file, Root.class);
		ArrayList<Datum> data = readValue.getData();
		
		for (Datum k : data) {
			System.out.println(k.getId());
			System.out.println(k.getFirst_name());
			System.out.println(k.getLast_name());
			System.out.println(k.getEmail());
			System.out.println(k.getAvatar());
			//support 
			Support support = readValue.getSupport();
			System.out.println(support.getUrl());
			System.out.println(support.getText());
		}
		
		
	}
	
	
	
	
	
}
