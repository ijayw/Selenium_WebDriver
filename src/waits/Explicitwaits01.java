package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaits01 {
	
	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		 
//		 enable button 10 seconds 
		 
		 driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
		 
//	 button will be highlighted after 10 seconds
		 
		 WebElement button = driver.findElement(By.xpath("//*[@id=\"disable\"]"));
	
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(button));
	
		 driver.findElement(By.xpath("//*[@id=\"display-other-button\"]")).click();
		

		
	}

}
