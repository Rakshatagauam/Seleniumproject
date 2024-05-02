package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   ChromeDriver driver= new ChromeDriver();
   
   driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
   driver.manage().window().maximize();
   
   Thread.sleep(3000);
   
   driver.findElement(By.linkText("org.openqa.selenium")).click(); //frame 1
   driver.findElement(By.linkText("WebDriver")).click();
   driver.findElement(By.xpath("//a[normalize-space()='Overview']")).click();
   
	}

}
