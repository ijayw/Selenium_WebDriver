package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Us_Web_Design {
	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		
		Thread.sleep(4000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='usa-checkbox__label']"));
		for(int i=1;i<=8;i++)
		{
			checkboxes.get(i).click();
		}
		
		
		
		
	}
	

}
