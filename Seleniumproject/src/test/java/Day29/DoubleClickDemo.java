package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver= new ChromeDriver();
       
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
       driver.manage().window().maximize();
       
       driver.switchTo().frame("iframeResult"); //switch to frame
     WebElement f1 =driver.findElement(By.xpath("//input[@id='field1']"));
     f1.clear();
     f1.sendKeys("welcome");
     
    WebElement button =driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
    Actions act= new Actions(driver);
    
    act.doubleClick(button).perform();
    
    //validation
    WebElement f2 = driver.findElement(By.xpath("//input[@id='field2']"));
    // String copiedid =f2.getText();
    
     String copiedid= f2.getAttribute("value");
    System.out.println("copieid:  "+copiedid);
	}

}
