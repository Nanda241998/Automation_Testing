package automationPractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.Base_class;

public class NormalClass extends Base_class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		act = new Actions(driver);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			DropdownSc(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		HitUrl("http://www.automationpractice.pl/index.php/");

	}

}
