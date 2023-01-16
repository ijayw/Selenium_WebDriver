package window_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utility.ConfigReader;
import Utility.ScreenShot;
import basic_commond.ClickByJavascript;

public class AmazonAddToCart {
	
public static void main(String[] args)throws InterruptedException, IOException {

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.amazon.in/");

	WebElement hover = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(hover).perform();
	
	driver.findElement(By.xpath("//*[@class='nav-action-inner']")).click();
	
//	Properties prop = new Properties();
//	  
//	  FileInputStream fis = new FileInputStream("./config.properties");
//	  prop.load(fis);
//
//	  String value = prop.getProperty("browser");
//	  
//	  System.out.println(value);
	
	driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("8983895808");
	
	driver.findElement(By.xpath("//*[@id='continue']")).click();
	
	driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("8983895808");
	
	driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile phone");
	
	driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
	act.scrollByAmount(0, 200).perform();

    driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
    
    Set<String> allwin = driver.getWindowHandles();
    
    int numberofwindow = allwin.size();
    
    String [] id = new String [numberofwindow];
    
    int i =0;
    
    for(String winid:allwin)
    {
    	id[i]=winid;
    	i++;
    }
    
    driver.switchTo().window(id[1]);
    
    act.scrollByAmount(0, 500).perform();
   
    driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
   
    ScreenShot.captureScreenshot(driver, "AmazonAddToCart");

}
}
