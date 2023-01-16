package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazonlogin2 extends Amazonlogin {
	
	
	
	
		@Test
	public void searchproduct()
	{
           driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']")).click();
           
           driver.findElement(By.xpath(" //*[@id='ap_email']")).sendKeys("abc@hotmail.com");
           
          WebElement continuebutton = driver.findElement(By.xpath("//*[@id='continue']"));
          
          continuebutton.click();
          
          driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("kajk556ak");
          
//          driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();

       
	}
	
}
