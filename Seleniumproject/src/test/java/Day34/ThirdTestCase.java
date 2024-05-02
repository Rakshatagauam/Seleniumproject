package Day34;

import org.testng.annotations.Test;

public class ThirdTestCase {
	
	@Test(priority=1)
	void test1()
	
	{
		System.out.println("Testing1");
	}
	@Test(priority=2)
	void test2()
  
	{
		System.out.println("Testing2");
	}
	
	@Test(priority=3)
	void test3()
	
	{
		System.out.println("Testing3");
	}
}

