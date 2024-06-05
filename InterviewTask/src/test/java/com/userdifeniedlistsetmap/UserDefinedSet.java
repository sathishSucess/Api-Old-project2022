package com.userdifeniedlistsetmap;

public class UserDefinedSet {

	
	 private int rollNo;
    private String name;
    //pramaetrised constructor
	public UserDefinedSet(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
  //
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		
		

		UserDefinedSet std = new UserDefinedSet("s387", "nam", 3.7);

        addStudent(std);
	}
	
	
	
	
}
