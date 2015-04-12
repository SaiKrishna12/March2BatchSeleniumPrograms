package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableTesting4 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("https://sports.betway.com/");
	}
	@Test
	public void webtableTest()
	{
		WebElement table=driver.findElement(By.xpath("//*[@id='70609']/div"));
		int rows=table.findElements(By.tagName("tr")).size();
		for(int i=3;i<rows;i++)
		{
			String part1="//*[@id='70609']/div/div[2]/table/tbody/tr[";
			String part2="]/td[1]/a";
			try
			{
				String x=driver.findElement(By.xpath(part1+i+part2)).getText();
				System.out.println(x);
			}
			catch(Exception e)
			{
				
			}
		}
		
		
		
		
		
	}

}
