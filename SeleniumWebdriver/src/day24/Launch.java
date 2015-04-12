package day24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Launch {
	static FirefoxDriver driver=null;
	@BeforeClass
	public void launchApp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait
		                                (10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}
}



