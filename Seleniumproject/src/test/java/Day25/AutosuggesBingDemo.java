package Day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggesBingDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     
		ChromeDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.bing.com/");
	     
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("selenium");
	    
	    
	    
	     List<WebElement> list= driver.findElements(By.xpath("//li[conains(@class,'sa_sg')]//span"));
	     System.out.println(list.size());
		
	}

}
