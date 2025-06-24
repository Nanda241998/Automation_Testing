package launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("gw-ftGr-desktop-hero-1"));
		driver.findElement(By.id("desktop-grid-2"));
		driver.findElement(By.id("a-popover-root"));
		driver.findElement(By.name("msvalidate.01"));
		driver.findElement(By.name("twitter:card"));
		driver.findElement(By.className("icp-container-desktop"));
		driver.findElement(By.className("a-carousel-col a-carousel-right celwidget"));
		driver.findElement(By.linkText("MX Player"));
		driver.findElement(By.partialLinkText("MX P"));
		
		driver.findElements(By.tagName("noscript"));
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div/ol/li[4]/div/script"));
         //css selector--- tagname#idvalue
		driver.findElement(By.cssSelector("button#nav-assistant-ingress-button"));
		driver.findElement(By.cssSelector("pageContent"));
		//css selector----tagname.classvalue
		driver.findElement(By.cssSelector("div.copilot-secure-display"));
	    //css selctor------tagname[attribute="value"]
		driver.findElement(By.cssSelector("div[id=\"a-page\"]"));
		driver.findElement(By.cssSelector("div[id=\"rhf-error\"]"));
		//css selctor multiple attribute------tagname[attribute="attributevalue1"][attribute2="value"]
		driver.findElements(By.cssSelector("div[id=\"gw-card-layout\"][[id=\"desktop-grid-1-D2\"]"));
		
		//contains-----tagname[attribute*="value"]
		driver.findElement(By.cssSelector("div[data-cy*=\"ad-topper-card-title\"]"));
		driver.findElement(By.cssSelector("nav[id*=\"shortcut-menu\"]"));
		
		//startswith(^)--tagname[attribute^="value"]
		driver.findElement(By.cssSelector("div[id^=\"desktop-6\"]"));
		driver.findElement(By.cssSelector("div[id^=\"desktop-grid-7\"]"));
		
		//endswith($)----tagname[attribute$="value"]
		driver.findElement(By.cssSelector("div[id$=\"desktop-grid-2\"]"));
		driver.findElement(By.cssSelector("div[id$=\"p-grid-3\"]"));
		
		//Css selector----pseudo class--first value----tagname[attribute="value"]:firstchild
		//driver.findElement(By.cssSelector("))
		
		
	}

}
