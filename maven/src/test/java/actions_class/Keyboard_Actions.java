package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Launch_Browser;

public class Keyboard_Actions extends Launch_Browser {

	public static void main(String[] args) throws Throwable {

		Launch_01("chrome");

		HitUrl("https://www.jeevansathi.com/");

		WebElement email = driver.findElement(By.cssSelector("input#email"));

		Actions act = new Actions(driver);
		act.moveToElement(email).click().sendKeys("abc").build().perform();

		// WebElement password= driver.findElement(By.cssSelector("input#password"));

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);

		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);

		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);

		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		WebElement eye = driver.findElement(By.cssSelector("div#eye"));
		eye.click();

		// keyboard actions
		/*
		 * act.keyDown(Keys.PAGE_DOWN).build().perform(); Thread.sleep(2000);
		 * Screenshot("downSc1");
		 * 
		 * act.keyDown(Keys.PAGE_DOWN).build().perform(); Thread.sleep(2000);
		 * Screenshot("downSc2");
		 * 
		 * act.keyDown(Keys.PAGE_DOWN).build().perform(); Thread.sleep(2000);
		 * Screenshot("downSc3");
		 * 
		 * act.sendKeys(Keys.PAGE_DOWN).build().perform(); Thread.sleep(2000);
		 * Screenshot("downSc4");
		 * 
		 * act.sendKeys(Keys.PAGE_UP).build().perform(); Thread.sleep(2000);
		 * Screenshot("upSc1");
		 * 
		 * act.keyDown(Keys.PAGE_UP).build().perform(); Screenshot("upSc2");
		 */

	}

}
