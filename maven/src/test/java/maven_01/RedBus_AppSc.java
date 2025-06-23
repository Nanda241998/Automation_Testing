package maven_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class RedBus_AppSc extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");
		
		HitUrl("https://www.redbus.in/");
		
	
		Thread.sleep(2000);
		WebElement title = driver.findElement(By.cssSelector("img[title=\"redBus\"]"));
		
		title.click();
		//Thread.sleep(2000);
		//Driver.close();
		
		takesScreenshot("titleRedbusSc");
		
		
		WebElement busTickets = driver.findElement(By.xpath("(//span[@class=\"lobName___59121b\"])[1]"));
		busTickets.click();
		/*WebElement from= Driver.findElement(By.xpath("(//div[@class=\"srcDest___c237d1\"])[1]"));
		from.click();
		from.sendKeys("pune");
		WebElement to = Driver.findElement(By.xpath("(//div[@class=\"srcDest___c237d1\"])[2]"));
		to.click();
		to.sendKeys("nagpur");*/
		
		takesScreenshot("busTicketsSc");
		
		WebElement trainTickets = driver.findElement(By.cssSelector("img[alt=\"Online Train Tickets Booking\"]"));
		trainTickets.click();
		
		takesScreenshot("trainticketsSc");
		
		WebElement bookings=driver.findElement(By.xpath("(//div[@class=\"navOption___546a60\"])[1] "));
		bookings.click();
		
		takesScreenshot("bookingsSc");
		
		
		driver.navigate().back();
		
		driver.close();

	}

}
