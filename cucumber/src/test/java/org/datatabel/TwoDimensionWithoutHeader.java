package org.datatabel;

import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

public class TwoDimensionWithoutHeader {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> emp=new ArrayList<ArrayList<String>>();
		
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("Ram");
		a1.add("Ram@gmail.com");
		a1.add("api");
		
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("Fan");
		a2.add("Fan@gmail.com");
		a2.add("java");
		
		ArrayList<String>a3=new ArrayList<String>();
		a3.add("jai");
		a3.add("jai@gmail.com");
		a3.add("sql");
		
		ArrayList<String>a4=new ArrayList<String>();
		a4.add("sam");
		a4.add("sam@gmail.com");
		a4.add("api");
		
		emp.add(a1);
		emp.add(a2);
		emp.add(a3);
		emp.add(a4);
		ArrayList<String> list = emp.get(3);
		String name = list.get(1);
		System.out.println(name);
		
	}
	
	
	
	
	
	
	
}
