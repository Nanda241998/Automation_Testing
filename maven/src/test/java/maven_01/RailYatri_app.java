package maven_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class RailYatri_app extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.railyatri.in/");
		Thread.sleep(2000);
		//Screenshot("railwebSC1");

		WebElement pnr = driver.findElement(By.cssSelector("div[id=\"item\"]"));
		pnr.click();
		Thread.sleep(2000);

		JavaScriptExecutor("window.scrollBy(0,500)");
		Thread.sleep(2000);
		JavaScriptExecutor("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		JavaScriptExecutor("window.scrollTo(0,0)");
		Thread.sleep(2000);

		JavaScriptExecutor("window.history.go(0)");
		Thread.sleep(2000);
		JavaScriptExecutor("window.history.back()");
		Thread.sleep(2000);

		JavaScriptExecutor("window.history.forward()");

	}

}
