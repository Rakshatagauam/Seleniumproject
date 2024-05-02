package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver= new ChromeDriver();
     
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     
     Thread.sleep(5000);
     driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
     
     
        driver.close();
     
    // driver.quit(); 
	}

}
