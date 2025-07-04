package greenCarttest_case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dyanamicCode.Base_class;

public class Page1GreenCart extends Base_class {

	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[1]")
	WebElement Brocolli;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[2]")
	WebElement Cauliflower;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[3]")
	WebElement Cucumber;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[4]")
	WebElement Beetroot;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[5]")
	WebElement Carrot;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[6]")
	WebElement Tomato;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[7]")
	WebElement Beans;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[8]")
	WebElement Brinjal;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[9]")
	WebElement Capsicum;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[10]")
	WebElement Mushroom;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[11]")
	WebElement Potato;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[12]")
	WebElement Pumpkin;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[13]")
	WebElement Corn;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[14]")
	WebElement Onion;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[15]")
	WebElement Apple;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[16]")
	WebElement Banana;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[17]")
	WebElement Grapes;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[18]")
	WebElement Mango;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[19]")
	WebElement MuskMelon;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[20]")
	WebElement Orange;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[21]")
	WebElement Pears;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[22]")
	WebElement Pomegranate;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[23]")
	WebElement Raspberry;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[24]")
	WebElement Strawberry;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[25]")
	WebElement WaterMelon;

	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[26]")
	WebElement Almonds;

	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[27]")
	WebElement Pista;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[28]")
	WebElement NutsMixture;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[29]")
	WebElement Cashews;
	@FindBy(xpath = "(//button[text()=\"ADD TO CART\"])[30]")
	WebElement Walnuts;

	public Page1GreenCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void actionsPerformed() throws Throwable {
		Brocolli.click();
		Thread.sleep(2000);
		Cauliflower.click();
		Thread.sleep(2000);
		Cucumber.click();
		Thread.sleep(2000);

		Beetroot.click();
		Thread.sleep(2000);

		Carrot.click();
		Thread.sleep(2000);

		Tomato.click();
		Thread.sleep(2000);

		Beans.click();
		Thread.sleep(2000);

		Brinjal.click();
		Thread.sleep(2000);

		Capsicum.click();
		Thread.sleep(2000);

		Mushroom.click();
		Thread.sleep(2000);

		Potato.click();
		Thread.sleep(2000);

		Pumpkin.click();
		Thread.sleep(2000);

		Corn.click();
		Thread.sleep(2000);

		Onion.click();
		Thread.sleep(2000);

		Apple.click();
		Thread.sleep(2000);

		Banana.click();
		Thread.sleep(2000);

		Grapes.click();
		Thread.sleep(2000);

		Mango.click();
		Thread.sleep(2000);

		Orange.click();
		Thread.sleep(2000);

		Pears.click();
		Thread.sleep(2000);

		Pomegranate.click();
		Thread.sleep(2000);

		Raspberry.click();
		Thread.sleep(2000);

		Strawberry.click();
		Thread.sleep(2000);

		WaterMelon.click();
		Thread.sleep(2000);

		Almonds.click();
		Thread.sleep(2000);

		Pista.click();
		Thread.sleep(2000);

		NutsMixture.click();
		Thread.sleep(2000);

		Cashews.click();
		Thread.sleep(2000);

		Walnuts.click();

	}
}
