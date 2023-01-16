package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Explict {
// Assignment: Click on any of the carousel image on flipkart page:

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");	
        	
		WebElement Furniture = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div[1]/div[1]/div/a/div/img[2]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(Furniture));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", Furniture);
		
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")).click();
		

	}

}
