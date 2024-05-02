package Da1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("starting TestNG");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("start test executions");
	}
	@BeforeClass
	public void beforeclas()
	{
		System.out.println("initilzng selenium"); 
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("open");
	}
	
	@Test
	public void test1()
	{
		System.out.println("inside test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("inside test 2");
	}
	@AfterMethod
	public void beforafter()
	{
		System.out.println("close");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("destroy selenium"); 
	}
	
	@AfterTest()
	public void Aftertest()
	{
		System.out.println("stop test executions");
	}
	
	@AfterSuite()
	public void Aftersuite()
	{
		System.out.println("stop TestNG");
	}
}
