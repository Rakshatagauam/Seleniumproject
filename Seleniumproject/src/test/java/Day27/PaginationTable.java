package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.opencart.com/admin/");
		 driver.manage().window().maximize();
		 
		   WebElement username =driver.findElement(By.id("input-username"));
		   username.clear();
		   username.sendKeys("demo");
		   
		   WebElement passwd = driver.findElement(By.id("input-password"));
		   passwd.clear();
		   passwd.sendKeys("demo");
		   
		   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		   
		   if(driver.findElement(By.xpath("//button[@id='button-admin']")).isDisplayed());
		   
		   {
			   driver.findElement(By.xpath("//button[@id='button-admin']")).click();
		   }
		   
		   driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		   driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		   
		  String text =driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		   
		   int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		   
		   System.out.println("Total number of pages:"+total_pages);
	}

}
