package assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import dynamic_code.Base_class;

public class HardAssert extends Base_class {
	@Test
	public void url() {
		Launch_01("chrome");
		HitUrl("https://www.selenium.dev/");
		
		String expected = "https://www.selenium.dev/";
		 
		 String actual = driver.getCurrentUrl(); 
		 Assert.assertEquals(actual,
		  expected,"details match"); Assert.assertNotEquals(actual,
		  expected,"details match"); //Assert.assertTrue(false, "records match");
		 
		//System.out.println("the actual url is:"+actual);
//		String expectedwebelement = "About";
//		String actualwebelemet = driver.findElement(By.xpath("//a[text()=\"About\"]")).getText();
//		Assert.assertEquals(actualwebelemet, expectedwebelement,"details match");
//		System.out.println("the actual webement text is as:"+actualwebelemet);

	}
}
