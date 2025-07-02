package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {
	//repositary
	@FindBy(xpath="(//input[@type=\"radio\"])[2]") WebElement gender;
	@FindBy(css="input#customer_firstname") WebElement FirstName;
	@FindBy(css="input#customer_lastname") WebElement LastName;
	@FindBy(xpath="//input[@data-validate=\"isPasswd\"]") WebElement password;
	@FindBy(css="select#days") WebElement days;
	@FindBy(css="select#months") WebElement months;
	@FindBy(css="select#years") WebElement years;
	@FindBy(xpath="//span[text()=\"Register\"]") WebElement register;
	
	public CreateAnAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void accountCreate() {
		gender.click();
		FirstName.sendKeys("Rakshada");
		LastName.sendKeys("waghmare");
		password.sendKeys("hgsj@123");
		
		Select sel= new Select(days);
		sel.selectByValue("6");
		
		Select sel1= new Select(months);
		sel1.selectByValue("3");
		
		Select sel2 = new Select(years);
		sel2.selectByValue("1990");
		
		register.click();
	}

}
