package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doublewindowhandling2 {
	
	public static void main(String[] args) {
		

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/signup");
		 
		 String parentid = driver.getWindowHandle();
		 
		 System.out.println(parentid);
		 
		 driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		 
		 Set<String> allwindowids = driver.getWindowHandles();
		 
		 for(String child:allwindowids)
		 {
			 if(!child.equals(parentid))
			 {
				driver.switchTo().window(child);
			 }
			System.out.println(child);	 
		 }
		 
	    driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("text to search");
		 
		 driver.switchTo().window(parentid);
		 
		 driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("elon musk");
		 
		 for(String child:allwindowids)
		 {
			 if(!child.equals(parentid))
			 {
				driver.switchTo().window(child);
			 }
			System.out.println(child);	 
		 }
	
	  }

   }
