package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PracticeReadProperty {
	@Test
	public static Properties readFile() {
		
		Properties prop =  new Properties();
		
		FileInputStream fi = null;
		try {
			 fi = new FileInputStream("F:\\Orangee_POM\\configuration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getBrowser() {
		return PracticeReadProperty.readFile().getProperty("browser");
	}
    public static String getUrl() {
    	return PracticeReadProperty.readFile().getProperty("url");
	}
    public static String getUsername() {
	    return  PracticeReadProperty.readFile().getProperty("username");
    }
    public static String getPassword() {
    	 return PracticeReadProperty.readFile().getProperty("password");
}

}
