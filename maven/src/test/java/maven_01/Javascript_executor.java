package maven_01;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamic_code.Launch_Browser;

public class Javascript_executor extends Launch_Browser {

	public static void main(String[] args) throws Throwable {

		Launch_01("chrome");
		HitUrl("https://www.railyatri.in/");

		/*
		 * WebDriver Driver = new ChromeDriver();
		 * 
		 * Driver.manage().window().maximize();
		 * Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * 
		 * Driver.get("https://www.railyatri.in/");
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		// scroll with the y coordinate
		js.executeScript("window.scrollBy(0,500)");

		Screenshot("bySc");

		Thread.sleep(2000);

		// top to bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Screenshot("scrollSc");

		Thread.sleep(2000);

		// to refresh
		js.executeScript("window.history.go(0)");
		Screenshot("goSc");

		Thread.sleep(2000);

		// to backward
		js.executeScript("window.history.back()");
		Screenshot("backSc");
		Thread.sleep(2000);

		// to forward
		js.executeScript("window.history.forward()");
		Screenshot("forwardSc");
		Thread.sleep(2000);

		// bottom to top
		js.executeScript("window.scrollTo(0,0)");
		Screenshot("toSc");
		Thread.sleep(2000);

		// Driver.close();

	}

}
