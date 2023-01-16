package popuphandling;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Himachal_Trans2print {
	
	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@name=\"toPlaceName\"]")).click();
		
		String alert = driver.switchTo().alert().getText();
		
		System.out.println(alert);
		
		driver.switchTo().alert().accept();
		 

		
	}

}
