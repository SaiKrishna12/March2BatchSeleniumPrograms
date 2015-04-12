package day28.pom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;

public class POMControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		StartingPage sp=new StartingPage();
		sp=PageFactory.initElements(driver,StartingPage.class);
		sp.findAFlight("admin","admin");
		
		

	}

}
