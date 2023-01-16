package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover02 {
//	 hover https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
	public static void main(String[] args) throws InterruptedException {
		
         WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		 WebElement hover = driver
				 .findElement(By.xpath("//*[@class=\"dropdown\"]//*[@id=\"sub-menu\"]"));
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(hover).perform();

		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"link1\"]")).click();
 
	}

}
