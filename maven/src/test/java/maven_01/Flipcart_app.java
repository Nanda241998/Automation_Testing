package maven_01;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.io.FileHandler;

import dynamic_code.Launch_Browser;

public class Flipcart_app extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.flipkart.com/");

		TakesScreenshot sc_01 = (TakesScreenshot) driver;
		File Folder = sc_01.getScreenshotAs(OutputType.FILE);

		File launch = new File("./Screenshots/sc1.png");
		FileHandler.copy(Folder, launch);

		WebElement Login = driver.findElement(By.xpath("(//a[@title=\"Login\"])[1]"));

		Login.click();

		TakesScreenshot sc_02 = (TakesScreenshot) driver;

		File Folder2 = sc_02.getScreenshotAs(OutputType.FILE);

		File login = new File("./Screenshots/loginSc.png");

		FileHandler.copy(Folder2, login);

		Thread.sleep(2000);
		driver.navigate().back();

		TakesScreenshot sc_03 = (TakesScreenshot) driver;

		File Folder3 = sc_03.getScreenshotAs(OutputType.FILE);

		File back = new File("./Screenshots/rolebuttonSc.png");
		FileHandler.copy(Folder3, back);

		WebElement rolebutton = driver.findElement(By.cssSelector("span[class=\"_30XB9F\"]"));
		rolebutton.click();
		TakesScreenshot sc_04 = (TakesScreenshot) driver;

		File Folder4 = sc_04.getScreenshotAs(OutputType.FILE);

		File rolebutton1 = new File("./Screenshots/backSc.png");
		FileHandler.copy(Folder4, rolebutton1);

		WebElement searchbar = driver.findElement(By.cssSelector("input[title=\"Search for Products, Brands and More\"]"));
		searchbar.click();
		searchbar.sendKeys("mobiles");
		searchbar.clear();

		TakesScreenshot sc_05 = (TakesScreenshot) driver;

		File Folder5 = sc_05.getScreenshotAs(OutputType.FILE);

		File search = new File("./Screenshots/Search.png");
		FileHandler.copy(Folder5, search);

		Thread.sleep(2000);

		WebElement mobiles = driver.findElement(By.cssSelector("img[alt=\"Mobiles\"]"));
		mobiles.click();

		String mobile = System.getProperty("user.dir");

		TakesScreenshot sc_06 = (TakesScreenshot) driver;

		File search_mobile = sc_06.getScreenshotAs(OutputType.FILE);

		File click_mobile = new File(mobile + "\\Screenshots\\mobileSc.png");
		FileHandler.copy(search_mobile, click_mobile);

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.cssSelector("img[alt=\"Fashion\"]"));
		fashion.click();
		Screenshot("fashionSc");

		Thread.sleep(2000);
		driver.close();

	}

}
