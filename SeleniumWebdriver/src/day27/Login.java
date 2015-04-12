package day27;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	private static Logger log=Logger.getLogger(Login.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Firefox Browser Launched");
		driver.get("http://gmail.com");
		log.info("Navigate to url");
		driver.findElement(By.name("Email")).sendKeys("saikrishna123");
		log.info("Enterd the username");
		driver.findElement(By.id("Passwd")).sendKeys("krishna123");
		log.info("enterd the password");
		driver.findElement(By.id("signIn")).click();
		log.info("click on Signin");
	}

}
