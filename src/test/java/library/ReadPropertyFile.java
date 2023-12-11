package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class ReadPropertyFile {
	
	@Test
	public  static Properties readProp() {
         Properties prop = new Properties();
		
		FileInputStream fileinput = null;
		
		try {
			fileinput = new FileInputStream("F:\\Orangee_POM\\configuration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return prop;
	}
	
	
	public static String getBrowser() {
	return 	ReadPropertyFile.readProp().getProperty("browser");
	}
	
	public static String getUrl() {
		return  ReadPropertyFile.readProp().getProperty("url");
	}
	
	public static String getUsername() {
	 return	ReadPropertyFile.readProp().getProperty("username");
	}
	
	public static String getPassword() {
	 return	ReadPropertyFile.readProp().getProperty("password");
	}
	
	
	
	
		
	

}
