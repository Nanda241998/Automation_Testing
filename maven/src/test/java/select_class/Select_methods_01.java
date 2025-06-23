package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Select_methods_01 extends Launch_Browser {

	public static void main(String[] args) {
		Launch_01("chrome");

		HitUrl("https://www.selenium.dev/selenium/web/web-form.html");

		WebElement datalist_01 = driver.findElement(By.xpath("//input[@name=\"my-datalist\"]"));

		datalist_01.click();
		datalist_01.sendKeys("new york");

		List<WebElement> data = driver.findElements(By.xpath("//datalist[@id=\"my-options\"]//child::option"));

		// List<WebElement> data =
		// driver.findElements(By.xpath("//datalist[@id='my-options']//child::option"));
		System.out.println("The size of datalist dropdwon is as:" + data.size());

		for (int i = 0; i <= data.size(); i++) {
			try {
				if (data.get(i).getText().contains("Seattle")) {
					data.get(i).click();

				}
			} catch (IndexOutOfBoundsException e) {

			}
		}

	}

}
