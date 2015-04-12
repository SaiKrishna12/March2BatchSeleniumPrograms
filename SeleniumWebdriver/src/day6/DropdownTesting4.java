package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting4 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://goair.in");
		WebElement ldrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> list1=ldrop.findElements(By.tagName("option"));
	    for(int i=0;i<list1.size();i++)
	    {
	    	String city=list1.get(i).getText();
	    	list1.get(i).click();
	    	
	    	Thread.sleep(1000);
	    	
	    	WebElement rdrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
	    	List<WebElement> list2=rdrop.findElements(By.tagName("option"));
	    	int j;
	    	for(j=0;j<list2.size();j++)
	    	{
	    		if(list2.get(j).getText().equals(city))
	    		{
	    			System.out.println(city+" is not working correctly");
	    			break;
	    		}
	    		
	    	}
	    	if(j==list2.size())
	    	{
	    		System.out.println(city+" is working correctly");
	    	}
	    	
	    	
	    	System.out.println("#########");
	    }
	
	
	
	
	
	
	
	
	
	
	
	}

}
