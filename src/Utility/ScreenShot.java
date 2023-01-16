package Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
public static void captureScreenshot(WebDriver driver,String name) throws IOException {
	
	TakesScreenshot scrnshot = (TakesScreenshot)driver;
	
	File source = scrnshot.getScreenshotAs(OutputType.FILE);
	
	String path=System.getProperty("user.dir")+ "\\screenshots\\"+name+".png";
	
	File destination = new File(path);	
	
	FileHandler.copy(source, destination);
	
	}
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/recharge");
		
		captureScreenshot(driver, "paytm payment");
	
	}

   }

 