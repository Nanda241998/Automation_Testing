package greenCarttest_case;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dyanamicCode.Base_class;

public class Page2GreenCart extends Base_class {

	@FindBy(css = "input[placeholder=\"Search for Vegetables and Fruits\"]")
	WebElement searchVeggies;
	@FindBy(xpath = "//a[text()=\"Top Deals\"]")
	WebElement topDeals;
	@FindBy(xpath = "//select[@id=\"page-menu\"]")
	WebElement pageSize;
	@FindBy(css = "input[type='search']")
	WebElement search;
	@FindBy(xpath = "//a[@aria-label='Next']")
	WebElement next;
	@FindBy(css = "abbr[aria-label=\"July 3, 2025\"]")
	WebElement currentDates;
	@FindBy(css = "svg[class=\"react-date-picker__calendar-button__icon react-date-picker__button__icon\"]")
	WebElement calender;
	@FindBy(xpath = "//buttn[@class=\"react-calendar__navigation__arrow react-calendar__navigation__next-button\"]")
	WebElement nextCalender;
	@FindBy(css = "abbr[aria-label=\"October 24, 2025\"]")
	WebElement date;

	public Page2GreenCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void actionsPerformedSearch() throws InterruptedException {
		searchVeggies.click();
		searchVeggies.sendKeys("Brocolli");
		Thread.sleep(2000);
		searchVeggies.clear();
		Thread.sleep(2000);

		searchVeggies.sendKeys("Carrot");
		Thread.sleep(2000);

		searchVeggies.clear();
		Thread.sleep(2000);

		searchVeggies.sendKeys("Tomato");
		Thread.sleep(2000);

		searchVeggies.clear();
		Thread.sleep(2000);

		searchVeggies.sendKeys("beans");
		Thread.sleep(4000);
	}

	public void actionsPerformedTopDeals() throws InterruptedException {
		topDeals.click();

		Set<String> window_id = driver.getWindowHandles();

		Iterator<String> id = window_id.iterator();

		String parent_id = id.next();

		System.out.println("the parent id is as:" + parent_id);

		String child_id = id.next();

		System.out.println("the child id is as:" + child_id);

		driver.switchTo().window(child_id);
		// search.sendKeys("rice");;
		Thread.sleep(2000);
//		pageSize.click();
//		Select sel= new Select(pageSize);
//		sel.selectByVisibleText("20");
		Thread.sleep(2000);

		next.click();

		Thread.sleep(2000);
		next.click();

		calender.click();
		nextCalender.click();
		nextCalender.click();
		nextCalender.click();

		/*
		 * while (true) { String currentDate = currentDates.getText();
		 * System.out.println("current date is:" + currentDate); Thread.sleep(2000);
		 * 
		 * if (!(currentDate.equalsIgnoreCase("October 2025"))) { nextCalender.click();
		 * } else { break; }
		 */
		Thread.sleep(2000);

		date.click();

	}

}
