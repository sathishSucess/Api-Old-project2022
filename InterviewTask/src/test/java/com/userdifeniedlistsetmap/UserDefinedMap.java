package com.userdifeniedlistsetmap;

import java.util.HashMap;

public class UserDefinedMap {

	private int rollno;
    private String name;
	
    public UserDefinedMap(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		 HashMap<UserDefinedMap, String> map = new HashMap<>();
		  
		 UserDefinedMap one = new UserDefinedMap(1, "sathish"); // key1
	  
		 UserDefinedMap two = new UserDefinedMap(2, "vetri"); // key2
		
	     // put keys in map
	        map.put(one, one.getName());
	        map.put(two, two.getName());
		
	     
	  
	        // still prints Geeks1
	        System.out.println(map.get(one));
	  
	        // still prints Geeks1
	        System.out.println(map.get(two));
	  
		
		
		
		
		
	}
	
	
	
	
}
