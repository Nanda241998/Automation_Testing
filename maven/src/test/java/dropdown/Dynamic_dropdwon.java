package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Dynamic_dropdwon extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.railyatri.in/");

		JavaScriptExecutor("window.scrollBy(0,100)");
		DropdownSc("scrollSc");

		Thread.sleep(3000);
		WebElement from = driver.findElement(By.xpath("//input[@id=\"from_stn_input\"]"));

		from.click();
		from.sendKeys("NAGP");

		DropdownSc("nagpSc");

		List<WebElement> ngp = driver.findElements(By.xpath("//ul[@id=\"ui-id-5\"]//child::li"));

		System.out.println("the size of dynamic from select is as:" + ngp.size());

		for (int i = 0; i < ngp.size(); i++) {
			if (ngp.get(i).getText().equalsIgnoreCase("NAGPUR (SE) BG | NGPA")) {
				ngp.get(i).click();
			}
		}
		Thread.sleep(3000);

		DropdownSc("nagpurSc");

		WebElement to = driver.findElement(By.xpath("//input[@id=\"to_stn_input\"]"));
		to.click();
		to.sendKeys("PUN");
		DropdownSc("toSc");
		List<WebElement> pun = driver.findElements(By.xpath("//ul[@id=\"ui-id-6\"]//child::li"));

		System.out.println("the size of boarding to is as:" + pun.size());

		for (int j = 0; j < pun.size(); j++) {
			if (pun.get(j).getText().equalsIgnoreCase("PUNARAKH | PHK")) {
				pun.get(j).click();
			}
		}
		DropdownSc("punSc");
		Thread.sleep(3000);

		WebElement calender = driver.findElement(By.cssSelector("input[id=\"datepicker_train\"]"));

		calender.click();
		Thread.sleep(3000);

		while (true) {
			String year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();

			System.out.println("current year and month is as:" + year);
			Thread.sleep(3000);

			if (!(year.equalsIgnoreCase("August 2025"))) {
				driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
			} else {
				break;
			}
		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//td[text()=\"20\"]")).click();
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.xpath("//button[@id=\"search_btn_dweb\"]"));

		search.click();

		DropdownSc("SearchSc");

	}

}
