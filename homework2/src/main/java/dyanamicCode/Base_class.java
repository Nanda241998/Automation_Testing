package dyanamicCode;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base_class {
	public static Actions act;
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static ExtentSparkReporter Esr;
	public static ExtentReports Er;
	public static ExtentTest Et;

	public static void Launch_01(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		System.out.println("The browser launched is as:" + Browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void HitUrl(String Url) {
		driver.get(Url);
		System.out.println("the title of webpage is as:" + driver.getTitle());
	}

	public static void takesScreenshot(String Screenshot_name) throws Throwable {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);

		File target = new File("./target/" + Screenshot_name + ".png");

		FileHandler.copy(source, target);
	}

	public static void Screenshot(String Screenshot_name_01) throws Throwable {
		TakesScreenshot sc_01 = (TakesScreenshot) driver;
		File source1 = sc_01.getScreenshotAs(OutputType.FILE);

		File target1 = new File(projectpath + "\\FailedTest\\" + Screenshot_name_01 + ".png");

		FileHandler.copy(source1, target1);

	}

	public static void DropdownSc(String Screenshot_Name_02) throws Throwable {
		TakesScreenshot sc_02 = (TakesScreenshot) driver;

		File source2 = sc_02.getScreenshotAs(OutputType.FILE);

		File target1 = new File("./AutomationPSc/" + Screenshot_Name_02 + ".png");
		FileHandler.copy(source2, target1);
	}

	public static void JavaScriptExecutor(String executedScript) {
		JavascriptExecutor jscript = (JavascriptExecutor) driver;

		jscript.executeScript(executedScript);
	}

	public static void ExtentSparkReporter(String webpageTitle, String webPageReports, String Appln,
			String extentClasses, String Reports) {
		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath + "\\Reports\\greencartsite\\");

		Esr.config().setDocumentTitle(webpageTitle);

		Esr.config().setReportName(webPageReports);

		Esr.config().setTheme(Theme.STANDARD);

		// extent report is the class is used to set the system configuration.
		Er = new ExtentReports();

		Er.attachReporter(Esr);

		Er.setSystemInfo("Software", "Eclipse");
		Er.setSystemInfo("Testing", "Automation");
		Er.setSystemInfo("Language", "Java");
		Er.setSystemInfo("Tool", "Selenium");
		Er.setSystemInfo("websites", Appln);
		Er.setSystemInfo("package", "reports");
		Er.setSystemInfo("class", extentClasses);
		Er.setSystemInfo("Folder", Reports);
	}

	public static void ExtentTest(String ExtentTestName, String TestInfo, String reportName) {
		Et = Er.createTest(ExtentTestName);
		Et.log(Status.INFO, TestInfo);

		Et.addScreenCaptureFromPath(projectpath + "\\ReportSc\\" + reportName + ".png");

	}

}
