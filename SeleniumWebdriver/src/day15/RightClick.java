package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {
	public FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	
	@Test
	public void rightClickTest()
	{
		WebElement event=driver.findElement(By.linkText("Gmail"));
		Actions action=new Actions(driver);
		action.contextClick(event).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
