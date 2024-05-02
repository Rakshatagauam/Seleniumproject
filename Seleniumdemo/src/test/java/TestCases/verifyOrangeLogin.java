package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Da1.LoginPage;

public class verifyOrangeLogin {

	@Test
	public void verifylogin()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPage lp= new LoginPage(driver);
		lp.OrangeUsername();
		lp.OrangePassword();
		lp.OrangeButton();
		
		driver.quit();
	}
	
}
