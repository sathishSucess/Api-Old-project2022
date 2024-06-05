package com.pom.usingjunit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseLib {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//login Locator
	@FindBy(id="username")
	private  WebElement txtUserName;
	@FindBy(id="password")
	private  WebElement txtPassWord;
	@FindBy(id="login")
	private  WebElement loginBtn;
	
	//Getter only
	public  WebElement getTxtUserName() {
		return txtUserName;
	}
	public  WebElement getTxtPassWord() {
		return txtPassWord;
	}
	public  WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public  void loginData(String userName,String passWord) {
		elementSendKeys(getTxtUserName(), userName);
		elementSendKeys(getTxtPassWord(), passWord);
		elementClick(getLoginBtn());
	}
	
	
	
	
	
}
