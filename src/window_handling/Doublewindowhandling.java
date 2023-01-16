package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doublewindowhandling {
	
	public static void main(String[] args) {
		

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/signup");
		 
		 String parentid = driver.getWindowHandle();
		 
		 System.out.println(parentid);
		 
		 driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		 
		 Set<String> allwindowids = driver.getWindowHandles();
		 
		 for(String wind:allwindowids)
		 {
			 System.out.println(wind);
		 }
		 
		 
		 
		
		
		
		
		
	}
	

}
