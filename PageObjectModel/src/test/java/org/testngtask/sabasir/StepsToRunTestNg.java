package org.testngtask.sabasir;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Steps testNg runs
public class StepsToRunTestNg {

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	private void tc02() {
		System.out.println("Method 1");
	}

	@Test
	private void tc03() {
		System.out.println("Method 3");
	}
		@Test
		private void tc04() {
			System.out.println("Method 4");
		}
			@Test
			private void tc05() {
				System.out.println("Method 5");
			}
				@Test
				private void tc06() {
					System.out.println("Method 6");
				}
				@Test
					private void tc07() {
						System.out.println("Method 7");

						

	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("After method");
	}

	@AfterClass
	private void afterclass() {
		System.out.println("After Class");
	}

}
