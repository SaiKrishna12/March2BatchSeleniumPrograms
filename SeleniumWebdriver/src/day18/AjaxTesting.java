package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxTesting {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("https://commonfloor.com/apartments-for-sale");
	}
	@Test
	public void ajaxTest()
	{
		driver.findElement(By.xpath("//*[@id='searchFilterWidget']/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='cityListfieldset']/div/div/div[1]")).click();
		WebElement block=driver.findElement(By.xpath("//*[@id='cityListfieldset']/div/div/div[2]/div"));
		List<WebElement> cities=block.findElements(By.tagName("div"));
		for(int i=0;i<cities.size();i++)
		{
			
			if(cities.get(i).getText().equals("Mumbai"))
			{
				System.out.println(cities.get(i).getText());
				cities.get(i).click();
				break;
				
			}
			
		}
		
		
		driver.findElement(By.xpath("//*[@id='searchFilterWidget']/span")).click();
		WebDriverWait mywait=new WebDriverWait(driver,10);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='srpnano']/div")));
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='srpnano']/div")));
		
		driver.findElement(By.xpath("//*[@id='projectSnippetWidget']/div[2]/div/div[2]/span/a")).click();
		
		
		
		
		
	}

}
