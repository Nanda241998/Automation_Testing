package properties;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFile_01 {
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream file;
	public static Properties F1;
	public static Properties F2;
	public static Properties F3;
	public static WebDriver driver;

	public static void property() throws Throwable {
		file = new FileInputStream(projectpath + "\\src\\main\\java\\F1_propertyFile_01.properties");

		F1 = new Properties();
		F1.load(file);
		
		file = new FileInputStream(projectpath + "\\src\\main\\java\\F2_propertyFile_02.properties");

		F2 = new Properties();
		F2.load(file);
		
		file = new FileInputStream(projectpath + "\\src\\main\\java\\F3_PropertyFile_03.properties");

		F3 = new Properties();
		F3.load(file);

	}
	public static void BrowserProperty(String BrowserKey) {
		if (F1.getProperty(BrowserKey).equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (F1.getProperty(BrowserKey).equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (F1.getProperty(BrowserKey).equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		System.out.println("The browser launched is as:" + F1.getProperty(BrowserKey));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void Url_02(String UrlKey) {
		driver.get(F1.getProperty(UrlKey));
		System.out.println("The url is as:"+F1.getProperty(UrlKey));
		System.out.println("the title of webpage is as:" + driver.getTitle());
	}
	public static void JavaScriptExecutor01(String executedScript) {
		JavascriptExecutor jscript = (JavascriptExecutor) driver;

		jscript.executeScript(executedScript);
	}

}
