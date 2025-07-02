package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dynamic_code.Base_class;

public class SignUpPage1 extends Base_class{
	//repository
	@FindBy(css="a.login") WebElement signUp;
	@FindBy(css="input#email_create") WebElement emailAddress;
	@FindBy(css="button#SubmitCreate") WebElement createAnAccount;
	
	public SignUpPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void accountVerify() {
		signUp.click();
		JavaScriptExecutor("window.scrollBy(0,300)");
		emailAddress.sendKeys("9856656yyyi909090j@gmail.com");
		createAnAccount.click();
	}

}
