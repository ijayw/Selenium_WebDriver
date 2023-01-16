package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	
	public static void main(String[] args) {
		
	          WebDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			 
			 driver.findElement(By.xpath("//*[@value=\"Alert\"]")).click();
			 
			 String alert = driver.switchTo().alert().getText();
			 
			 System.out.println(alert);
			 
			 driver.switchTo().alert().accept();

		
		
	}

}
