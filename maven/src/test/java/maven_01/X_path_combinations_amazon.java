package maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X_path_combinations_amazon {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		//tagname & attribute----//tagname[@attribute="value"]
		driver.findElement(By.xpath("//div[@id=\"nav-flyout-iss-anchor\"]"));
		driver.findElement(By.xpath("//div[@id=\"nav-xshop-container\"]"));
		driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]"));
		driver.findElement(By.xpath("//meta[@http-equiv=\"x-dns-prefetch-control\"] "));
		driver.findElement(By.xpath("//meta[@name=\"description\"] "));
		
		//multiple tagname and attribute----//tagname[@attribute1="value1"][@attribute2="value2"]
		
		driver.findElement(By.xpath("//link[@rel=\"canonical\"] [@rel=\"icon\"]"));
		driver.findElement(By.xpath("//meta[@name=\"encrypted-slate-token\"] [@name=\"msvalidate.01\"]" ));
		driver.findElement(By.xpath("//meta[@property=\"og:description\"] [@property=\"og:image\"] "));
		driver.findElement(By.xpath("//meta[@property=\"fb:app_id\"] [@name=\"twitter:site:id\"]" ));
		
		//using and-------tagname[@attribute1="value1" and @attribute2="value2"]
		
		driver.findElement(By.xpath("//link[@rel=\"canonical\"and@href=\"https://www.amazon.in/\"]"));
		driver.findElement(By.xpath("//meta[@name=\"msvalidate.01\"and@content=\"3C8D6512B1E530046DE0569BA27093F3\"]"));
		driver.findElement(By.xpath("//link[@rel=\"icon\"and@href=\"/favicon.ico\"]"));
		driver.findElement(By.xpath("//div[@id=\"pageContent\"and@class=\"a-section a-spacing-none\"]"));
		driver.findElement(By.xpath("//div[@id=\"gw-layout\"and@class=\"a-section a-spacing-none aok-relative\"]"));
		
		//using or-----tagname[@attribute1="value1"or@attribute2="Value2"]
		
		driver.findElement(By.xpath("//div[@id=\"gw-layout\"or@class=\"a-section a-spacing-none aok-relative\"]"));
		driver.findElement(By.xpath("//div[@id=\"gw-card-layout\"or@class=\"a-section a-spacing-none aok-relativ\"]"));
		driver.findElement(By.xpath("//div[@id=\"desktop-grid-5\"or@id=\"desktop-grid-\"]"));
		driver.findElement(By.xpath("//div[@class=\"a-cardui _fluid-fat-image-link-v2_style_fluidFatImageLink__1nw4J\"or@id=\"desktop-grid-\"]"));
		driver.findElement(By.xpath("//div[@data-display-at=\"sm\"or@id=\"desktop-grid-\"]"));
		
		//using contains---tagname[contains(@attribute,"value")]
		
		driver.findElement(By.xpath("//hr[contains(@class,\"nav-assistant-separator\")]"));
		driver.findElement(By.xpath("//h2[contains(@id,\"nav-assist-shortcuts-heading\")]"));
		driver.findElement(By.xpath("//ul[contains(@class,\"keyboard-shortcuts-list-container\")]"));
		driver.findElement(By.xpath("//h2[contains(@id,\"nav-assist-shortcuts-heading\")]"));
		driver.findElement(By.xpath("//style[contains(@mark,\"aboveNavInjectionCSS\")]"));
		
		//using startswith-----tagname[starts-with(@attribute,"value")]
		
		driver.findElement(By.xpath("//style[starts-with(@mark,\"aboveNavInjectionCSS\")]"));
		driver.findElement(By.xpath("//script[starts-with(@mark,\"aboveNavInjectionJS\")]"));
		driver.findElement(By.xpath("//h2[starts-with(@id,\"nav-assist-shortcuts-heading\")]"));
		driver.findElement(By.xpath("//div[starts-with(@id,\"nav-assist-shortcut-help\")]"));
		driver.findElement(By.xpath("//div[starts-with(@class,\"shortcut-help-container\")]"));
		
		//using text--------tagname[text()="text"]
		
		driver.findElement(By.xpath("//a[text()=\"New Releases\"]"));
		driver.findElement(By.xpath("//a[text()=\"Fresh\"]"));
		driver.findElement(By.xpath("//a[text()=\"Sell\"]"));
		driver.findElement(By.xpath("//a[text()=\"MX Player\"]"));
		driver.findElement(By.xpath("//a[text()=\"Buy Again\"]"));
		
		//using parent and child relationship------//parenttagname[@parentattribute="value"]//childtagname[@childattribute="value"]
		driver.findElement(By.xpath("//select[@data-nav-digest=\"hhziVplHAm5p3dKrw6I8PjH3ToE=\"]//option[@value=\"search-alias=aps\"]"));
		driver.findElement(By.xpath("//select[@data-nav-digest=\"hhziVplHAm5p3dKrw6I8PjH3ToE=\"]//option[@value=\"search-alias=alexa-skills\"]"));
		driver.findElement(By.xpath("//select[@data-nav-digest=\"hhziVplHAm5p3dKrw6I8PjH3ToE=\"]//option[@value=\"search-alias=amazon-devices\"]"));
		driver.findElement(By.xpath("//select[@data-nav-digest=\"hhziVplHAm5p3dKrw6I8PjH3ToE=\"]//option[@value=\"search-alias=fashion\"]"));
		driver.findElement(By.xpath("//select[@data-nav-digest=\"hhziVplHAm5p3dKrw6I8PjH3ToE=\"]//option[@value=\"search-alias=nowstore\"]"));
		
		//using current node or self node-------//tagname[@attribute="value"]//self::currenttagname
		driver.findElement(By.xpath("//option[@value=\"search-alias=alexa-skills\"]//self::option"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=amazon-devices\"]//self::option"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=fashion\"]//self::option"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=nowstore\"]//self::option"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=amazon-pharmacy\"]//self::option"));
		
		//using child to parent node----//childtagname[@childattribute="value"]//parent::parenttagname
		driver.findElement(By.xpath("//option[@value=\"search-alias=amazon-pharmacy\"]//parent::select"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=fashion\"]//parent::select"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=appliances\"]//parent::select"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=mobile-apps\"]//parent::select"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=audible\"]//parent::select"));
		
		//using parent to child node-----//parenttagname[@parentattribute="value"]//child::childtagname
		
		driver.findElement(By.xpath("(//select[@aria-describedby=\"searchDropdownDescription\"]//child::option)[1]"));
		
             
	}

}
