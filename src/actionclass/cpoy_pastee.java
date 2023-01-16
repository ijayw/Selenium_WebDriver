package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cpoy_pastee {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/signup");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys(" your name");
		 
		 Actions act = new Actions(driver);
		 
//		 perform CTRL + a
		 
		  act.keyDown(Keys.CONTROL)
		 .sendKeys("a")
	     .sendKeys("c")
		 .keyUp(Keys.CONTROL)
		 .sendKeys(Keys.TAB)
		 .keyDown(Keys.CONTROL)
		 .sendKeys("v")
		 .keyUp(Keys.CONTROL)
		 .build()
		 .perform();

	}
}
