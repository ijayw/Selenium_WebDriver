package actionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utility.ScreenShot;

public class Droppable2 {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://jqueryui.com/droppable/");
	 
	 WebElement iframe = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
	 
    //  to switch to iframe
	 driver.switchTo().frame(iframe);
	 
	 WebElement draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	 
	 WebElement droppable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	 
	 Actions act = new Actions(driver);
	 
	 act.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
	 
	 ScreenShot.captureScreenshot(driver, "Droppable2");
	
}
}
