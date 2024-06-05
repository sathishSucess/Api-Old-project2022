package com.pom.usingjunit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseLib {
	
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	// locators for bookhotel page

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	private WebElement txtFristName;
	@FindBy(xpath = "//input[@name=\"last_name\"]")
	private WebElement txtLastName;
	@FindBy(xpath = "//textarea[@name=\"address\"]")
	private WebElement txtAdress;
	@FindBy(xpath = "//input[@name=\"cc_num\"]")
	private WebElement txtCardNum;
	@FindBy(xpath = "//select[@name=\"cc_type\"]")
	private WebElement dDnCardType;
	@FindBy(xpath = "//select[@name=\"cc_exp_month\"]")
	private WebElement dDnExpMonth;
	@FindBy(xpath = "//select[@name=\"cc_exp_year\"]")
	private WebElement dDnExpYear;
	@FindBy(xpath = "//input[@name=\"cc_cvv\"]")
	private WebElement txtCardCvv;
	@FindBy(xpath = "//input[@name=\"book_now\"]")
	private WebElement bookNowBtn;

	// Getters only

	public WebElement getTxtFristName() {
		return txtFristName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAdress() {
		return txtAdress;
	}

	public WebElement getTxtCardNum() {
		return txtCardNum;
	}

	public WebElement getdDnCardType() {
		return dDnCardType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCardCvv() {
		return txtCardCvv;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public void bookHotelData(String fristName, String lastName, String billingAddress, String creditCardNum,
			String criditCardType, String expMonth, String expYear, String cvvNumber) {

		elementSendKeys(getTxtFristName(), fristName);
		elementSendKeys(getTxtLastName(), lastName);
		elementSendKeys(getTxtAdress(), billingAddress);
		elementSendKeys(getTxtCardNum(), creditCardNum);
		selectOptionByText(getdDnCardType(), criditCardType);
		selectOptionByText(getdDnExpMonth(), expMonth);
		selectOptionByText(getdDnExpYear(), expYear);
		elementSendKeys(getTxtCardCvv(), cvvNumber);
		elementClick(getBookNowBtn());

	}

}
