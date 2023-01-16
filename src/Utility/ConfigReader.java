package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static void  main(String[] args) {
		
	  Properties prop = new Properties();
   try { 
	  FileInputStream fis = new FileInputStream("./config.properties");
	
		prop.load(fis);
	} catch (IOException e) {
		System.out.println("Exception arrived while reading config");
	}

      String value = prop.getProperty("browser");
	  
	  System.out.println(value);

  
	}
	
}
