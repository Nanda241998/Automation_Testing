package launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Css_Selectors {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		driver.get("https://www.amazon.in/");
		         //css selector--- tagname#idvalue
				driver.findElement(By.cssSelector("button#nav-assistant-ingress-button"));
//				driver.findElement(By.cssSelector("pageContent"));
//				//css selector----tagname.classvalue
//				driver.findElement(By.cssSelector("div.copilot-secure-display"));
//			    //css selctor------tagname[attribute="value"]
//				driver.findElement(By.cssSelector("div[id=\"a-page\"]"));
//				driver.findElement(By.cssSelector("div[id=\"rhf-error\"]"));
//				//css selctor multiple attribute------tagname[attribute="attributevalue1"][attribute2="value"]
//				driver.findElements(By.cssSelector("div[id=\"gw-card-layout\"][[id=\"desktop-grid-1-D2\"]"));
//				
//				//contains-----tagname[attribute*="value"]
//				driver.findElement(By.cssSelector("div[data-cy*=\"ad-topper-card-title\"]"));
//				driver.findElement(By.cssSelector("nav[id*=\"shortcut-menu\"]"));
//				
//				//startswith(^)--tagname[attribute^="value"]
//				driver.findElement(By.cssSelector("div[id^=\"desktop-6\"]"));
//				driver.findElement(By.cssSelector("div[id^=\"desktop-grid-7\"]"));
//				
//				//endswith($)----tagname[attribute$="value"]
//				driver.findElement(By.cssSelector("div[id$=\"desktop-grid-2\"]"));
//				driver.findElement(By.cssSelector("div[id$=\"p-grid-3\"]"));
//				
//				
				//pseudo class--css selector---tagname[attribute="value"] :first-child
				driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :first-child"));
				
				
				//pseudo class--css selector---tagname[attribute="value"] :last-child
				driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :last-child"));
				
				
				//pseudo class--css selector---tagname[attribute="value"] :nth-child(2)
				driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-child(2)"));
				driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-child(3)"));
				
				//pseudo class--css selector---tagname[attribute="value"] :nth-last-child(7)
				driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-last-child(7)"));
			}

	


}
