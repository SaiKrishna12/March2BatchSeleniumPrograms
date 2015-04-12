package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ImplicitWait1 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.24hourfitness.com/not-yet-member.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.DAYS);
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[2]/a")).click();

	}

}
