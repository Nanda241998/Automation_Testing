package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Alerts_01 extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.hyrtutorials.com/p/alertsdemo.html");

		Thread.sleep(4000);
		JavaScriptExecutor("window.scrollBy(0,300)");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();

		Thread.sleep(4000);

		Alert clickMe1 = driver.switchTo().alert();

		System.out.println(clickMe1.getText());

		clickMe1.accept();

		WebElement ok = driver.findElement(By.xpath("//div[@id=\"output\"]"));
		System.out.println("after pressed button ok is:" + ok.getText());

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
		Thread.sleep(4000);

		Alert clickMe2 = driver.switchTo().alert();

		System.out.println(clickMe2.getText());

		clickMe2.accept();

		WebElement confirm = driver.findElement(By.xpath("//div[@id=\"output\"]"));
		System.out.println("after clicked on ok:" + confirm.getText());

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
		Thread.sleep(4000);

		Alert clickMe3 = driver.switchTo().alert();

		clickMe3.dismiss();

		WebElement cancel = driver.findElement(By.xpath("//div[@id=\"output\"]"));
		System.out.println("after clicked on cancel button:" + cancel.getText());
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
		Thread.sleep(4000);

		Alert clickMe4 = driver.switchTo().alert();

		System.out.println(clickMe4.getText());
	
	
		clickMe4.sendKeys("jay hari vitthal");
		
		clickMe4.accept();
		
		WebElement text = driver.findElement(By.xpath("//div[@id=\"output\"]"));
		System.out.println("after entered text :" + text.getText());

	}

}
