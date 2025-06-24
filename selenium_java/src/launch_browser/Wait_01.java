package launch_browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_01 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//to add implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to add explicit----webdriverwait
		
//		WebDriverWait wait= new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated("locator"));
//		
//		//to add fluent wait
//		
//		FluentWait<WebDriver> fluent= new FluentWait<WebDriver>(Driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchFieldException.class);

	}

}
