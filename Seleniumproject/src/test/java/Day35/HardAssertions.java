package Day35;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		// int x= 10;
		// int y=16;
		
		/* if(x==y)
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("test failed");
		
	} */
		// Assert.assertEquals(x, y);
		
//	Assert.assertTrue(true); //pass
	// Assert.assertTrue(false);
		
		int a=10;
		int b=20;
		// Assert.assertEquals(actual, expected, description)
		//Assert.assertEquals(a>b, true, "a is not greater then b");
		
		String s1= "abc";
		String s2= "abc1";
		//Assert.assertEquals(s1,s2,"string are not equals"); //pass
		
		// Assert.assertNotEquals(s1, s2);// fail
		
	}
}
