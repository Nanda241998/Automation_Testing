package testNGPractice11.com.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dynamic_code.Base_class;

public class Alerts extends Base_class {

	@FindBy(xpath="(//a[@data-toggle=\"tab\"])[1]")
	WebElement ok;
	@FindBy(xpath = "//button[@class=\"btn btn-danger\"]")
	WebElement buttonOk;
	@FindBy(xpath="//a[text()=\"Alert with OK & Cancel \"]") WebElement OkandCancel;
	@FindBy(xpath="//button[@onclick=\"confirmbox()\"]") WebElement confirmBox;

	public Alerts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void actionsAlerts() {
		ok.click();
		buttonOk.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		OkandCancel.click();
		confirmBox.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
	}
}
