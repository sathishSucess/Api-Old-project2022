package com.catchlookuptask.sabasir;
public class FbClass extends BaseLib {

	public static void main(String[] args) {
		BaseLib lib=new BaseLib();
		BaseLib.getDriver();
		BaseLib.enterUrl("https://www.facebook.com/");
		BaseLib.maximizeWindow();
		
		FbWithPom fb=new FbWithPom();
	
		long userNameWithCatch = fb.userNameWithCatch("welcome");
		System.out.println(userNameWithCatch);
		driver.navigate().refresh();
		long usernameWithoutCatch = fb.usernameWithoutCatch("welcome");
		System.out.println(usernameWithoutCatch);
		
		
		
	}
	
	
	
}
