package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demoqa.com/alerts");
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,320)");
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[1]")).click();
		Thread.sleep(4000);

		Alert simple_alert = driver.switchTo().alert();
		System.out.println("when i clicked ok button:" + simple_alert.getText());

		Thread.sleep(4000);

		simple_alert.accept();

		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();

		Thread.sleep(7000);

		Alert alert5_Second = driver.switchTo().alert();

		System.out.println("when i clicked ok button text will appeared me after 5 seconds:" + alert5_Second.getText());
		Thread.sleep(7000);

		alert5_Second.accept();

		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(4000);

		Alert confirm_button = driver.switchTo().alert();

		System.out.println("when i clicked ok button:" + confirm_button.getText());

		confirm_button.accept();
		Thread.sleep(4000);

		WebElement success1 = driver.findElement(By.cssSelector("span[id=\"confirmResult\"]"));
		System.out.println("after clicked on ok button:" + success1.getText());
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(4000);

		Alert confirm_button1 = driver.switchTo().alert();

		confirm_button1.dismiss();

		WebElement success = driver.findElement(By.cssSelector("span[id=\"confirmResult\"]"));
		System.out.println("after clicked on cancel button:" + success.getText());

	}

}
