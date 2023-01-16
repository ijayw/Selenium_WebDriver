package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class types_of_Locator02 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    driver.findElement(By.name("oxd-text oxd-text--p orangehrm-login-forgot-header"));
	    
		
		
		
		
		
		driver.close();
		
		
	}

}
