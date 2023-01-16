package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertpop {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.findElement(By.xpath("//*[@id='alert']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
	    String alertpopup = driver.switchTo().alert().getText();	
		
		System.out.println(alertpopup);
		
		driver.switchTo().alert().accept();
	}
	
	
}
