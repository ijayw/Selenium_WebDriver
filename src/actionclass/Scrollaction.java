package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollaction {
	
	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.in/");
		
		 Actions act = new Actions(driver);
		 
		 WebElement todaysdeals = driver.findElement(By.xpath("//*[@class=\"a-link-normal as-title-block-right see-more truncate-1line\"]"));

		 act.scrollToElement(todaysdeals).perform();
		
		
	}

}
