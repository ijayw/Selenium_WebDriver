package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock_MultiWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String parentwind = driver.getWindowHandle();
		
		System.out.println(parentwind);

		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
	
		Set<String> allwinid = driver.getWindowHandles();
		
		int numwind = allwinid.size();
		
		String [] id = new String[numwind];
		int i=0;
		for(String winid:allwinid)
		{
			id[i]=winid;
			i++;
		}
		driver.switchTo().window(id[2]);
		
		
	   driver.findElement(By.xpath("//*[text()='contact syncing']")).click();
	   
	 
//		driver.switchTo().window(id[3]);
		
//		driver.findElement(By.xpath("(//*[@class='ctaPrimary'])[1]")).click();
		
		
	}
	
}
