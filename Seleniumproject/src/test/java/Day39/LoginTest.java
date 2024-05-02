package Day39;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	public ChromeDriver driver;
	//Loginpage lp;
	Loginpage2 lp;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testlogo()
	{
		//lp= new Loginpage(driver);
		lp= new Loginpage2(driver);
		lp.CheckLogoPresence();
		Assert.assertEquals(lp.CheckLogoPresence(),true);
	}
	
	@Test(priority=2)
	void testlogin()
	{
		lp.SetUserName("Admin");
		lp.SetPassword("admin123");
		lp.Submitbuttn();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
