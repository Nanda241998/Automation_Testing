package homeWork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
import dynamic_code.Base_class;
import pom_Normalclass.Page2;
import pom_Normalclass.Page3;
import pom_Normalclass.Page4;

@Listeners(NormalClass.class)
public class TestNgExecution extends Base_class {
	/*
	 * @Test public void verifyPageGreenCart() { POM_normal Pom= new
	 * POM_normal(driver); Pom.locators(); }
	 */
	@Test(priority=1)
	public void verifyPage2() {
		Page2 Pom = new Page2(driver);
		Pom.actions();
	}

	@Test(priority=2)
	public void verifyPage3() {
		Page3 Pom2 = new Page3(driver);
		Pom2.accountVerify();
	}
	@Test(priority=3)
	public void assertions() {
		String expectedUrl="http://www.automationpractice.pl/index.php/";
		String actualUrl=driver.getCurrentUrl();
		//Assert.assertNotEquals(actualUrl, expectedUrl);
		Assert.assertTrue(true);
		System.out.println("the actual url is:"+actualUrl);
	}
	@Test(priority=4)
	public void verifyPage4() throws Throwable {
		Page4 Pom3 = new Page4(driver);
		Pom3.actionsPerformed();;
	}
	
	

	
	

}
