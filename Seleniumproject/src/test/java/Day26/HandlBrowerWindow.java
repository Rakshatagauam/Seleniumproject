package Day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlBrowerWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		   


		   //capture id for browser window
		  Set<String>  WindowIds =driver.getWindowHandles(); //store 2window id
		//Approach1 - using List collection
		  
		  /* List <String>windowidslist= new ArrayList(WindowIds); //convert set string id
		  
		  String parentwindowID =windowidslist.get(0);
		       String childwindow= windowidslist.get(1);
		       
		       //switch to child window
		       driver.switchTo().window(childwindow);
		       driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
		       
		  //switch to parent window
		      driver.switchTo().window(parentwindowID);
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		     */
		    
		    //Approch 2
		   /* for(String winid:WindowIds)
		    {
		    String title =driver.switchTo().window(winid).getTitle();
		    	
		    	if(title.equals("OrangeHRM HR Software | OrangeHRM"));
		    	{
		    		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
		    	}
		    } */
		    
		    //closing specific browser window
		  /*  for(String winid:WindowIds)
		    {
		    String title =driver.switchTo().window(winid).getTitle();
		    	
		    	if(title.equals("OrangeHRM HR Software | OrangeHRM"));
		    	{
		    		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
		    	}
		    } */
		
		 // 1-x  2-y  3-z  4-a  5-b...........
			
			/*for(String winid:windowIDs)
			{
				String title=driver.switchTo().window(winid).getTitle();
				
				if( title.equals("x") || title.equals("y") || title.equals("z"))
				{
					driver.close();
				}
		}*/
		
			
		for(String winid:WindowIds)
			{
				String title=driver.switchTo().window(winid).getTitle();
				
				if( title.equals("OrangeHRM HR Software | OrangeHRM"))
				{
					driver.close();
				}
			}
		    
	}
	

}
