package testNGPractice11.com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestPractice {
	@Test(dependsOnMethods ="url" )
	public void browser() {
		System.out.println("launch browser");

	}

	@Test
	public void url() {
		System.out.println("hit url");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = {"browser","url"})
	public void launch() {
		System.out.println("launch");
	}
	/*
	 * @Test public void webelement() {
	 * System.out.println("using locator finds webelement");
	 * 
	 * }
	 * 
	 * @Test public void login() { System.out.println("login functionality");
	 * 
	 * }
	 * 
	 * @Test public void click() { System.out.println("clicked on login");
	 * 
	 * }
	 * 
	 * @Test public void search() { System.out.println("click on search");
	 * 
	 * }
	 */

}
