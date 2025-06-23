package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Date_usingLoop extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.railyatri.in/");

		Thread.sleep(3000);

		JavaScriptExecutor("window.scrollBy(0,100)");
		Thread.sleep(3000);

		WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));

		calender.click();
		Screenshot("calenderSc");

		while (true) {
			String currentDate = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();

			System.out.println("current year is as:" + currentDate);

			Thread.sleep(3000);
			Screenshot("datepickerSc");

			if (!(currentDate.equalsIgnoreCase("August 2025"))) {
				driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();

			} else {
				break;
			}

		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//td[text()=\"14\"]")).click();
		
		Screenshot("14Sc");

		System.out.println("the dates selected is as:" + calender.getAttribute("value"));

	}

}
