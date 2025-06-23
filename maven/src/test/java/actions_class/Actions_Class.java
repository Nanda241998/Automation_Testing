package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Launch_Browser;

public class Actions_Class extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.naukri.com/");

		Actions act =new Actions(driver);

		/*// to click jobs
		WebElement jobs = Driver.findElement(By.cssSelector("a[title=\"Search Jobs\"]"));
		act.moveToElement(jobs).click().build().perform();
		Thread.sleep(2000);
		Screenshot("jobsSc");

		// to click companies
		WebElement companies = Driver.findElement(By.cssSelector("a[title=\"Explore top companies hiring on Naukri\"]"));
		act.moveToElement(companies).click().build().perform();
		Screenshot("companiesSc");
		Thread.sleep(2000);

		// to click on services
		WebElement services = Driver.findElement(By.cssSelector("a[title=\"Naukri FastForward- Resume Services\"]"));
        act.moveToElement(services).click().build().perform();
		Screenshot("servicesSc");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		Screenshot("heightSc");

		// to click on search
		WebElement search = Driver.findElement(By.cssSelector("input[placeholder=\"Enter keyword / designation / companies\"]"));
		act.moveToElement(search).click().build().perform();
		search.sendKeys("software engineer");
		search.sendKeys(Keys.ENTER);
		
		// JavaScriptExecutor("window.scrollBy(0,document.body.scrollHeight)"
		Screenshot("searchSc_01");
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		JavascriptExecutor js2 = (JavascriptExecutor) Driver;
		js2.executeScript("window.scrollTo(0,0)");
		
		//keyboard actions
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Screenshot("downSc1");

		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Screenshot("downSc2");

		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Screenshot("downSc3");

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		Screenshot("downSc4");

		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		Screenshot("upSc1");

		act.keyDown(Keys.PAGE_UP).build().perform();
		Screenshot("upSc2");*/
		
		

	}

}
