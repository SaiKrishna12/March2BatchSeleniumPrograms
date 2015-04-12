package OrangeHRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActions  extends Constants{
	
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	
	public void navigate() throws IOException
	{
		driver.get("http://localhost:8090/orangehrm");
		sc.takeScreenshot(driver,"Login");
	}
	public void enterUsername() throws IOException 
	{
		
		driver.findElement(By.id(pr.readProperties("username"))).sendKeys("Admin");
	}
	public void enterPassword() throws IOException
	{
		
		driver.findElement(By.id(pr.readProperties("password"))).sendKeys("Admin");
	}
	public void clickLogin() throws IOException 
	{
		
		driver.findElement(By.id(pr.readProperties("login"))).click();
	}

}
