package waits;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.navigate().to("https://www.google.com/");
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("india");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@aria-label=\"Page 3\"]")).click();
		
		driver.findElement(By.xpath("//*[text()='Central Bank of India']")).click();
		

		
	}

}
