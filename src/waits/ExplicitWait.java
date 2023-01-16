package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
//		Enable Button after 10 seconds
		
		driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
		
//		Button to hit
		
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id=\"disable\"]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
//		Again click or hit on  Enable Button
		
		driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
		
		
		
	}
	
	

}
