package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lic {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://licindia.in/");
//		 customer service
		 driver.findElement(By.xpath("//*[@id=\"form\"]/header/div[2]/div[1]/ul/li[5]/a"))
		 .click();

//		 bonus information
         WebElement bonus = driver.findElement(By.xpath("//*[@class=\"col_1\"]//*[text()='Bonus Information']"));
		 bonus.click();
	
	}
}
