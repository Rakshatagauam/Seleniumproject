package Da1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//locators and constructor  webelemen & actions
	By username =By.name("username");
	By password=By.name("password");
	By login= By.xpath("//button[@type= 'submit']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//method
	public void OrangeUsername()
	{
		driver.findElement(username).sendKeys("Admin");
	}
	
	public void OrangePassword()
	{
		driver.findElement(password).sendKeys("admin123");
	}
	
	public void OrangeButton()
	{
		driver.findElement(login).click();
	}

}
