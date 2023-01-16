package assign_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arrow_Down {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 WebElement scroll = driver.findElement(By.xpath("//*[@name=\"q\"]"));
	
		Actions act = new Actions(driver);
		 act.click(scroll)
		.sendKeys("selenium")
		.sendKeys(Keys.ARROW_DOWN)
		.build()
		.perform();
		
	}

    }
