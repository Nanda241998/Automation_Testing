package pageObjectModel;

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

public class ContactUs_page extends Base_class {
	// repository
	@FindBy(xpath = "//a[@title=\"Contact us\"]")
	WebElement contactUs;
	@FindBy(css = "select#id_contact")
	WebElement subject;
	@FindBy(css = "input[data-validate=\"isEmail\"]")
	WebElement emailid;
	@FindBy(css = "input[name=\"id_order\"]")
	WebElement idorder;
	@FindBy(css = "div[class=\"uploader\"]")
	WebElement fileUpload;

	// pagefactory

	public ContactUs_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void contactUsVeriy() throws Throwable {
		contactUs.click();
		JavaScriptExecutor("window.scrollBy(0,230)");
		Select sel = new Select(subject);
		sel.selectByVisibleText("Customer service");

		//idorder.sendKeys("4");

		fileUpload.click();
		StringSelection copy = new StringSelection(
				"\"F:\\Nanda_software_testing\\Manual_Testing\\NANDA_TEST CASES.xlsx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy, null);

		Robot r = new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
