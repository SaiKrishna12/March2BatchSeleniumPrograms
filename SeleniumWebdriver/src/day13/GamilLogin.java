package day13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GamilLogin {

	
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("E:\\March2Batch\\SeleniumWebdriver\\myFile.properties");
		Properties prop=new Properties();
		prop.load(f);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id(prop.getProperty("username"))).sendKeys("saikrishna123");
		driver.findElement(By.id(prop.getProperty("password"))).sendKeys("Krishna123");
		driver.findElement(By.id(prop.getProperty("signin"))).click();
		
		
		
		
		
		
		

	}

}
