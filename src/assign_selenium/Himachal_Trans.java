package assign_selenium;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Himachal_Trans {
	
	public static void main(String[] args) throws InterruptedException {


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
			
			driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("shi");
			
			
			Thread.sleep(2000);
			
			
			List<WebElement> fromcities= driver.findElements(By.xpath("//*[@id='ui-id-1']//li//a"));
		
		
			for(WebElement city :fromcities)
			{
				String name = city.getText();
				
				System.out.println(name);
			}
	}

}
