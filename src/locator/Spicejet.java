package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet {

	public static void main(String[] args)throws InterruptedException {
	    WebDriver driver  = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@fill='#EDB16A']")).click();
		WebElement from= driver.findElement(By.xpath("(//*[@autocapitalize='sentences'])[1]"));
		from.sendKeys("PNQ");
		Thread.sleep(2000);
		WebElement to= driver.findElement(By.xpath("(//*[@autocapitalize='sentences'])[2]"));
		to.sendKeys("VTZ");
		

	}

}
