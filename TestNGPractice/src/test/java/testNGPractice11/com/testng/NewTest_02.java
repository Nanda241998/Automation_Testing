package testNGPractice11.com.testng;

import org.testng.annotations.Test;

public class NewTest_02 {
	@Test(priority = 0,invocationCount = 2,description = "the test executed manually")
	public void manualTesting() {
		System.out.println("manual testing");
	}

	@Test(description = "atumation testing execution done")
	public void automationTesting() {
		System.out.println("Automation testing");
	}

	@Test(description = "api act as a mediator")
	public void apiTesting() {
		System.out.println("api testing");
	}

	@Test(description = "mobile testing to test mobile application")
	public void mobileTesting() {
		System.out.println("mobile testing");
	}

	@Test(description="software testing used to test quality of software")
	public void softwareTesting() {
		System.out.println("software testing");
	}

	@Test(description="databse testing used to test backend",enabled = false)
	public void databaseTesting() {
		System.out.println("database Testing");
	}
}
