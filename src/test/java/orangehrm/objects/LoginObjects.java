package orangehrm.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Ignore;
@Ignore
public class LoginObjects {
	
	@FindBy(name="username")
	public static WebElement username;
	
    @FindBy(name="password")
	public static  WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	public static WebElement login;

	public static WebElement username() {
		return username;
	}

	public static WebElement password() {
		return password;
	}

	public static WebElement login() {
		return login;
	}


}
