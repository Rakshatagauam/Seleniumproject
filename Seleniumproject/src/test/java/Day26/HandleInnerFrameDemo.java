package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ChromeDriver driver= new ChromeDriver();
		   
		   driver.get("https://ui.vision/demo/webtest/frames/");
		   driver.manage().window().maximize();
		   
		   
		   //Frame1
		 WebElement frm1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		   driver.switchTo().frame(frm1);
		   
		   driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111"); 
		   
		   driver.switchTo().defaultContent();
		   
		   WebElement frm2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		   driver.switchTo().frame(frm2);
		   
		   driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("221337");
		   
		   driver.switchTo().defaultContent();
		   
		   //frame3
		    WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		    driver.switchTo().frame(frm3);
		    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
		   
	}

}
