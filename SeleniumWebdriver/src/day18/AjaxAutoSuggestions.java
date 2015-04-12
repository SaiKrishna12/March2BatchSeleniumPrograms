package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxAutoSuggestions {
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void ajaxTest()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium");
		WebElement block=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
		List<WebElement> links=block.findElements(By.xpath("//*[starts-with(@id,'sbse')]/div[2]"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		
	}

}
