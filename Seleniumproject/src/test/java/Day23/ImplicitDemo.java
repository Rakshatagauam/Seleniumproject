package Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver = new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
    
     
     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

}
