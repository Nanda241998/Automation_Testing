package pOM_testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dynamic_code.Base_class;
import pageObjectModel.ContactUs_page;
import pageObjectModel.CreateAnAccountPage;
import pageObjectModel.SignUpPage1;

public class ExecutableClass_POM extends Base_class {
	@Test(priority = 1)
	public void verify() {
		SignUpPage1 SP = new SignUpPage1(driver);
		SP.accountVerify();
	}
	

	@Test(priority = 2)
	public void createVerify() throws Throwable {
		CreateAnAccountPage CP = new CreateAnAccountPage(driver);
		CP.accountCreate();
		Thread.sleep(3000);
	}
	

	@Test(priority = 3)
	public void contactVeriy() throws Throwable {
		ContactUs_page UP = new ContactUs_page(driver);
		UP.contactUsVeriy();
	}

	@BeforeSuite

	public void BeforeSuite() {
		Launch_01("chrome");
		HitUrl("http://www.automationpractice.pl/index.php");
	}

	@AfterSuite
	public void AfterSuite() {
	}
}
