package database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class {

	public static void main(String[] args) throws SQLException, Throwable {
		String host = "localhost";
		String portNumber = "3306";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@aria-label=\"Click here to Login in application\"]")).click();
		Thread.sleep(3000);

		// url:- "jdbc:mysql://host:portNumber//applications"

		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + portNumber + "/sql1", "root",
				"admin");

		Statement cs = connect.createStatement();
		ResultSet Result = cs.executeQuery("select username,password from Applications where SrNo=6");
		Result.next();
		System.out.println("the username from applications is:" + Result.getString("username"));
		System.out.println("the password from applications is:" + Result.getString("password"));
		driver.findElement(By.xpath("//input[@placeholder=\"User Name\"]")).sendKeys(Result.getString("username"));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(Result.getString("password"));

	}

}
