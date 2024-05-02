package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dasboad */

import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1) Launch browser
     ChromeDriver driver= new ChromeDriver();
     
     // 2) open url
     driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
     
     driver.manage().window().maximize();
     Thread.sleep(5000);
     
    // driver.findElement(By.name("Email")).
     //3) Provide username  - admin@yourstore.com
     WebElement txtemail= driver.findElement(By.name("Email"));
     txtemail.clear();
     txtemail.sendKeys("admin@yourstore.com");
     
     // 4) Provide password  - admin
     WebElement txtpassword= driver.findElement(By.name("Password"));
     txtpassword.clear();
     txtpassword.sendKeys("admin");
     
     //5) Click on Login button 
     driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
     
    //  6) Verify the title of dashboard page   
 //	Exp title : Dashboard / nopCommerce administration
     
    /* String act_tittle= driver.getTitle();
     
     String exp_tittle= "Dashboard / nopCommerce administration";
     
     
     if(act_tittle.equals(exp_tittle))
     {
    	 System.out.println("Test Passed");
     }
     else
     {
    	 System.out.println("Falied");
     } */
     String act_label= "";
     try
     {
      act_label= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
     }
     catch (Exception e )
     {
    	 
     }
     String exp_label= "Dashboard ";
     
     if(act_label.equals(exp_label))
     {
    	 System.out.println("Tes passed");
     }
     else 
     {
    	 System.out.println("Failed");
     }
	}

}
