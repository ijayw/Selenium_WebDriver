package mock;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/life-insurance/term-insurance/");
		
		WebElement male = driver.findElement(By.xpath("//*[@for=\"male\"]"));
		
		String radio = male.getText();
		
		System.out.println("radio button1:"+radio);
		
		
        WebElement female = driver.findElement(By.xpath("//*[@for=\"female\"]"));
		
		String radio1 = female.getText();
		
		System.out.println("radio button2:"+radio1);
		
		driver.close();
		

		
	}

}
