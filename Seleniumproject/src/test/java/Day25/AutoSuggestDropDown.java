package Day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
     ChromeDriver driver= new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.google.co.in/");
     
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
    
    Thread.sleep(3000);
    
    List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class, 'wM6W7d')]//span"));
   
    System.out.println("total list: " +list.size());
    
    for(int i=0;i<list.size();i++)
    {
    	System.out.println(list.get(i).getText());
    }
   
	}

}
