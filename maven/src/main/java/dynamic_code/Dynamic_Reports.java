package dynamic_code;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Dynamic_Reports {
	static String projectpath = System.getProperty("user.dir");
	public static WebDriver driver;
	public static ExtentReports Er;
	public static ExtentTest Et;

	public static void Extent_reports(String webpageTitle, String webPageReports, String Appln, String extentClasses,
			String Reports, String ExtentTestName, String TestInfo, String TestPassed, String TestFailed,
			String TestSkipped) {
		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath + "\\DynamicReports\\Report_01\\");

		Esr.config().setDocumentTitle(webpageTitle);

		Esr.config().setReportName(webPageReports);

		Esr.config().setTheme(Theme.STANDARD);

		// extent report is the class is used to set the system configuration.
		ExtentReports Er = new ExtentReports();

		Er.attachReporter(Esr);

		Er.setSystemInfo("Software", "Eclipse");
		Er.setSystemInfo("Testing", "Automation");
		Er.setSystemInfo("Language", "Java");
		Er.setSystemInfo("Tool", "Selenium");
		Er.setSystemInfo("websites", Appln);
		Er.setSystemInfo("package", "reports");
		Er.setSystemInfo("class", extentClasses);
		Er.setSystemInfo("Folder", Reports);

		ExtentTest Et = Er.createTest(ExtentTestName);
		Et.log(Status.INFO, TestInfo);
		Et.log(Status.PASS, TestPassed);
		Et.log(Status.FAIL, TestFailed);
		Et.log(Status.SKIP, TestSkipped);

	}

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

	public static void Screenshot(String Screenshot_name_01) throws Throwable {
		TakesScreenshot sc_01 = (TakesScreenshot) driver;
		File source1 = sc_01.getScreenshotAs(OutputType.FILE);

		File target1 = new File(projectpath + "\\ReportsSc\\" + Screenshot_name_01+".png");

		FileHandler.copy(source1, target1);
		
		Er.flush();

	}

	

}
