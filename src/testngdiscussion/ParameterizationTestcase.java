package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTestcase {
	

	@Parameters("webbrowser1")
	@Test
	public void chromeTestCase(String browser)
	{

		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
		WebDriver driver = new ChromeDriver();

		}
		else
		{
			System.out.println("no match found");
		}

	}


	@Parameters("webbrowser2")
	@Test
	public void edgeTestCase(String browser)
	{
		System.out.println(browser);
		if(browser.equals("edge"))
		{
		WebDriver driver = new EdgeDriver();

		}
		else
		{
			System.out.println("no match found");
		}

	}

     
}
