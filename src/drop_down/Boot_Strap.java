package drop_down;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import locator.Xpath_locator;

public class Boot_Strap {
	
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"_1exI\"]//*[@type='text']")).click();
		Thread.sleep(1000);
		WebElement airtel = driver.findElement(By.xpath("//*[@class=\"_3xI1\"]//span[text()='Airtel']"));
	    airtel.click();
	   
		
	}

}
