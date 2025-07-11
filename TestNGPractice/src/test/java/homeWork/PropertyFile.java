package homeWork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyFile {
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream file;
	public static WebDriver driver;
	public static Properties T1;
	public static Properties T2;
	public static Properties T3;



	public static void properties() throws IOException, Throwable {
		file = new FileInputStream(projectpath + "\\src\\main\\java\\T1_propertyFile.properties");
		Properties T1 = new Properties();
		T1.load(file);

		file = new FileInputStream(projectpath + "\\src\\main\\java\\T2_propertyFile.properties");
		Properties T2 = new Properties();
		T2.load(file);

		file = new FileInputStream(projectpath + "\\src\\main\\java\\T3_propertyFile.properties");
		Properties T3 = new Properties();
		T3.load(file);

	}

	/*public static void openBrowser(String BrowserKey) {
		if (T1.getProperty(BrowserKey).equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (T1.getProperty(BrowserKey).equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (T1.getProperty(BrowserKey).equalsIgnoreCase("fireffox")) {
			driver = new FirefoxDriver();
		}

		System.out.println("the browser launched is as:" + T1.getProperty(BrowserKey));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public static void urlLaunch(String urlKey) {
		driver.get(T1.getProperty(urlKey));
		System.out.println("the url launched is as:" + T1.getProperty(urlKey));
		System.out.println("the webpage title is as:" + driver.getTitle());
	}*/

}
