package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderBarAutomation {
	 public FirefoxDriver driver=null;
		@BeforeMethod
		public void setUp()
		{
			FirefoxProfile fp=new FirefoxProfile();
			fp.setEnableNativeEvents(true);
			driver=new FirefoxDriver(fp);
			driver.get("https://jqueryui.com/slider/#slider-vertical");
		}
		
		@Test
		public void dragandDropTest()
		{
			driver.switchTo().frame(0);
			WebElement element=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
			Actions action=new Actions(driver);
			int y=element.getLocation().y;
			action.moveToElement(element).dragAndDropBy(element, 50,y).build().perform();
		}
}
