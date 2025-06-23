package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Date_class extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.railyatri.in/");
		Thread.sleep(3000);

		JavaScriptExecutor("window.scrollBy(0,100)");
		Thread.sleep(3000);

		WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));

		calender.click();

		Thread.sleep(3000);
		WebElement MM_YYYY = driver.findElement(By.xpath("//th[text()=\"June 2025\"]"));

		System.out.println("the year and moth is:" + MM_YYYY.getText());

		WebElement date = driver.findElement(By.xpath("//td[text()=\"24\"]"));
		Thread.sleep(3000);

		date.click();

		System.out.println("the current date of the day is:" + calender.getAttribute("value"));
		Thread.sleep(3000);

		WebElement calender1 = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
		calender1.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//td[text()=\"20\"]")).click();

		// WebElement date =
		// driver.findElement(By.xpath("//div[@class=\"datePickerWrapper___5ef158\"]"));

	}

}
