package day28.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartingPage {
	
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement signin;
	public void findAFlight(String u,String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		signin.click();
	}
	

}
