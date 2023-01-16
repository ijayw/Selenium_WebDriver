package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap01 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://paytm.com/recharge");
		 WebElement operator = driver.findElement(By.xpath("//*[@class=\"_1exI\"]//*[@type=\"text\"]"));
		 operator.click();
		 
	   WebElement airtel = driver.findElement(By.xpath("//*[@class=\"_3xI1\"]//ul//li//span[text()='Airtel']"));
		airtel.click();
		
	  driver.findElement(By.xpath("//*[@class=\"_3xI1\"]//span[text()='Maharashtra']")).click();
		
	}
   
    }
