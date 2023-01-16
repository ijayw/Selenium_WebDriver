package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class changText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.mywebsite.com/");

		// Create the wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 

		// Wait for the text to change 
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("myText"), "Changed Text"));
	}

}
