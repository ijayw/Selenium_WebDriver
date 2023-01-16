package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mock_Parallel_Bro {
	
	WebDriver driver;
	@Test
	public void navToAmazonUrl()
	{
		
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement bestseller = driver.findElement(By.xpath("(//*[text()='Best Sellers'])[1]"));

		bestseller.click();

	}

	@Test
	public void navToGoogle()
	{
//		
		WebElement mostgift = driver.findElement(By.xpath("(//*[text()='Most Gifted'])[1]"));

		mostgift.click();
	}

	@Test
	public void navToFacebook()
	{
	}

}
