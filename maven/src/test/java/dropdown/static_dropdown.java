package dropdown;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class static_dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("the browser launched is:" + driver);
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");
		System.out.println("the wbe page title is:" + driver.getTitle());
		TakesScreenshot tc = (TakesScreenshot) driver;

		File sc = tc.getScreenshotAs(OutputType.FILE);

		File tg = new File("./dropdownSc/Sc_01.png");

		FileHandler.copy(sc, tg);

		WebElement marital_status = driver.findElement(By.cssSelector("select[name=\"reg[mstatus]\"]"));

		marital_status.click();

		Select sc_01 = new Select(marital_status);
		sc_01.selectByVisibleText("Annulled");
		Thread.sleep(4000);
		TakesScreenshot tc1 = (TakesScreenshot) driver;

		File sc1 = tc1.getScreenshotAs(OutputType.FILE);

		File tg1 = new File("./dropdownSc/Sc_02.png");

		FileHandler.copy(sc1, tg1);

		List<WebElement> option1 = driver.findElements(By.xpath("//select[@name=\"reg[mstatus]\"]//child::option"));

		System.out.println("the size of marital status is:" + option1.size());
		Thread.sleep(4000);

		for (int i = 0; i < option1.size(); i++) {
			if (option1.get(i).getText().equalsIgnoreCase("Married")) {
				option1.get(i).click();
			}
		}
		TakesScreenshot tc2 = (TakesScreenshot) driver;

		File sc2 = tc2.getScreenshotAs(OutputType.FILE);

		File tg2 = new File("./dropdownSc/Sc_03.png");

		FileHandler.copy(sc2, tg2);

	}

}
