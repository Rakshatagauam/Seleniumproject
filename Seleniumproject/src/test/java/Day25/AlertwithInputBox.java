package Day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithInputBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		// ChromeDriver driver= new ChromeDriver();
       
       WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
       
      
       
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
       Alert alertwindow =driver.switchTo().alert();
            System.out.println(alertwindow.getText());
            alertwindow.sendKeys("welcome");
           // alertwindow.accept();
            alertwindow.dismiss();
            
           String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
           String exp_text= "You entered: welcome";
           
           if(act_text.equals(exp_text))
           {
        	   System.out.println("Test Passed");
           }
           else
           {
        	   System.out.println("Test Fail");
           }

	}

}
