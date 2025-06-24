package launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_elements01 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.cssSelector("input[name=\"username\"]"));
		
		username.click();
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		password.click();
		password.sendKeys("admin123");
		WebElement login_button = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		login_button.click();
		WebElement search_bar=driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
		search_bar.click();
		 Thread.sleep(2000);
		search_bar.sendKeys("Admin");
		WebElement Admin=driver.findElement(By.cssSelector("span[class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]"));
        Admin.click();
        WebElement admin_username=driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
        admin_username.click();
        admin_username.sendKeys("nanda123");
       // WebElement user_role=driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]"));
       // user_role.click();
       
       WebElement Employee_name=driver.findElement(By.cssSelector("input[placeholder=\"Type for hints...\"]"));
        Employee_name.click();
        Employee_name.sendKeys("John Wick");
        
       /* System.out.println(username.getTagName());
		System.out.println(username.getText());
		System.out.println(username.getAttribute("name"));
		System.out.println(username.getLocation().x);
		System.out.println(username.getLocation().y);
		System.out.println(username.getSize());
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());
		System.out.println(username.isSelected());*/
        
        //WebElement reset=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]"));
//       / reset.click();
        
        //search_bar.sendKeys("PIM");
        
       

	}

}
