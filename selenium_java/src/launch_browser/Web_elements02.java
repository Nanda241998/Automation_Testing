package launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_elements02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Driver.get("https://www.facebook.com/");
		WebElement email = Driver.findElement(By.cssSelector("input#email"));

		email.click();
		email.sendKeys("nanda123@gmail.com");
		Thread.sleep(3000);
		WebElement password = Driver.findElement(By.cssSelector("input#pass"));
		password.click();
		password.sendKeys("nanda@1234");
		WebElement login_button=Driver.findElement(By.cssSelector("button[name=\"login\"]"));
		System.out.println("Text of login button is as:"+login_button.getText());
		System.out.println("attribute of email is as:"+email.getAttribute("id"));
		System.out.println("attribute of loginbutton is as:"+login_button.getAttribute("name"));
		System.out.println("attribute of password is as:"+password.getAttribute("id"));
		System.out.println("text of password is as:"+password.getText());
		System.out.println("tagname of password is as:"+password.getTagName());
		System.out.println("tagname of email is as:"+email.getTagName());
		System.out.println("tagname of loginbutton is as:"+login_button.getTagName());
		System.out.println("x coordinate location of loginbutton is as:"+login_button.getLocation().x);
		System.out.println("y coordinate location of loginbutton is as:"+login_button.getLocation().y);
		System.out.println("size of loginbutton is as:"+login_button.getSize());
		System.out.println("login button is displayed or not:"+login_button.isDisplayed());
		System.out.println("login button is enabled or not:"+login_button.isEnabled());
		System.out.println("login button is selected or not:"+login_button.isSelected());
		System.out.println("x coordinate location of email is as:"+email.getLocation().x);
		System.out.println("y coordinate location of email is as:"+email.getLocation().y);
		System.out.println("size of email is as:"+email.getSize());
		System.out.println("email is displayed or not:"+email.isDisplayed());
		System.out.println("email is enabled or not:"+email.isEnabled());
		System.out.println("email is selected or not :"+email.isSelected());
		System.out.println("password is displayed or not:"+password.isDisplayed());
		System.out.println("password is enabled or not:"+password.isEnabled());
		System.out.println("password is selected or not:"+password.isSelected());
		System.out.println("x coordinate location of password is as:"+password.getLocation().x);
		System.out.println("y coordinate location of password is as:"+password.getLocation().y);
		System.out.println("size of password is as:"+password.getSize());
		
		//login_button.click();


	}

}
