package project.project;

import java.rmi.server.ExportException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		//to launch Chrome web browser
		WebDriver Driver = new ChromeDriver();
		
		//to add late time
		//Thread.sleep(5000);
		
		//to add manage window for maximize
//		Driver.manage().window().maximize();
//		
//		//add implicit wait
//		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//		
//		WebDriver Driver01 = new ChromeDriver(Driver01,20);
//		
//		Driver01.until(ExpectedConditions.visibilityOfElementLocated("" ));
//		
		
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(Driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchFieldException.class);
		
 	}

}
 