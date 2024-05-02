package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Loginpage2 {
    
	ChromeDriver driver;
	
	
//constructor
	Loginpage2(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//web elements Locators+identification
	@FindBy(xpath= "//img[@alt='company-branding']") 
	WebElement img_logo;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(css= "input[placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement submitbutton;
	
	
	//Action methods
	
	public void SetUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void SetPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void Submitbuttn()
	{
		submitbutton.click();
	}
	
	public boolean CheckLogoPresence()
	{
		img_logo.isDisplayed();
		return status;
	}
  	
  	
}
