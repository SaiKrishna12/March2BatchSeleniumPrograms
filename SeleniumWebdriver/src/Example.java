import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class Example {

	
	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		FirefoxProfile fp=new FirefoxProfile();
		fp.setEnableNativeEvents(true);
		FirefoxDriver driver=new FirefoxDriver(fp);
		
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.switchTo().frame(0);
		WebElement event=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		Actions action=new Actions(driver);
		int x=event.getLocation().y;
		action.moveToElement(event).dragAndDropBy(event,10,x).build().perform();
		System.out.println("abc");
		
	
	}

}
