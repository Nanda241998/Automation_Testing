package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dynamic_code.Base_class;


 @org.testng.annotations.Listeners(NormalclassListener.class)
public class Listeners extends Base_class {
  @Test(priority = 1)
  public void brower_launch() {
	  System.out.println("chrome browser");
  }
  @Test(priority = 2)
  public void url() {
	  System.out.println("snapdeal url");
  }
  @Test(priority = 3)
  public void mensfashion() {
	 WebElement mensfashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
	 act.moveToElement(mensfashion).build().perform();
	 System.out.println("mensfashion");
  }
  @Test(priority = 4)
  public void womensfashion() {
	  WebElement womensfashion = driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
	  act.moveToElement(womensfashion).build().perform();
	  System.out.println("womensfashion");
  }
  @Test(priority = 5)
  public void homeAndkitchen() {
	  WebElement homeAndkitchen = driver.findElement(By.xpath("//span[text()=\"Home & Kitchen\"]"));
	  act.moveToElement(homeAndkitchen).build().perform();
	  System.out.println("homeAndkitchen");
  }
  @Test(priority = 6)
  public void toysandfashion() {
	  
	  WebElement toysandfashion = driver.findElement(By.xpath("//span[text()=\"Toys, Kids' Fashion & more\"]"));
	  act.moveToElement(toysandfashion).build().perform();
	  System.out.println("toysandfashion");
  }
 
}
