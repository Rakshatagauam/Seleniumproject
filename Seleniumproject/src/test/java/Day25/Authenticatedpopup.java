package Day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authenticatedpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ChromeDriver driver= new ChromeDriver();
		// ChromeDriver driver= new ChromeDriver();
       
       WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
       
     //http://the-internet.herokuapp.com/basic_auth
   	//http://admin:admin@the-internet.herokuapp.com/basic_auth
       
       driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
       driver.manage().window().maximize();
        String text =driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();
        
        if(text.contains("Congratulations"))
        {
        	System.out.println("login pass");
        	
        }
        else
        {
        	System.out.println("login Fail");
        }
	}

}
