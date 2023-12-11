package orangehrm.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import library.ReadPropertyFile;
import orangehrm.objects.LoginObjects;
@Ignore
@Test
public class BaseClass {
	
	public static WebDriver driver;
	@Test
	public static void initializingDriver() throws IOException {
		if (ReadPropertyFile.getBrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		    }
			driver.get(ReadPropertyFile.getUrl());
		
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		    PageFactory.initElements(driver, LoginObjects.class);
		    

			
			
	}
	
}
