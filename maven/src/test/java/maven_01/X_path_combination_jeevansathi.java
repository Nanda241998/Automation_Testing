package maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_combination_jeevansathi {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.jeevansathi.com/");
		
		//COMBINATIONS OF JEEVANSATHI WEBSITE

		// tagname & attribute----//tagname[@attribute="value"]
		driver.findElement(By.xpath("//div[@id=\"help\"]"));
		driver.findElement(By.xpath("//script[@id=\"ga-script\"]"));
		driver.findElement(By.xpath("//script[@id=\"ga-script-1\"]"));
		driver.findElement(By.xpath("//script[@id=\"ga-script-2\"]"));
		driver.findElement(By.xpath("//script[@id=\"ga-script-3\"]"));

		// multiple tagname and
		// attribute----//tagname[@attribute1="value1"][@attribute2="value2"]
		driver.findElement(By.xpath("//script[@id=\"freshchat\"][@data-nscript=\"beforeInteractive\"]"));
		driver.findElement(By.xpath("//script[@id=\"__NEXT_DATA__\"][@type=\"application/json\"]" ));
		driver.findElement(By.xpath("//meta[@name=\"author\"][@content=\"https://www.jeevansathi.com\"] "));
		driver.findElement(By.xpath("//meta[@name=\"copyright\"][@content=\"2024 jeevansathi.com\"]" ));
		driver.findElement(By.xpath("//meta[@content=\"en\"][@http-equiv=\"content-language\"]"));
		
		//using and-------tagname[@attribute1="value1" and @attribute2="value2"]
		driver.findElement(By.xpath("//script[@id=\"__NEXT_DATA__\"and@type=\"application/json\"]"));
		driver.findElement(By.xpath("//script[@id=\"GTM_script\"and@data-nscript=\"afterInteractive\"]"));
		driver.findElement(By.xpath("//div[@class=\"relative z-50\"and@id=\"flash-message-portal\"]"));
		driver.findElement(By.xpath("//div[@id=\"js-footer\"and@class=\"jsx-e9e8a3093f3223ae\"]"));
		driver.findElement(By.xpath("//div[@id=\"signupSection\"and@class=\"jsx-45f4e8f85b895f2d m-3\"]"));
		
		//using or -------//tagname[@attribute1="value1"or@attribute2="value"]
		
		driver.findElement(By.xpath("//div[@id=\"signupSection\"or@class=\"jsx-45f4e8f85b895f2d m-3\"]"));
		driver.findElement(By.xpath("//div[@id=\"signupSection\"or@class=\"jsx-9eb1b484cea2908f mb-4 self-en\"]"));
		driver.findElement(By.xpath("//div[@id=\"signupSection\"or@id=\"hel\"]"));
		driver.findElement(By.xpath("//div[@id=\"signupSection\"or@id=\"email\"]"));
		driver.findElement(By.xpath("//div[@class=\"jsx-45f4e8f85b895f2d m-3\"or@id=\"email\"]"));
		
		//contains----//tagname[contains@attribute,"value]
		driver.findElement(By.xpath("//meta[contains(@name,\"viewport\")]"));
		driver.findElement(By.xpath("//meta[contains(@content,\"IE=edge\")]"));
		driver.findElement(By.xpath("//meta[contains(@name,\"author\")]"));
		driver.findElement(By.xpath("//meta[contains(@http-equiv,\"Content-Type\")]"));
		driver.findElement(By.xpath("//meta[contains(@name,\"description\")]"));

		//starts with------//tagname[starts-with(@attribute,"value")]
		driver.findElement(By.xpath("//meta[starts-with(@name,\"description\")]"));
		driver.findElement(By.xpath("//meta[starts-with(@http-equiv,\"X-UA-Compatible\")]"));
		driver.findElement(By.xpath("//meta[starts-with(@name,\"google-site-verification\")]"));
		driver.findElement(By.xpath("//meta[starts-with(@name,\"verify-v1\")]"));
		driver.findElement(By.xpath("//meta[starts-with(@name,\"next-head-count\")]"));
		
		//text----tagname[text()="text"]
		driver.findElement(By.xpath("//p[text()=\"BROWSE PROFILES BY\"]"));
		driver.findElement(By.xpath("//p[text()=\"SEARCH\"]"));
		driver.findElement(By.xpath("//p[text()=\"HELP\"]"));
		driver.findElement(By.xpath("//p[text()=\"Now, chat for free!\"]"));
		driver.findElement(By.xpath("//p[text()=\"Finding your perfect match just became easier\"]"));
		

	}

}
