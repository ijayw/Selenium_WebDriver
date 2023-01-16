package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//WAP to perform search operation over google search page by enter action key
public class Search_google {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 WebElement scroll = driver.findElement(By.xpath("//*[@name=\"q\"]"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.click(scroll)
		.sendKeys("selenium")
		.sendKeys(Keys.ENTER)
		.build()
		.perform();

	}

}
