package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Select_1 extends Launch_Browser {

	public static void main(String[] args) {
		Launch_01("chrome");

		HitUrl("https://www.jeevansathi.com/");

		WebElement profile = driver.findElement(By.xpath("//div[@id=\"relationshipBlock\"]"));
		ActionsClass(profile);

	}

}
