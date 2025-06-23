package window_handle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_02 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"About us\"]")).click();

		Set<String> window_id = driver.getWindowHandles();

		Iterator<String> id = window_id.iterator();

		String parent_id = id.next();

		System.out.println("the id of parent child window is:" + parent_id);

		String child_id = id.next();

		System.out.println("the id of child window is:" + child_id);

		driver.switchTo().window(child_id);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"LEARN MORE\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"CAREERS\"]")).click();
		Thread.sleep(3000);

		driver.switchTo().window(parent_id);

	}

}
