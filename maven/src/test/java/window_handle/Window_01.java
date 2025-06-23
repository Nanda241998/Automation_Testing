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

		String url = System.getProperty("user.dir");
		Thread.sleep(3000);
		TakesScreenshot tc = (TakesScreenshot) driver;

		File sc = tc.getScreenshotAs(OutputType.FILE);

		File tg = new File("./dropdownSc/redbusSc.png");

		FileHandler.copy(sc, tg);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		TakesScreenshot tc2 = (TakesScreenshot) driver;
		File sc1 = tc2.getScreenshotAs(OutputType.FILE);

		File tg2 = new File("./dropdownSc/tbSc.png");

		FileHandler.copy(sc1, tg2);

		driver.findElement(By.xpath("//a[text()=\"Careers\"]")).click();

		TakesScreenshot tc3 = (TakesScreenshot) driver;

		File sc2 = tc3.getScreenshotAs(OutputType.FILE);

		File tg3 = new File("./dropdownSc/careersSc.png");

		FileHandler.copy(sc2, tg3);

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
		TakesScreenshot tc4 = (TakesScreenshot) driver;

		File sc3 = tc4.getScreenshotAs(OutputType.FILE);

		File tg4 = new File("./dropdownSc/aboutusSc.png");

		FileHandler.copy(sc3, tg4);

		driver.findElement(By.xpath("(//a[text()=\"Life at redBus\"])[1]")).click();

		TakesScreenshot tc5 = (TakesScreenshot) driver;

		File sc4 = tc5.getScreenshotAs(OutputType.FILE);

		File tg5 = new File("./dropdownSc/lifeatbusSc.png");

		FileHandler.copy(sc4, tg5);

		Thread.sleep(5000);

		driver.switchTo().window(parent_id);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()=\"Bus Timetable\"]")).click();

	}

}
