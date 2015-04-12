package day11;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("This is for testing the login fuctionality");
	}
	
	@Test(priority=2)
	public void regTest()
	{
		System.out.println("registration functionality");
	}
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("Logout");
	}
	@BeforeMethod
	public void fun1()
	{
		System.out.println("abc");
	}
	
	

}
