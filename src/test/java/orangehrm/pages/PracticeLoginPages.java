package orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import library.PracticeReadProperty;
import orangehrm.objects.PracticeLoginObject;

public class PracticeLoginPages {
	
	 static WebDriver driver;
	 @Test
	public void launch() {
		
		if (PracticeReadProperty.getBrowser().equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		driver.get(PracticeReadProperty.getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		PageFactory.initElements(driver, PracticeLoginObject.class);
		
		
		   PracticeLoginObject.username.sendKeys(PracticeReadProperty.getUsername());
		   PracticeLoginObject.password.sendKeys(PracticeReadProperty.getPassword());
		   PracticeLoginObject.login.click();

	}
	
	
}
