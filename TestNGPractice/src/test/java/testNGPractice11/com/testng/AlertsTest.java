package testNGPractice11.com.testng;

import org.testng.annotations.Test;

import dynamic_code.Base_class;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AlertsTest extends Base_class {
	@BeforeSuite
	public void beforeSuite() {
		

	}

	@BeforeTest
	public void beforeTest() {

	}

	@BeforeClass
	public void beforeClass() {
	}

	@BeforeMethod
	public void beforeMethod() {
		Launch_01("chrome");
		HitUrl("http://demo.automationtesting.in/Alerts.html");
	}

	@Test
	public void verifyalerts() {
		Alerts al = new Alerts(driver);
		al.actionsAlerts();

	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterClass
	public void afterClass() {
	}

	@AfterTest
	public void afterTest() throws Throwable {
		
	}

	@AfterSuite
	public void afterSuite() {
	}

}
