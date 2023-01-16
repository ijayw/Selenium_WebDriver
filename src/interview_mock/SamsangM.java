package interview_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SamsangM {
	
	WebDriver driver;

@Test
public void validateText()
{
    driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.amazon.in/");

	WebElement select = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

	select.sendKeys("mobile");
	select.click();

	String actualmob = select.getAttribute("value");

	System.out.println(actualmob);

	boolean mobile = actualmob.contains("Samsang");

	Assert.assertEquals(mobile, true);

	System.out.println("Test case got completed");
}

}
