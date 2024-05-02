package Day26;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia_MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ChromeDriver driver= new ChromeDriver();
		   
		   driver.get("https://testautomationpractice.blogspot.com/");
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.manage().window().maximize();
		   
		   
		   //Frame1
		 driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		  List<WebElement> searchlinks = driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]//div/a"));
		  
		  System.out.println("Total no. of size: " +searchlinks.size());
		  System.out.println("printing & clicking links................");
			for(WebElement link:searchlinks)
			{
				System.out.println(link.getText());
				link.click();
			}
			
			Set<String> windowIds=driver.getWindowHandles();
			
			System.out.println("Switching to each browser window and getting the titles........"); 
			for(String winid:windowIds)
			{
				String title=driver.switchTo().window(winid).getTitle();
				System.out.println(title);
			}
			
			driver.quit();
			
		}
		  
		 }

}
