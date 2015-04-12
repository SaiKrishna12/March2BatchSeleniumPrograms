package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CaptchaCode {
	FirefoxDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
	}
	@Test
	public void captchaTest()
	{
		String x=driver.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/fieldset/div/div[2]/span")).getText();
		System.out.println(x);
		String[] a=x.split(" ");
		int i=Integer.parseInt(a[0]);
		int j=Integer.parseInt(a[2]);
		int k=i+j;
		String y=Integer.toString(k);
		driver.findElement(By.xpath("//*[@id='edit-captcha-response']")).sendKeys(y);
	}
	
	
	
	
	
	
	
	
	
	

}
