package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
    
	ChromeDriver driver;
	
	
//constructor
	Loginpage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By logo_img_loc=By.xpath("//img[@alt='company-branding']");
	By txt_username_loc=By.name("username");
	By txt_password_loc=By.cssSelector("input[placeholder='Password']");
	By sub_butttn_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action methods
	
	public void SetUserName(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void SetPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	
	public void Submitbuttn()
	{
		driver.findElement(sub_butttn_loc).click();
	}
	
	public boolean CheckLogoPresence()
	{
		driver.findElement(logo_img_loc).isDisplayed();
		return status;
	}
  	
  	
}
