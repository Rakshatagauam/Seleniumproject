package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
	
	ChromeDriver driver;
	
	void setup()
	{
		driver= new ChromeDriver();
	}
	
	@Test(dataProvider= "dp")
	void testlogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();

		Assert.assertEquals(exp_title, act_title);
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	@DataProvider(name= "dp")
	String [][] loginData()
	{
		String data[][]= {  
				{ "abc@gmail.com", "test123" }, 
				{ "pavanol@gmail.com", "test@123" },
				{ "cooln@gmail.com", "Test123" },
				{ "pavanoltraining@gmail.com", "test@123" },
				{ "cooln@gmail.com", "Test123" } 
	};
		return data;

}
}