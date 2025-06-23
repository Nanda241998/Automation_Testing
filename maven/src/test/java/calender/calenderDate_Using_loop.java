package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class calenderDate_Using_loop extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(4000);

		/*
		 * WebElement from = driver.findElement(By.xpath(
		 * "//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")); from.click();
		 * Thread.sleep(4000);
		 * 
		 * from.sendKeys("Goa (GOI)");
		 * 
		 * Thread.sleep(4000);
		 * 
		 * JavaScriptExecutor("window.scrollTo(0,0)"); Thread.sleep(4000);
		 * 
		 * WebElement to = driver .findElement(By.xpath(
		 * "(//input[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"])[1]"));
		 * to.click(); Thread.sleep(4000);
		 * 
		 * to.sendKeys("Pune (PNQ)");
		 * 
		 * Thread.sleep(4000); JavaScriptExecutor("window.scrollTo(0,0)");
		 * 
		 * Thread.sleep(4000);
		 */

		WebElement calender_from = driver.findElement(By.xpath("(//button[@clas=\"ui-datepicker-trigger\"])[1]"));
		calender_from.click();

		Thread.sleep(4000);

		while (true) {
			String date1 = driver.findElement(By.xpath("(//div[@class=\"ui-datepicker-title\"])[2]")).getText();

			System.out.println("the current title is:" + date1);
			Thread.sleep(4000);
			if (!(date1.equalsIgnoreCase("November 2019"))) {
				driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();

			} else {
				break;
			}

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()=\"15\"])[2]")).click();

		//WebElement first = driver.findElement(By.xpath("//span[@id=\"view_fulldate_id_1\"]"));

		//System.out.println(first.getText());

		WebElement calender_to = driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[2]"));

		calender_to.click();
		Thread.sleep(3000);

		while (true) {
			String date2 = driver.findElement(By.xpath("(//div[@class=\"ui-datepicker-title\"])[2]")).getText();

			System.out.println("current title of date to is:" + date2);
			Thread.sleep(3000);

			if (!(date2.equalsIgnoreCase("February 2020"))) {
				driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();

			} else {
				break;
			}
		}
		Thread.sleep(3000);

		WebElement to1 = driver.findElement(By.xpath("(//a[text()=\"15\"])[2]"));
		to1.click();
		//WebElement second = driver.findElement(By.xpath("//span[@id=\"view_fulldate_id_2\"]"));
		//System.out.println(second.getText());

	}

}
