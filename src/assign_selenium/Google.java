 package assign_selenium;

import java.io.IOException;
import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ScreenShot;

public class Google {
//	Jaykumar waghmare
	public static void main(String[] args)throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//*[@name=\"q\"]"));
		search.sendKeys("inkpen");
		Thread.sleep(1000);
		WebElement select = driver.findElement(By.xpath("//*[@class=\"eIPGRd\"]//span[text()='inkpen'][1]"));
		select.click();
		Thread.sleep(1000);
		  WebElement validate = driver.findElement(By.xpath("//*[text()='Ink Pen - Amazon.in']"));
		  validate.click();
		  Thread.sleep(1000);
		  
		  String correct_page = driver.getTitle();
		  String ouput = "Amazon.in : Ink Pen";
	     if(correct_page.contains(ouput)) 
	     {
	    	 System.out.println("True,This Page is Correct");
	     }
	     else
	     {
	    	 System.out.println("false,This page not correct");
	     }
     ScreenShot.captureScreenshot(driver, "Inkpen correct page");

	  }

      }
