package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDrop {

	
	
		public FirefoxDriver driver=null;
		@BeforeMethod
		public void setUp()
		{
			driver=new FirefoxDriver();
			driver.get("https://jqueryui.com/droppable/");
		}
		
		@Test
		public void dragandDropTest()
		{
			driver.switchTo().frame(0);
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement target=driver.findElement(By.id("droppable"));
			Actions action=new Actions(driver);
			action.dragAndDrop(source, target).build().perform();
			
		}

	}


