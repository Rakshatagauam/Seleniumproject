package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialsninja.qa.base.Base;

public class Login extends Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		
	             driver = initialisedbrowserandopenapplication("chrome");
			driver.findElement(By.xpath("//a[@title='My Account']")).click();
			driver.findElement(By.linkText("Login")).click();
	}
	
	@AfterMethod
	public void teardown()
	{ 
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void loginwithvalidcrendential()
	{
		
		driver.findElement(By.id("input-email")).sendKeys("cooln0601@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Jwcgautam6");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information abc")).isDisplayed());
		
		
	}

	@Test(priority=2)
	public void verifywithinvalidcredentials()
	{
		
		driver.findElement(By.id("input-email")).sendKeys("neha22@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123ggyy566");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		
	}
	
	@Test(priority=3)
	public void verifylogwithinvalidemailvaildpassword()
	
	{
		
		driver.findElement(By.id("input-email")).sendKeys("neha223@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Jwcgautam6");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
	}

	@Test(priority=4)
	public void verifylogwithvalidemailInvaildpassword()
	
	{
		
		driver.findElement(By.id("input-email")).sendKeys("cooln0601@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Jwcgautam6ggyy");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
	}
	
	@Test(priority=5)
	public void verifylogwithoutprovidingcredentials()
	
	{
		
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
	}
}
