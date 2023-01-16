package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuddyBoss_Testcase {
	WebDriver driver;
//	Performing Sanity Testing
	@BeforeSuite()
	public void LaunchBrowser()
	{	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.buddyboss.com/");	
	}
	@Test(priority = 3)
	public void BuyButton()
	{
		WebElement buy = driver.findElement(By.xpath("//*[text()='Buy Now ']"));
		buy.click();
		driver.navigate().back();	
	}
	@Test(priority = 1)
	public void Signin()
	{
		WebElement sign = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[3]/nav[1]/ul[1]/li[2]/a[1]"));
		sign.click();
		driver.navigate().back();
	}
	@Test(priority = 2)
	public void Pricing()
	{
		WebElement price = driver.findElement(By.xpath("//*[text()='Pricing']"));
		price.click();
		driver.navigate().back();
	}
	@AfterSuite
	public void afterSuite()
	{
		driver.close();
	}

}
