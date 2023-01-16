package basic_commond;

import java.awt.Window;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navig_commond {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		
//		to maximize the browser
		driver.manage().window().maximize();

//     navigate to url
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		
//		 back button
		driver.navigate().back();

//     forward button
		driver.navigate().forward();
		
//		refresh button
		driver.navigate().refresh();
		
//		close the browser
		driver.close();
		
//		
		
		
		
	}

}
