package actionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utility.ScreenShot;

public class MOuseact {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 
		 WebElement submenu = driver.findElement(By.xpath("//*[@id=\"sub-menu\"]"));
		 
		 Actions act =  new Actions (driver);
		 
		 act.moveToElement(submenu).perform();
		 
		WebElement bing = driver.findElement(By.xpath("//*[@id=\"link3\"]"));
		 
		bing.click();
		
		ScreenShot.captureScreenshot(driver, "chercher tech");
	}

   }
