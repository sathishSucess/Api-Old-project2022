package com.testngwriteconpart2;

import java.util.ArrayList;

public class GetUserAddress_Output_Pojo {

	private int status;
	private String message;

	private ArrayList<GetUserAddress_Input_Pojo> data;
	
	
	//getter and setter

	public ArrayList<GetUserAddress_Input_Pojo> getData() {
		return data;
	}

	public void setData(ArrayList<GetUserAddress_Input_Pojo> data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
