package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleTestCaseOnDiffBrowser {
	@Parameters("webbrowser1")
	@Test
	public void TestCase(String browser)
	{
		
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
		   WebDriver driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			WebDriver driver = new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			WebDriver driver = new EdgeDriver();
		}
		else
		{
			System.out.println("no content available");
		}
		
	}
	
	}
	

