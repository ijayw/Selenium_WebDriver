package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
// not ok
public class changetext {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.findElement(By.xpath("//*[@id='populate-text']")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(12))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);


		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='site']"),"//*[text()='Selenium Webdriver']"));

		driver.findElement(By.xpath("//*[@id='alert']")).click();
        
	}
	
	
}
