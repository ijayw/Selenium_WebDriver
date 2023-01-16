package assign_selenium;

import java.awt.Window;
import java.util.List;

import javax.print.attribute.standard.NumberOfDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// not ok 
public class Himachal_Trans2 {
	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");	
		
		driver.findElement(By.xpath("//*[@name=\"fromPlaceName\"]")).sendKeys("rushikesh");
		
		Thread.sleep(2000);

		 List<WebElement> start = driver.findElements(By.xpath("//*[@class=\"ui-corner-all\"]"));
	
		 int numofstart = start.size();
		 
		 System.out.println("number of start ="+ numofstart);
		 
		for(WebElement starts:start)
		{
			String startlist = starts.getText();
			System.out.println(startlist);
			
			if(startlist.equals("manali"))
			{
				starts.click();
				driver.switchTo().alert().accept();
			}
	    }
          


	}

}
