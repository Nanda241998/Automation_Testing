package pom_Normalclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import homeWork.NormalClass;

public class POM_normal {
	@FindBy(xpath = "//a[text()=\"Top Deals\"]")WebElement topDeals;
	@FindBy(xpath = "//select[@id=\"page-menu\"]")WebElement pageSize;
	@FindBy(xpath = "//input[@type=\"search\"]")WebElement search;
	@FindBy(xpath = "//button[@class=\"react-date-picker__calendar-button react-date-picker__button\"]")WebElement calender;
	@FindBy(xpath = "//span[text()=\"July 2027\"]")WebElement yearMonth;
	@FindBy(xpath = "//button[text()=\"›\"]")WebElement next;
	@FindBy(xpath = "//abbr[text()=\"20\"]")WebElement date;

	public POM_normal(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void locators() {
		
		topDeals.click();
		pageSize.click();
		//Select sel = new Select(pageSize);
		//sel.selectByValue("10");
		search.sendKeys("almond");
		calender.click();
		System.out.println(yearMonth.getText());
		next.click();
		date.click();

	}

}
