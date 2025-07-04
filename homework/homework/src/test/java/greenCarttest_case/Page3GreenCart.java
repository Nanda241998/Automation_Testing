package greenCarttest_case;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dyanamicCode.Base_class;

public class Page3GreenCart extends Base_class {

	@FindBy(xpath = "//a[text()=\"Flight Booking\"]")
	WebElement flightBooking;
	// @FindBy(xpath="(//input[@type=\"radio\"])[2]") WebElement roundTrip;
	@FindBy(xpath = "//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")
	WebElement departureCity;

	@FindBy(xpath = "//input[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")
	WebElement arrivalCity;
	@FindBy(xpath = "(//button[@class=\"ui-datepicker-trigger\"])[1]")
	WebElement calender1;
	@FindBy(xpath = "(//div[@class=\"ui-datepicker-title\"])[2]")
	WebElement currentDates;
	@FindBy(xpath = "//a[@data-handler=\"next\"]")
	WebElement next;
	@FindBy(xpath = "//a[@data-handler=\"next\"]")
	WebElement next2;
	@FindBy(xpath = "//a[@data-handler=\"next\"]")
	WebElement next3;
	@FindBy(xpath = "(//a[text()=\"14\"])[2]")
	WebElement selectDate;
	// @FindBy(xpath = "(//button[@class=\"ui-datepicker-trigger\"])[2]")
	// WebElement calender2;
	// @FindBy(xpath = "//span[text()=\"Next\"]")
	// WebElement next2;
	@FindBy(xpath = "(//a[text()=\"12\"])[2]")
	WebElement selectDate2;
	@FindBy(xpath = "//div[@id=\"divpaxOptions\"]")
	WebElement passengers;
	@FindBy(xpath = "(//span[@id=\"hrefIncChd\"])[1]")
	WebElement plus;
	@FindBy(xpath = "//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]")
	WebElement currency;
	@FindBy(xpath = "(//input[@value=\"Search\"])[1]")
	WebElement search;

	public Page3GreenCart(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void actionsPerformedFlightBooking() throws InterruptedException {

		flightBooking.click();

		Set<String> window_id = driver.getWindowHandles();

		Iterator<String> id = window_id.iterator();

		String parent_id = id.next();

		System.out.println("the parent id is as:" + parent_id);

		String child_id = id.next();

		System.out.println("the child id is as:" + child_id);

		driver.switchTo().window(child_id);

		// roundTrip.click();
		departureCity.click();
		departureCity.sendKeys("Nagpur");
		arrivalCity.sendKeys("Pune");
		// calender1.click();
		// calender1.click();
		Thread.sleep(2000);

		while (true) {
			String currentdate = currentDates.getText();
			System.out.println("the current date is as:" + currentdate);
			if (!(currentdate.equalsIgnoreCase("August 2019"))) {
				next.click();
			} else {
				break;
			}
		}
		selectDate.click();
//		System.out.println("the selected date is as:"+selectDate.getText());

		// passengers.click();
		// plus.click();
		currency.click();
		Select sel = new Select(currency);
		sel.selectByVisibleText("AED");
		search.click();
		Thread.sleep(3000);
	}
}
