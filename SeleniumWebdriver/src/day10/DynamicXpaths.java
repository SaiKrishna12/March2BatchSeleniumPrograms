package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DynamicXpaths {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://yahoo.com");
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_142657')]/div/ol/li[6]/a")).click();

	}

}
