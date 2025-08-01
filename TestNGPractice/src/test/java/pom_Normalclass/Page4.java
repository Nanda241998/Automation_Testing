package pom_Normalclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.Base_class;

public class Page4 extends Base_class{
	public static String projectpath = System.getProperty("user.dir");

	@FindBy(xpath = "//a[text()=\"Contact us\"]")
	WebElement contactUs;
	@FindBy(css = "select[class=\"form-control\"]")
	WebElement subjectHeading;
	@FindBy(css = "input[name=\"id_order\"]")
	WebElement orderReferences;
	@FindBy(css = "div[id=\"uniform-fileUpload\"]")
	WebElement fileUpload;
	@FindBy(css="button[id=\"submitMessage\"]")WebElement send;

	public Page4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void actionsPerformed() throws Throwable {
		contactUs.click();
		JavaScriptExecutor("window.scrollBy(0,310)");
		subjectHeading.click();
		Select sel = new Select(subjectHeading);
		sel.selectByVisibleText("Customer service");
		//orderReferences.sendKeys("4");
		fileUpload.click();
		StringSelection file = new StringSelection(
				projectpath + "\"F:\\Nanda_software_testing\\Manual_Testing\\NANDA_TEST CASES.xlsx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		Robot r = new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		send.click();

	}

}
