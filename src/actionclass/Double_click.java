package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 
		 WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		
		 Actions act = new Actions(driver);
		 
////		 to perform double click
//		 
//		 act.doubleClick(doubleclick).perform();
//		
//		to perform right click
		 act.contextClick(doubleclick).perform();
		
		
	}

}
