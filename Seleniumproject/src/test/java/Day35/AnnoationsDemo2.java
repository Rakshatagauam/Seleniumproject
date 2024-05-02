package Day35;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class AnnoationsDemo2 {
  
	@BeforeClass
	void login()
	{
		System.out.println("Login....");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search....");
	}
	
	
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("Advance search.....");
	}
	
    @AfterClass
	
	void logout()
	{
		System.out.println("Logout....");
	}
	
	
}
