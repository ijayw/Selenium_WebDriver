package assign_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
//	2.	WAP to print all the elements from the dropdown of facebook page
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/signup");
		List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"day\"]//*"));
		for(WebElement day:days)
		{
			String daylist = day.getText();
			System.out.println(daylist);
		}
		
		Thread.sleep(1000);
		List<WebElement> months = driver.findElements(By.xpath("//*[@id=\"month\"]//*"));
		for(WebElement month:months)
		{
			String monthlist = month.getText();
			System.out.println(monthlist);
		}
		
		Thread.sleep(1000);
		List<WebElement> years = driver.findElements(By.xpath("//*[@id=\"year\"]//*"));
		for(WebElement year:years)
		{
			String yearlist = year.getText();
			System.out.println(yearlist);
		}

	    }

        }
