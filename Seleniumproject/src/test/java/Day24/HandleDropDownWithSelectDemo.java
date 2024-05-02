package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownWithSelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
      driver.manage().window().maximize();
      
      driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
      
      //Clicking on options 
    List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
     
     //total no of options
     System.out.println("total no of options: " +options.size());
     
     for(int i=0;i<options.size();i++)
     {
    	 System.out.println(options.get(i).getText());
     }
     
    		 
     }
     
     
     
	
	

}
