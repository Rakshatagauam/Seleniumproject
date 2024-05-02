package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		driver.manage().window().maximize();
		System.out.println("After maximzing window: " +logo.getLocation()); //(405, 40)
		
		driver.manage().window().minimize();
		System.out.println("After minimise:"  +logo.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("After full screen:"  +logo.getLocation());
     
	}

}
