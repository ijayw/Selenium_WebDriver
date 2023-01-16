package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait02 {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
		 
		 driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
		 
		 driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	
//		 driver.close();
	}
	
	
}
