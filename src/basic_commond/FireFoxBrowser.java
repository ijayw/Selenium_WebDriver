package basic_commond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

public static void main(String[] args) {
	
	 // Set the path to the FirefoxDriver executable
    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

    // Create a new instance of FirefoxDriver
    WebDriver driver = new FirefoxDriver();

    // Navigate to a website
    driver.get("https://www.example.com");

    // Close the driver
    driver.quit();
  }

}


