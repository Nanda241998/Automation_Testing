package maven_01;

import java.io.File;


import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import dynamic_code.Launch_Browser;

public class Dynamic_code extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");
		HitUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		TakesScreenshot sc= (TakesScreenshot) driver;
		File folder = sc.getScreenshotAs(OutputType.FILE);
		File sc01=new File("./Screenshots/sc_04.png");
		FileHandler.copy(folder, sc01);

		WebElement username = driver.findElement(By.cssSelector("input[name=\"username\"]"));
		username.click();
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		Password.click();
		Password.sendKeys("admin123");
		WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		login.click();
		
		WebElement search=driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.click();
		search.sendKeys("Recruitment");
		WebElement recruitment=driver.findElement(By.xpath("//span[text()=\"Recruitment\"]"));
		recruitment.click();
		
		WebElement select=driver.findElement(By.xpath("tabindex=\"0\""));
		
		

		/*Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		WebElement forgotPassword = driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]"));
		forgotPassword.click();
		
		TakesScreenshot sc_01=(TakesScreenshot) driver;
		File folder_01 = sc_01.getScreenshotAs(OutputType.FILE);
		
		File f_P=new File("./Screenshots/sc_03.png");
		FileHandler.copy(folder_01, f_P);

		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		driver.close();*/

	}

	
}
