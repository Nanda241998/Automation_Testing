package automationPractiseTestNgExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import automationPractise.NormalClass;

public class Page3 extends NormalClass {
	@FindBy(xpath="(//div[@class=\"radio\"])[1]") WebElement id;
	@FindBy(xpath="//input[@name=\"customer_firstname\"]") WebElement FirstName;
	@FindBy(xpath="(//input[@data-validate=\"isName\"])[2]") WebElement LastName;
	@FindBy(css="input[data-validate=\"isPasswd\"]") WebElement password;
	@FindBy(css="select#days") WebElement days;
	
	@FindBy(css="select#months") WebElement months;
	@FindBy(css="select#years") WebElement years;
	@FindBy(xpath="(//button[@type=\"submit\"])[2]") WebElement register;
	
	
	public Page3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void accountVerify() {
		id.click();
		FirstName.sendKeys("khitij");
		LastName.sendKeys("dhande");
		password.sendKeys("ojuu@1111");
		
		days.click();
		Select sel= new Select(days);
		sel.selectByValue("4");
		Select sel1= new Select(months);
		sel1.selectByValue("4");
		Select sel2= new Select(years);
		sel2.selectByValue("1998");
		register.click();
	}

}
