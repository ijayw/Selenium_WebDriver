package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	
	 public static void main(String[] args) {
//		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\ijayw\\Downloads\\Compressed\\geckodriver.exe");
		 
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/signup");
		 WebElement fill = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
// 4.0.0
//		
	}

}
