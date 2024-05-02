package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTest {
	
	ChromeDriver driver;
	
	// @BeforeClass
	@Test(priority=10)
	void OpenApp()
	
	{
		driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=50)
	void login()
	{
		
		
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
		
	}
	
	//@AfterClass
	@Test(priority=100)
	void logout()
	{
		driver.quit();
	}

}
