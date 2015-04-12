package day8;


import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://en.wikipedia.org/wiki/Rajinikanth");
		String str=driver.getPageSource();
		if(str.contains("Rajnikanth"))
		{
			System.out.println("element exists");
		}
		else
		{
			System.out.println("element doesnot exit");
		}

	}

}
