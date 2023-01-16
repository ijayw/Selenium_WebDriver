package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {
	public static void main(String[] args) throws InterruptedException {
//		WAP to perform ctrl + click operation to open the link in a new tab


		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
	     driver.get("https://zapier.com/");
	     
		 Actions act = new Actions(driver);
	
		 WebElement newtab = driver.findElement(By.xpath("//*[text()='Get started free']"));
		
		 act.keyDown(Keys.CONTROL).sendKeys(newtab).keyUp(Keys.CONTROL).build().perform();
		 
		 
		 WebElement contactsale = driver.findElement(By.xpath("(//*[@class='css-1xw4vr-UniversalDynamicTopbarLink__linkInner'])[1]"));
			
		 act.keyDown(Keys.CONTROL).sendKeys(newtab).keyUp(Keys.CONTROL).build().perform();
		 
		 WebElement Community = driver.findElement(By.xpath("//*[text()='Zapier Community']"));
			
		 act.keyDown(Keys.CONTROL).sendKeys(newtab).keyUp(Keys.CONTROL).build().perform();
		 


	 }

}
