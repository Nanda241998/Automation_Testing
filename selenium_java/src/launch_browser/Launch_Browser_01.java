package launch_browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch_Browser_01 {

	public static void main(String[] args) {
		//WebDriver Driver=new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//	WebDriverWait wait = new WebDriverWait(driver, 20);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated("url"));
		
		FluentWait<WebDriver> wait01=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchFieldException.class);

	}

}
