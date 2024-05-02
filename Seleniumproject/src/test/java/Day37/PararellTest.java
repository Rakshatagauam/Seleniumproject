package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PararellTest {

	
	ChromeDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	
	{
		if(br.equals("chrome"));
		{
		 driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			
			driver=new FirefoxDriver();
		}
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 driver.manage().window().maximize();
	}
	
	@Test(priority= 1)
	void testlogo()
	{
		try 
		{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	void testhomepagetittle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","tittles are nott matched");
	}
	
	@AfterClass
	void closeapp()
	{
		
	}
}
