package basic_commond;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class ClickByJavascript {
	
	public static void main(String[] args) {
	
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");

			WebElement cart = driver.findElement(By.xpath("//*[@class='_3SkBxJ']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", cart);
	}
	

}
