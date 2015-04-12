package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Xpaths1 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://news.google.com/");
		List<WebElement> links=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
	}

}
