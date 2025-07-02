package listenars_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.Base_class;

public class Pom1 extends Base_class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		driver.findElement(By.cssSelector("a.login")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("67tygtghb@gmail.com");
		driver.findElement(By.cssSelector("input[data-validate=\"isPasswd\"]")).sendKeys("uhyt@11111");
		driver.findElement(By.cssSelector("button#SubmitLogin")).click();
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
