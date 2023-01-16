package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class I_frame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://jqueryui.com/slider/");
		 
		 WebElement iframe = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		
//		 to switch inside an iframe
		 
		 driver.switchTo().frame(iframe);
		 
		 WebElement sliderknob = driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		
		 Actions act = new Actions(driver);
		 
		 act.clickAndHold(sliderknob).moveByOffset(571, 0).release().build().perform();
		
	}
}
