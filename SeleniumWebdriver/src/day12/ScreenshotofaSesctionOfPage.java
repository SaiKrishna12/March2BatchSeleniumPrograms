package day12;


import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotofaSesctionOfPage {
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		 driver=new FirefoxDriver();
		driver.get("http://bbc.com");
	}
	@Test
	public void screenshotTest() throws IOException
	{
		
		WebElement element=driver.findElement(By.xpath("//*[@id='most_popular_tabs_media']/ul"));
		
		WrapsDriver wrapsDriver = (WrapsDriver) element;
	    File screenshot = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);
	    Rectangle rectangle = new Rectangle(element.getSize().width, element.getSize().height);
	    Point location = element.getLocation();
	    BufferedImage bufferedImage = ImageIO.read(screenshot);
	    BufferedImage destImage = bufferedImage.getSubimage(location.x, location.y, rectangle.width, rectangle.height);
	    ImageIO.write(destImage, "png", screenshot);
	    File file = new File("C:\\Users\\sai\\Desktop\\screen1.png");
	    FileUtils.copyFile(screenshot, file);
	}

}
