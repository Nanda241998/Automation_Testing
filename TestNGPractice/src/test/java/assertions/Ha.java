package assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import dynamic_code.Base_class;

public class Ha extends Base_class {
	@Test
	public void exceptionsurl() {
		Launch_01("chrome");
		HitUrl("https://www.selenium.dev/");

		String expectedUrl = "https://www.selenium.dev/";

		String actualUrl = driver.getCurrentUrl();

		// Assert.assertEquals(actualUrl, expectedUrl);
		//Assert.assertNotEquals(actualUrl, expectedUrl);
		 Assert.assertTrue(false);
		/*
		 * String expectedtext = "Downloads"; String actualtext =
		 * driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).getText();
		 * //assertEquals(actualtext, expectedtext);
		 * 
		 * 
		 * System.out.println("the actual text is as:"+actualtext);
		 */

	}
}
