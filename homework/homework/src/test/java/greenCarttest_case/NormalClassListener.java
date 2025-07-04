package greenCarttest_case;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dyanamicCode.Base_class;

public class NormalClassListener extends Base_class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Launch_01("chrome");
		HitUrl("https://rahulshettyacademy.com/seleniumPractise/#/");

		try {
			takesScreenshot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExtentSparkReporter("GreencartWebPage", "GreencartWebpageReports", "Greencart", "normalclass", "Reports");
		ExtentTest("verifyGreencartPage1", "test is defined to verify that all webelements should be clickable",
				"VerifyPage1");
		ExtentTest("verifyGreencartPage2", "test is defined to verify that search functionality working",
				"VerifyPage2");
		ExtentTest("verifyGreencartPage3", "test is defined to verify that flights booking functionality working",
				"VerifyPage3");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onStart(ITestContext context) {
		Launch_01("chrome");
		HitUrl("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@Override
	public void onFinish(ITestContext context) {

		String expectedURl = "\"https://rahulshettyacademy.com/seleniumPractise/#/\"";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertNotEquals(expectedURl, actualUrl);
		System.out.println("the actual url is :" + actualUrl);
		// Assert.assertTrue(true);
		Er.flush();
		driver.quit();

	}

}
