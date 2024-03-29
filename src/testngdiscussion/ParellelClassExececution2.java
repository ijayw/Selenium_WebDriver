package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelClassExececution2 {
	static WebDriver driver;

	@Test(priority = 1)
	public void navToUrl()
	{

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

	}

	@Test(priority = 2)
	public void enterData()
	{
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		firstname.sendKeys("Velocity");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));

		lastname.sendKeys("Corporate");

//		contains()
		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));

		mobilenumber.sendKeys("99888776655");

//		indexing:

		WebElement gender = driver.findElement(By.xpath("(//input[@class='_8esa'])[3]"));

		gender.click();


//		text()

		WebElement textmessage = driver.findElement(By.xpath("//*[text()='Create a new account']"));

		String message = textmessage.getText();

		System.out.println(message);

	}
	

}
