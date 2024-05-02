package Day22;
/*
get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles() */

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      ChromeDriver driver= new ChromeDriver();
      
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      
      System.out.println("Tittle of the page :" +driver.getTitle());
      
      System.out.println("Current URL : " +driver.getCurrentUrl());
      
     System.out.println("Page source detail.......... ");
      String ps=driver.getPageSource();
     System.out.println(ps.contains("html"));
      
   // System.out.println(driver.getWindowHandle()); //48CBBF13BAB0556E2722BF30FA9FFEB4
      //D0C1B246F3E7B175415773CFF7710B1E
     
     Thread.sleep(3000);
    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
     Set<String> windowid= driver.getWindowHandles();
     
     for(String wind:windowid)
     {
    	 System.out.println(wind);
     }
	} 

}
   //351247FFE4D760AEDA53DFA3DDD8607F
  //ECFC36F4E7E8C843ED9D3E7C6E4C24DB