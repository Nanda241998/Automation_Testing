package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Dropdown extends Launch_Browser {

	public static void main(String[] args) {
		
		Launch_01("chrome");
		
		HitUrl("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement select = driver.findElement(By.cssSelector("select[class=\"form-select\"]"));
		select.click();
		
		List<WebElement> data = driver.findElements(By.xpath("//select[@class=\"form-select\"]//child::option"));
		
		System.out.println("the size of dropdown select is as:"+data.size());
		
		for(int i=0;i<data.size();i++) {
			if(data.get(i).getText().equalsIgnoreCase("Two")) {
				data.get(i).click();
			}
		}
		
	}

}
