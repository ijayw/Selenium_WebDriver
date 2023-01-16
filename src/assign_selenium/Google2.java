 package assign_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {
//	1.	WAP to print complete autosuggestion list from google search page
	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("inkpen");
	
		Thread.sleep(1000);
//		List<WebElement> autosuggestion = driver.findElements(By.xpath("//*[text()='selenium']"));
//		
//		for(WebElement suggestion:autosuggestion)
//		{
//			String list = suggestion.getText();
//			System.out.println(list);
//		}

	}

    }
