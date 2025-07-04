package automationPractiseTestNgExecution;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationPractise.NormalClass;

public class Page2 extends NormalClass{
	
	@FindBy(xpath="//a[@class=\"login\"]")WebElement login;
	@FindBy(xpath="(//input[@data-validate=\"isEmail\"])[1]") WebElement email;
	@FindBy(xpath="//button[@name=\"SubmitCreate\"]") WebElement accCreate;
	
	public Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void actions() {
		login.click();
		JavaScriptExecutor("window.scrollBy(0,300)");
		email.sendKeys("24615974777yyyy@gmail.com");
		accCreate.click();
	}
	

}
