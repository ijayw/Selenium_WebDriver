package assign_selenium;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// Find a xpath which locates the price for all mobile phone over amazon page.
public class Keyboard_Action {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 WebElement searchfield = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	 
	Actions act = new Actions(driver);
	act.click(searchfield).sendKeys("mobile phones").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	
	List<WebElement> mobile_price = driver.findElements(By.xpath("//*[@class=\"a-price-whole\"]"));
	
	
	
}
	
	
}
