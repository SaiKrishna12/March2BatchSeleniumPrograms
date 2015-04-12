package day13;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows1 {
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
	}
	
	@Test
	public void mutilpleWindowTest()
	{
		driver.findElement(By.linkText("Help")).click();
		switchWindow("Privacy");
		switchWindow("http://support.microsoft.com/");
			
	}
	public void switchWindow(String linkname)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
		   driver.switchTo().window(it.next());
		   try
		   {
			   driver.findElement(By.linkText(linkname)).click();
			   break;
		   }
		   catch(Exception e)
		   {
			   
		   }
		}
		
	}

}
