package testNGPractice11.com.testng;

import org.testng.annotations.Test;

public class NewTest_03 {
	@Test(priority = 1, groups = "High")
	public void browser() {
		System.out.println("bowser launch succesfully");
	}

	@Test(priority = 2, groups = "High")
	public void hiturl() {
		System.out.println("url hitted");
	}

	@Test(priority = 3, groups = "High")
	public void click() {
		System.out.println("click on login functionality");
	}

	@Test(priority = 4, groups = "medium")
	public void search() {
		System.out.println("click on search functionality");
	}

	@Test(priority = 5, groups = "medium")
	public void mobiles() {
		System.out.println("mobiles searched succesfully");
	}

	@Test(priority = 6, groups = "low")
	public void wishlist() {
		System.out.println("click on add to wishlist");
	}

	@Test(priority = 7, groups = "medium")
	public void cart() {
		System.out.println("click on add to cart");
	}
}
