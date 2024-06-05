package com.pom.usingjunit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExcuteAll {

	
	@Test
	public void test() {
		Result res = JUnitCore.runClasses(AdctinClass.class,LoginPage.class,SearchHotelPage.class,SelectHotelPage.class,BookHotelPage.class,BookingConformationPage.class);

		int ignoreCount = res.getIgnoreCount();
		System.out.println("Number Test Ignored:"+ignoreCount);
		
		int runCount = res.getRunCount();
		System.out.println("Number of Test Run:"+runCount);
		
		long runTime = res.getRunTime();
		System.out.println("MilliSec Took Entire Suit:"+runTime);
		
		int failureCount = res.getFailureCount();
		System.out.println("Number of Test failed during Run:"+failureCount);
		
		List<Failure> failures = res.getFailures();
		for (Failure v : failures) {
			String message = v.getMessage();
			System.out.println(message);
		}
	}
	
	
	
	
	
}
