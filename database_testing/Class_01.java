package database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import dynamic_code.Launch_Browser;

public class Class_01 extends Launch_Browser{

	public static void main(String[] args) throws Throwable {
		
		 String host = "localhost";
		 String portnumber = "3306";
		Launch_01("chrome");
		
		
		HitUrl("https://www.naukri.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[title=\"Jobseeker Login\"]")).click();
		Thread.sleep(3000);
		Connection connect = DriverManager.getConnection("jdbc:MySQL://"+host+":"+portnumber+"/sql1", "root", "admin");
		Statement cs = connect.createStatement();
		
		ResultSet Result = cs.executeQuery("select username,password from applications where SrNo=6;");
		Result.next();
		
		System.out.println("username from query is:"+Result.getString("username"));
		System.out.println("username from query is:"+Result.getString("password"));
		driver.findElement(By.cssSelector("input[placeholder=\"Enter your active Email ID / Username\"]")).sendKeys(Result.getString("username"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys(Result.getString("password"));
	
	}

}
