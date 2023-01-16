package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
WebDriver driver;
	
	@Test
	public void validateText()
	{
	 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		firstname.sendKeys("text to be written");
		
		String actualtypedtext = firstname.getAttribute("value");
		
		System.out.println(actualtypedtext);
		
		boolean ispresent = actualtypedtext.contains("too");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ispresent, false);
			
		System.out.println("Test case got completed");
		
		sa.assertAll();

	}

   }
