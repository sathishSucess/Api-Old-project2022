package org.testngtask.sabasir;

import org.testng.annotations.Test;

public class TestNgPrirorityInvocationAndEnabel {

	@Test(enabled=false)//Method will not get Excuted ,if it is mentioned false
	private void tc01() {
		System.out.println("Method 1");

	}

	@Test(priority = -10)//
	private void tc02() {
		System.out.println("Method 2");
	}

	@Test(invocationCount= 5)// we need to only pass positive value
	private void tc03() {
		System.out.println("Method 3");

	}

	@Test(priority = -5)// Priority always execute lest value as frist and contains both positive and negetive.
	private void tc04() {
		System.out.println("Method 4");// TODO Auto-generated method stub

	}

}
