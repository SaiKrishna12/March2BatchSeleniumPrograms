package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpaths2 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		List<WebElement> input=driver.findElements(By.xpath
				("//input[@type='text' or @type='password']"));
		System.out.println(input.size());
		String[] str={"one","two","three","four","five","six",
				                               "seven","eight"};
		for(int i=0;i<input.size();i++)
		{
			input.get(i).sendKeys(str[i]);
		}
			
		
		
	}

}
