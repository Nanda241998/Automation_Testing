package properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExecutableClass_01 extends PropertyFile_01{
  @Test
  public void properties() throws Throwable {
	property();
	BrowserProperty("chromeBrowser");
	
	Url_02("automationpractise");
	JavaScriptExecutor01("window.scrollBy(0,200)");
	
	driver.findElement(By.xpath(F3.getProperty("email_xpath"))).sendKeys(F2.getProperty("emailAddress"));
	driver.findElement(By.xpath(F3.getProperty("pass_xpath"))).sendKeys(F2.getProperty("password"));
  }
}
