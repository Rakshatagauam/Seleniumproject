package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWithoutUsingSelect1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//select[@id='country-list']")).click();
		
		
 List<WebElement> droplists =driver.findElements(By.xpath("//select[@id=\"country-list\"]//option"));
 
      System.out.println("Total name o prin: "+droplists.size());
       
      for(int i=0;i<droplists.size();i++)
       {
    	   System.out.println(droplists.get(i).getText());
       } 
      
      for(int i=0;i<droplists.size();i++)
      {
     	 System.out.println(droplists.get(i).getText());
      }
      for(WebElement opt:droplists)
      {
     	 if(opt.getText().equals("France"))
     	 {
     		 opt.click();
     		 break;
     	 }
      }
        Thread.sleep(5000);
       
       driver.findElement(By.xpath("//select[@id='state-list']")).click();
       
       List<WebElement> drplist = driver.findElements(By.xpath("//select[@id='country-list']//option"));
       System.out.println(drplist.size());
       
       for(WebElement cn:drplist)
       {
    	   if(cn.getText().equals("Midi-Pyrenees"))
    	   {
    		   cn.click();
    		   break;
    	   }
       }
     
	}
	}

