package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growwchild {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://groww.in/");
		 
		 driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"login_email1\"]")).sendKeys("abc@gmail.com");
		 
		 driver.findElement(By.xpath("//*[text()='Continue']")).click();
		 
		 Thread.sleep(2000);
		 
	     driver.findElement(By.xpath("//*[@id=\"login_password1\"]")).sendKeys("biadbv88329");
	
		 driver.findElement(By.xpath("//*[text()='Submit']")).click();
		 
		 driver.findElement(By.xpath("//*[@class=\"rodal-close\"]")).click();
		 
	}
	

}
