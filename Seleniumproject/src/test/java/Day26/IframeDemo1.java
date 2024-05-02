package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ChromeDriver driver=new ChromeDriver();
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("//iframe[@id='mce_0_ifr']");
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("welcome to automaion");
	}

}
