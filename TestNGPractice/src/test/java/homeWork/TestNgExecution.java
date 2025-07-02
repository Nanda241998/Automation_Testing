package homeWork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
import dynamic_code.Base_class;
import pom_Normalclass.Page2;
import pom_Normalclass.Page3;

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

	@Test(priority=2)
	public void verifyPropertyFile() throws IOException, Throwable {
		
	}


}
