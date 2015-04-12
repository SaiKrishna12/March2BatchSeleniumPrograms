package day14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChainActions {
	static WebDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		// pr=new ProfilesIni();
		//FirefoxProfile fp=pr.getProfile("SeleniumUser");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();;
		driver.get("http://yssofindia.org");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void chainActionsTest()
	{
		WebElement event1=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img"));
		WebElement event2=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(event1).pause(5000).moveToElement(event2).pause(6000).build().perform();
	
	}
	

}
