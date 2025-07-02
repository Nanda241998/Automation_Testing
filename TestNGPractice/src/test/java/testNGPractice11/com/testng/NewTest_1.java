package testNGPractice11.com.testng;

import org.testng.annotations.Test;

public class NewTest_1 {
	@Test(priority = 0)
	public void browser() {
		System.out.println("@Test");

	}

	@Test(priority = 1)
	public void url() {
		System.out.println("@Test1");

	}

	@Test(priority = 2)
	public void webelement() {
		System.out.println("@Test2");

	}

	@Test(priority = 3)
	public void login() {
		System.out.println("@Test3");

	}

	@Test(priority = 4)
	public void click() {
		System.out.println("@Test4");

	}

	@Test(priority = 5)
	public void search() {
		System.out.println("@Test5");

	}

}
