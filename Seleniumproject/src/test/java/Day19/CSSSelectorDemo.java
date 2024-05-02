package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ChromeDriver driver= new ChromeDriver();
          
          driver.get("https://demo.nopcommerce.com/");
          driver.manage().window().maximize();
          
          //CSS using tag and id combination
         // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
          //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macphone");
          
          // CSS using tag & class
        //   driver.findElement(By.cssSelector("Input.search-box-text")).sendKeys("MacPhone");
	     // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
	
	  //tag & attribute
	     // driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
	      // driver.findElement(By.cssSelector("[name='q']")).sendKeys("MacBook");
	      
	     // driver.findElement(By.cssSelector("Input.search-box-text[name='q']")).sendKeys("Macbook");
	      driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Macbook");
	      
	      
	      
	}

}
