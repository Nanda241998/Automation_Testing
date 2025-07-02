package assertions;

import org.testng.annotations.Test;

import dynamic_code.Base_class;

public class SoftAssert extends Base_class {
	@Test
	public void browser() {
		Launch_01("chrome");
		HitUrl("https://www.selenium.dev/");
		String expectedurl = "https://www.seleniu.dev/";

		String actualurl = driver.getCurrentUrl();

		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		sa.assertEquals(actualurl, expectedurl);
		sa.assertAll();

	}
}
