package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertpopups {

public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	 driver.findElement(By.xpath("//*[@name=\"confirmation\"]")).click();
	 
	 Thread.sleep(2000);
	 
	String confirm = driver.switchTo().alert().getText();
	 
	 System.out.println(confirm);
	 
	 driver.switchTo().alert().dismiss();
	 
	 
	
}	
	

}
