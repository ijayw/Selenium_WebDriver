package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	          WebDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			 
			 driver.findElement(By.xpath("//*[@name=\"confirmation\"]")).click();
			 
			 String confirmation = driver.switchTo().alert().getText();
			 
			 System.out.println(confirmation);
			 
			 Thread.sleep(2000);
			 
			 driver.switchTo().alert().dismiss();

		
	}

  }
