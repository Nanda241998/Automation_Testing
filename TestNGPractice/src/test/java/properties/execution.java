package properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class execution extends Porperty_01{
  @Test
  public void propert() throws Throwable {
	  prop();
	  openBrowser("chromeBrowser");
	  urlLaunch("facebook");
	  
	  driver.findElement(By.xpath(T3.getProperty("email_xpath"))).sendKeys(T2.getProperty("email"));
	  driver.findElement(By.xpath(T3.getProperty("password_xpath"))).sendKeys(T2.getProperty("password"));
	  
	  
  }
}
