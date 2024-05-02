package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		 WebElement desktop =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		    WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
		    
		    Actions act= new Actions(driver);
		    
		    //move hover
		   // act.moveToElement(desktop).moveToElement(mac).click().build().perform(); //creating action then perform 
		    act.moveToElement(desktop).moveToElement(mac).click().perform(); //directly performing action
	}

}
