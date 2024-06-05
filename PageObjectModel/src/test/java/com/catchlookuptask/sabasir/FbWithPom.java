package com.catchlookuptask.sabasir;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbWithPom extends BaseLib {

	public FbWithPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUserName;

	@CacheLookup
	@FindBy(id = "email")
	private WebElement catchtUserName1;

	// getters only
	public WebElement getCatchtUserName1() {
		return catchtUserName1;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public long usernameWithoutCatch(String data) {
		WebElement txtUser = getTxtUserName();
		elementSendKeys(txtUser, data);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			txtUserName.getAttribute("value");
		}
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime) / 1000;
		return totalTime;
	}

	public long userNameWithCatch(String data) {
		WebElement catchUsers = getCatchtUserName1();
		elementSendKeys(catchUsers, data);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			catchtUserName1.getAttribute("value");
		}
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime) / 1000;
		return totalTime;
	}

}
