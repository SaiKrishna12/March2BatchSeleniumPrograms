package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames2 {
	static FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.svrtechnologies.com/contactus.html");
	}
	
	@Test
	public void framesTest()
	{
		driver.switchTo().frame(0);
		for(long i=0;i<123456789;i++)
		{
			
		  driver.findElement(By.id("Field223")).sendKeys("abc"+i);
		  driver.findElement(By.id("Field225")).sendKeys("1234567");
		  driver.findElement(By.id("Field9")).sendKeys("tester1@gmail.com");
		  //driver.findElement(By.id("saveForm")).click();
		  clearInputBox();
		}
		
	}
	public static void clearInputBox()
	{
		List<WebElement> input=driver.findElements(By.xpath("//input[@type='text' or @type='email']"));
		for(int i=0;i<input.size();i++)
		{
			input.get(i).clear();
		}
	}

}
