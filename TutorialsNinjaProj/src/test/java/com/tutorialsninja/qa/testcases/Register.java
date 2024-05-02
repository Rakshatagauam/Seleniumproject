package com.tutorialsninja.qa.testcases;



import java.sql.Date;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialsninja.qa.base.Base;



public class Register extends Base {

       WebDriver driver;	
       
       @BeforeMethod
       public void setup()
       {
    	 
    	  driver= initialisedbrowserandopenapplication("firefox");
    		driver.findElement(By.xpath("//a[@title='My Account']")).click();
    		driver.findElement(By.linkText("Register")).click();
       }
       
    @AfterMethod
	public  void teardown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void veriftyregisteraccountwithmandatoryfield()
	{
	
   driver.findElement(By.id("input-firstname")).sendKeys("John");
	driver.findElement(By.id("input-lastname")).sendKeys("Matari");
	driver.findElement(By.id("input-email")).sendKeys("rakshata08@gmail.com");
	driver.findElement(By.id("input-telephone")).sendKeys("9053396545");
	driver.findElement(By.id("input-password")).sendKeys("Jwc1234");
	driver.findElement(By.id("input-confirm")).sendKeys("Jwc1234");
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
	String actualsuceessheading = driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText();
	Assert.assertEquals(actualsuceessheading, "Your Account Has Been Created!");
	
	//driver.quit();
	}
	
	@Test(priority=2)
	public void verifyregisteryaccountbyprovidingallfield()
	{
		 
	   driver.findElement(By.id("input-firstname")).sendKeys("John");
		driver.findElement(By.id("input-lastname")).sendKeys("matri2");
		driver.findElement(By.id("input-email")).sendKeys("rakshata10@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("90543396545");
		driver.findElement(By.id("input-password")).sendKeys("Jwc1234");
		driver.findElement(By.id("input-confirm")).sendKeys("Jwc1234");
		driver.findElement(By.name("newsletter")).click();
		
		//driver.quit();
	}
	
	@Test(priority=3)
	public void verifyregisteringaccountbyenteringexistingemailid()
	{
		
	   driver.findElement(By.id("input-firstname")).sendKeys("John");
		driver.findElement(By.id("input-lastname")).sendKeys("matri2");
		driver.findElement(By.id("input-email")).sendKeys("rakshata06@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("90543396545");
		driver.findElement(By.id("input-password")).sendKeys("Jwc1234");
		driver.findElement(By.id("input-confirm")).sendKeys("Jwc1234");
		driver.findElement(By.name("newsletter")).click();
		
		//driver.quit();
	}

	@Test(priority=4)
public void verifyresgisteringaccountwithexistingemailaddress()
	{
		
	   driver.findElement(By.id("input-firstname")).sendKeys("John");
		driver.findElement(By.id("input-lastname")).sendKeys("matri2");
		driver.findElement(By.id("input-email")).sendKeys("rakshata06@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("90543396545");
		driver.findElement(By.id("input-password")).sendKeys("Jwc1234");
		driver.findElement(By.id("input-confirm")).sendKeys("Jwc1234");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String actualwarning= driver.findElement(By.xpath("//input[@id='input-email']")).getText();
		Assert.assertTrue(actualwarning.contains("Warning: E-Mail Address is already registered!"),"warning message regarding duplicate email address not displayed");
		
		//driver.quit();
	}
		@Test(priority=5)
		public void verifyregisteringaccountwithoutfilinganydetails()
		{
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.xpath("//a[@title='My Account']")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
			
			String actualprivacypolicy= driver.findElement(By.xpath("//div[@class='pull-right']")).getText();
			 Assert.assertTrue(actualprivacypolicy.contains("Warning: You must agree to the Privacy Policy\",\"privacy warning message is not displayed"));
			 
			 String actualfirstnamewarning= driver.findElement(By.xpath("//input[@id='input-firstname']\"")).getText();
			 Assert.assertEquals(actualfirstnamewarning, "First Name must be between 1 and 32 characters!","Firstname warning message is not displayed");
			 
			 String actuallastnamewarning= driver.findElement(By.xpath("//input[@id='input-lastname']\"")).getText();
			 Assert.assertEquals(actuallastnamewarning, "last Name must be between 1 and 32 characters!","lastname warning message is not displayed");
			 
			 String actualemailwarning= driver.findElement(By.xpath("//input[@id='input-email']")).getText();
			 Assert.assertEquals(actualemailwarning, "E-Mail Address does not appear to be valid!","E-Mail Address does appear to be valid!");
			 
			 String Actualphonewarning= driver.findElement(By.xpath("//input[@id='input-telephone']")).getText();
			 Assert.assertEquals(Actualphonewarning, "Telephone must be between 3 and 32 characters!", "moblie message not displayed");

			 
		}
	}

