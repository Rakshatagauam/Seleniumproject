package Day35;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoationsDemo1 {
  
	@BeforeMethod
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
	void advance()
	{
		System.out.println("Advance search.....");
	}
	
    @AfterMethod
	void logout()
	{
		System.out.println("Logout....");
	}
	
	
}
