package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.Launch_Browser;

public class Seleect_methods extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");

		HitUrl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");

		WebElement profile = driver.findElement(By.cssSelector("select[name=\"reg[relationship]\"]"));
		profile.click();

		Select sel = new Select(profile);

		sel.selectByVisibleText("Relative/Friend");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
		day.click();

		Select sel1 = new Select(day);
		sel1.selectByValue("24");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));

		month.click();
		Select sel2 = new Select(month);
		sel2.selectByIndex(10);
		Thread.sleep(2000);

		WebElement year = driver.findElement(By.cssSelector("select#reg_dtofbirth_year"));
		year.click();

		Select sel3 = new Select(year);
		sel3.selectByValue("1998");
		Thread.sleep(2000);

		WebElement height = driver.findElement(By.cssSelector("select#reg_height"));

		height.click();

		Select sel4 = new Select(height);
		sel4.selectByValue("3");
		Thread.sleep(2000);

		WebElement marital_status = driver.findElement(By.cssSelector("select#reg_mstatus"));
		marital_status.click();

		Select sel5 = new Select(marital_status);
		sel5.selectByVisibleText("Married");
		Thread.sleep(2000);

		WebElement have_children = driver.findElement(By.cssSelector("select#reg_havechild"));

		have_children.click();

		Select sel8 = new Select(have_children);
		sel8.selectByValue("YT");
		Thread.sleep(2000);

		WebElement mother_tongue = driver.findElement(By.cssSelector("select#reg_mtongue"));
		mother_tongue.click();

		Select sel6 = new Select(mother_tongue);
		sel6.selectByValue("33");
		Thread.sleep(2000);

		WebElement religion = driver.findElement(By.cssSelector("div[id=\"reg_religion_chzn\"]"));

		religion.click();
		religion.sendKeys("Christian");

//		Select sel7 = new Select(religion);
//		sel7.selectByVisibleText("Christian");

	}

}
