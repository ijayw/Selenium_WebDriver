package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locator {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.xpath(("//input[@name='firstname']")));
		firstname.sendKeys("sdfg");
		WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
		lastname.sendKeys("abc");
		WebElement mobile = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		mobile.sendKeys("advr");
		
		WebElement password = driver.findElement(By.xpath("//*[@autocomplete='new-password']"));
		password.sendKeys("anuj@007");
		
		WebElement day = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		day.click();
		day.sendKeys("20");
		day.click();
		WebElement month = driver.findElement(By.xpath("//*[@title='Month']"));
		month.click();
		month.sendKeys("Dec");
		month.click();
		WebElement year = driver.findElement(By.xpath("//*[@title='Year']"));
		year.click();
		year.sendKeys("1996");
		year.click();
		WebElement gender = driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
		gender.click();
		WebElement signup = driver.findElement(By.xpath("//*[@dir='ltr']"));
		signup.click();
		signup.click();
		
		
		
		
		

	}

}
