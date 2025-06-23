package maven_01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import dynamic_code.Launch_Browser;

public class Takes_Screenshot extends Launch_Browser {

	public static void main(String[] args) throws Throwable {
		Launch_01("chrome");
		
		String url = System.getProperty("user.dir");
		
		TakesScreenshot sc= (TakesScreenshot) driver;
		
		File folder=sc.getScreenshotAs(OutputType.FILE);
		
		File project= new File(url+"\\Screenshots\\webSc1.png");
		FileHandler.copy(folder, project);
		
		
		
		/*HitUrl("https://www.linkedin.com/feed/");
		//first way to find path
		TakesScreenshot sc = (TakesScreenshot) Driver;

		File folder = sc.getScreenshotAs(OutputType.FILE);

		File sc01 = new File("./Screenshots/sc02.png");
		FileHandler.copy(folder, sc01);*/
		
		//second way to find the path
		
	
	}

}
