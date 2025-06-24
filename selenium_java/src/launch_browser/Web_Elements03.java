package launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements03 {

	public static void main(String[] args) throws Throwable {
		WebDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();

		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Driver.get("https://www.flipkart.com/");
		WebElement login=Driver.findElement(By.cssSelector("a[title=\"Login\"]"));
		login.click();
		WebElement email=Driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		email.sendKeys("7798303904");
		WebElement request_otp=Driver.findElement(By.cssSelector("button[class=\"QqFHMw twnTnD _7Pd1Fp\"]"));
		request_otp.click();
		Thread.sleep(3000);
		WebElement verify= Driver.findElement(By.cssSelector("button[class=\"MJG8Up\"]"));
		verify.click();
		//Driver.navigate().back();
		WebElement searchbar = Driver.findElement(By.cssSelector("input[type=\"text\"]"));

		searchbar.click();
		searchbar.sendKeys("Mobiles");
		Thread.sleep(2000);
		// searchbar.clear();
		WebElement mobiles = Driver.findElement(By.cssSelector("input[type=\"text\"]"));

		mobiles.click();

		// System.out.println("test of searchbar is as:"+searchbar.getText());
		System.out.println("tagname of searchbar is as:" + searchbar.getTagName());
		System.out.println("attribute of searchbar is as:" + searchbar.getAttribute("type"));
		System.out.println("searchbar is displayed or not:" + searchbar.isDisplayed());
		System.out.println("searchbar is enbaled or not:" + searchbar.isEnabled());
		System.out.println("searchbar is selected or not:" + searchbar.isSelected());
		System.out.println("x coordinate location of searchbar is as:" + searchbar.getLocation().x);
		System.out.println("y coordinate location of searchbar is as:" + searchbar.getLocation().y);
		System.out.println("size of searchbar is as:" + searchbar.getSize());

	}

}
