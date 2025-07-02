package listeners;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.Base_class;

public class NormalclassListener extends Base_class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		act = new Actions(driver);

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takesScreenshot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skiped");

	}

	@Override
	public void onStart(ITestContext context) {
		Launch_01("chrome");
		HitUrl("https://www.snapdeal.com/");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish");

	}

}
