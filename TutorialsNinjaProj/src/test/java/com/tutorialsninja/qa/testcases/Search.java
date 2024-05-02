package com.tutorialsninja.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialsninja.qa.base.Base;

public class Search extends Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		 driver =initialisedbrowserandopenapplication("edge");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifysearchwithvalidproduct()
	{
		driver.findElement(By.name("search")).sendKeys("Hp");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed(),"valid product hp is not dispayed");
		)
	}
	
	@Test(priority=2)
	public void verifysearchwithInvalidproduct()
	{
		driver.findElement(By.name("search")).sendKeys("Honda");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		String actualsearchmessage= driver.findElement(By.xpath("//h2[normalize-space()='Products meeting the search criteria']")).getText();
		Assert.assertEquals(actualsearchmessage, "There is no product that matches the search criteria","No product in search");
			
		
	}
	
	@Test(priority=3)
	public void verifysearchwithoutanyproduct()
	
	{
		driver.findElement(By.name("search")).sendKeys("");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		String actualsearchmessage= driver.findElement(By.xpath("//h2[normalize-space()='Products meeting the search criteria']")).getText();
		Assert.assertEquals(actualsearchmessage, "There is no product that matches the search criteria.","No product in search");
			
	}
	
	

}
