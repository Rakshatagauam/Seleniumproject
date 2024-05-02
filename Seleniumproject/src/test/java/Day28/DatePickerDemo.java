package Day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver= new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://jqueryui.com/datepicker/");
      
      driver.manage().window().maximize();
      
      driver.switchTo().frame(0);  //switch to frame
      
      //approch 1
     // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/01/2024"); //dd/mm/year
      
      
      //approch 2
      
      String year= "2025";
      String month= "march";
      String date= "23";
      
      driver.findElement(By.xpath("//input[@id='datepicker']")).click();
      
      while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  // Future date
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   //Past date
			
					
		}
	}

}
