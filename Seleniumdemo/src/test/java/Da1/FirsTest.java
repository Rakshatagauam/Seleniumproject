package Da1;

import org.testng.annotations.Test;

public class FirsTest {
  
	@Test(priority=1)
	void oprn()
	{
		System.out.println("testing 1");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("testing 2");
	}
	@Test(priority=3)
	void logou()
	{
		System.out.println("testing 3");
	}
}
