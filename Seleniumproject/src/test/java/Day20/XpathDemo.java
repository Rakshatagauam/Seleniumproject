package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//relative path-- preferred
		// String productname= driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
		// System.out.println(productname);
		
		//absolue pah
		 String productname= driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
		   System.out.println(productname);
		 
	}

}
