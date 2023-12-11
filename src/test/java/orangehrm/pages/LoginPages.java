package orangehrm.pages;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import library.ReadPropertyFile;
import orangehrm.objects.LoginObjects;
@Ignore
public class LoginPages  {
	
	
	@Test
	public static void testCase() {
		
		LoginObjects.username().sendKeys(ReadPropertyFile.getUsername());
		
		LoginObjects.password().sendKeys(ReadPropertyFile.getPassword());
		
		LoginObjects.login().click();
		
		
	}

}
