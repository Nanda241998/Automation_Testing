package maven_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Launch_Browser;

public class DragAndDrop_ActionsClass extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://jqueryui.com/droppable/");

		WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));

		driver.switchTo().frame(iframe);
		
		Actions jqery= new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		//jqery.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		//jqery.clickAndHold(drag).release(drop).build().perform();
		
		jqery.dragAndDrop(drag, drop).release().build().perform();
		
		driver.switchTo().defaultContent();
		
		WebElement sortable = driver.findElement(By.xpath("//a[text()=\"Sortable\"]"));
		
		jqery.moveToElement(sortable).click().build().perform();
		

	}

}
