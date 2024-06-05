package com.userdifeniedlistsetmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingValueMutaabelArray {

	
	
	public static void main(String[] args) {
		
		
	        //array of strings
	       String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
	       //initialize an immutable list from array using asList method
	        List<String> mylist = Arrays.asList(strArray);
	        //print the list
	        System.out.println("Immutable list:");
	        for(String val : mylist){
	           System.out.print(val + " ");
	        }
	        System.out.println("\n");
	        //initialize a mutable list(arraylist) from array using asList method
	        List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
	        System.out.println("Mutable list:");
	        //add one more element to list
	        arrayList.add("Pune");
	        //print the arraylist
	          for(String val : arrayList){
	          System.out.print(val + " ");
	        }
	    }
		
		
		
		
	}
	
	
	
	

