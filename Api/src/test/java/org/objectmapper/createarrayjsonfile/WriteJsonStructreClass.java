package org.objectmapper.createarrayjsonfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJsonStructreClass {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		
		File file=new File("C:\\Users\\sathish\\eclipseAug3\\2022\\Api\\src\\test\\resources\\jsonfile\\createJsonfile.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		//assign  the value
		ArrayList<PojoClassForArray> arryList=new ArrayList<PojoClassForArray>();
		
		PojoClassForArray arry1=new PojoClassForArray(1, "cerulean.weaver@reqres.in", "Weaver", "cerulean", "https://reqres.in/img/faces/2-image.jpg");		
		PojoClassForArray arry2=new PojoClassForArray(2, "maraven.weaver@reqres.in", "Marven", "jack", "https://reqres.in/img/faces/2-image.jpg");		
		PojoClassForArray arry3=new PojoClassForArray(3, "ganei.weaver@reqres.in", "Ganei", "Seker", "https://reqres.in/img/faces/2-image.jpg");		
		PojoClassForArray arry4=new PojoClassForArray(4, "sendicate.weaver@reqres.in", "Sendicate", "Sebastin", "https://reqres.in/img/faces/2-image.jpg");		
		PojoClassForArray arry5=new PojoClassForArray(5, "bankofindia.weaver@reqres.in", "Sambanker", "Jekin", "https://reqres.in/img/faces/2-image.jpg");		
		PojoClassForArray arry6=new PojoClassForArray(6, "rose.weaver@reqres.in", "Rose", "Melenda", "https://reqres.in/img/faces/2-image.jpg");		
		PojoClassForArray arry7=new PojoClassForArray(7, "mavenn.weaver@reqres.in", "Mavin", "Marcus", "https://reqres.in/img/faces/2-image.jpg");		

		arryList.add(arry1);
		arryList.add(arry2);
		arryList.add(arry3);
		arryList.add(arry4);
		arryList.add(arry5);
		arryList.add(arry6);
		arryList.add(arry7);
		
		PojoClassForCreatingJsonStructure str=new PojoClassForCreatingJsonStructure(1, 6, 12, 2, arryList);
		
		//write json file
		mapper.writeValue(file, str);
		
	}
	
	
	
	
	
	
}
