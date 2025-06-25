package database_testing;

import org.openqa.selenium.By;

import dynamic_code.Dynamic_Database;

public class DynamicDatabase extends Dynamic_Database {

	public static void main(String[] args) throws Throwable{

		Launch_01("chrome");
		takesScreenshot("chromeSc");
		HitUrl("https://www.naukri.com/");
		takesScreenshot("urlSc");


		driver.findElement(By.cssSelector("a[title=\"Jobseeker Login\"]")).click();

		DatabaseTesting("/sql1", "select username,password from Applications where SrNo=8;");
		takesScreenshot("querySc");



		getString1("username", By.cssSelector("input[placeholder=\"Enter your active Email ID / Username\"]"));
		takesScreenshot("usernameSc");



		getString1("password", By.cssSelector("input[type=\"password\"]"));
		takesScreenshot("passwordSc");
		

	}

}
