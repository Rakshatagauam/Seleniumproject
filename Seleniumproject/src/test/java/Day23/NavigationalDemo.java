package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
   ChromeDriver driver= new ChromeDriver();
     
  
     driver.navigate().to("https://www.amazon.in/");
     System.out.println(driver.getCurrentUrl());
     
     driver.navigate().to("https://www.flipkart.com/");
     System.out.println(driver.getCurrentUrl());
     
     driver.navigate().back();
     System.out.println(driver.getCurrentUrl());
     
     driver.navigate().forward();
     System.out.println(driver.getCurrentUrl());
     
     driver.navigate().refresh();
     System.out.println(driver.getCurrentUrl());
	}

}
