package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Launch_Browser;

public class Slider_ActionsClass extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		/*
		 * HitUrl("https://jqueryui.com/slider/"); Screenshot("sliderSc");
		 * 
		 * WebElement slider = Driver.findElement(By.cssSelector("iframe.demo-frame"));
		 * 
		 * Driver.switchTo().frame(slider);
		 * 
		 * Actions jqery= new Actions(Driver);
		 * 
		 * WebElement drag = Driver.findElement(By.cssSelector("span[tabindex=\"0\"]"));
		 * 
		 * //jqery.clickAndHold(drag).moveByOffset(200, 0).build().perform();
		 * //jqery.dragAndDropBy(drag, 400, 0).build().perform();
		 * 
		 * jqery.moveToElement(drag).clickAndHold().moveByOffset(300,0).release().build(
		 * ).perform(); Screenshot("slider300Sc");
		 */
		HitUrl("https://jqueryui.com/selectable/");
		WebElement Selectable = driver.findElement(By.cssSelector("iframe.demo-frame"));
		JavaScriptExecutor("window.scrollBy(0,100)");

		driver.switchTo().frame(Selectable);

		Actions jqery = new Actions(driver);

		WebElement item1 = driver.findElement(By.cssSelector("ol[id=\"selectable\"] :first-child"));

		WebElement item2 = driver.findElement(By.cssSelector("ol[id=\"selectable\"] :nth-child(2)"));

		WebElement item3 = driver.findElement(By.cssSelector("ol[id=\"selectable\"] :nth-child(3)"));

		WebElement item4 = driver.findElement(By.cssSelector("ol[id=\"selectable\"] :nth-child(4)"));

		WebElement item5 = driver.findElement(By.cssSelector("ol[id=\"selectable\"] :nth-child(5)"));

		WebElement item6 = driver.findElement(By.cssSelector("ol[id=\"selectable\"] :nth-child(6)"));

		WebElement item7 = driver.findElement(By.xpath("//li[text()=\"Item 7\"]"));

		jqery.moveToElement(item1).click().moveToElement(item2).click().moveToElement(item3).click()
				.moveToElement(item4).click().moveToElement(item5).click().moveToElement(item6).click().build()
				.perform();

		jqery.moveToElement(item7).click().build().perform();

	}

}
