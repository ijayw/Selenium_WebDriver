package assign_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_fill {
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/signup");
		 WebElement fill = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		
		 Actions act = new Actions(driver);
		 act.click(fill)
		 .sendKeys("elon")
		 .sendKeys(Keys.TAB)
		 .sendKeys("musk")
		 .sendKeys(Keys.TAB)
		 .sendKeys("elon.musk@gmail.com")
		 .sendKeys(Keys.TAB)
		 .sendKeys("elon@123")
		 .build()
		 .perform();
		
	}

}
