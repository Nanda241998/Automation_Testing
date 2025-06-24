package window_handle;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Window_01 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver);

		driver.get("https://www.redbus.in/");
		System.out.println("the web page title is :" + driver.getTitle());
		Thread.sleep(3000);
		TakesScreenshot tc = (TakesScreenshot) driver;

		File sc = tc.getScreenshotAs(OutputType.FILE);

		File tg = new File("./dropdownSc/redbusSc.png");

		FileHandler.copy(sc, tg);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()=\"Careers\"]")).click();

		Set<String> window_id = driver.getWindowHandles();

		Iterator<String> id = window_id.iterator();

		String parent_id = id.next();

		System.out.println("the parent id is as:" + parent_id);

		String child_id = id.next();

		System.out.println("the child id is as:" + child_id);

		driver.switchTo().window(child_id);
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//a[text()=\"About Us\"])[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//a[text()=\"Life at redBus\"])[1]")).click();

		Thread.sleep(5000);

		driver.switchTo().window(parent_id);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()=\"Bus Timetable\"]")).click();

	}

}
