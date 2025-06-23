package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Launch_Browser;

public class Calender_date extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(4000);
		WebElement calender_from = driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[1]"));
		calender_from.click();

		Thread.sleep(4000);

		WebElement next = driver.findElement(By.xpath("//a[@data-handler=\"next\"]"));

		next.click();
		Thread.sleep(4000);

		WebElement next2 = driver.findElement(By.xpath("//a[@data-handler=\"next\"]"));

		next2.click();
		Thread.sleep(4000);

		WebElement next3 = driver.findElement(By.xpath("//a[@data-handler=\"next\"]"));

		next3.click();
		Thread.sleep(4000);

		 driver.findElement(By.xpath("(//a[text()=\"16\"])[2]")).click();

		//date1.click();
		//System.out.println("the date selected is as:" + date1.getText());
		Thread.sleep(4000);

		WebElement calender_to = driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[2]"));
		calender_to.click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//a[text()=\"21\"])[1]")).click();
		
		//date2.click();
		
      //System.out.println("the date selected is as:" + date2.getText());


	}

}
