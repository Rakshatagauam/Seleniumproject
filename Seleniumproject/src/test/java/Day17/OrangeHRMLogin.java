package Day17;
/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser */




import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		// WebDriverManager.chromedriver().setup(); //its build in already in selenium
		// ChromeDriver driver= new ChromeDriver();
		//1) Launch browser
		ChromeDriver driver= new ChromeDriver();
		
		// 2) open url
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	 driver.manage().window().maximize(); // for screen bigger
		Thread.sleep(5000);
		// WebElement txtUsername= driver.findElement(By.name("username"));
		//txtUsername.sendKeys("Admin");
		
		// 3) Provide username  - Admin
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//4) Provide password  - admin123
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	//5) Click on Login button
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	Thread.sleep(5000);
	
	  // 6) Verify the title of dashboard page 
	        /* String act_tittle= driver.getTitle();
	         String exp_tittle= "OrangeHRM";
	         
	         if(act_tittle.equals(exp_tittle))
	         {
	        	 System.out.println("Test passed");
	         }
	         else
	         {
	        	 System.out.println("Failed");
	         } */
	         
	         //Label validation after successful login
	String act_label = "";
	try {
	    act_label= driver.findElement(By.xpath("//*[@id=\'app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	}
	catch(NoSuchElementException e) 
	{
		// act_label= "";
	}
	   String exp_label= "Dashboard";
	   
	   if(act_label.equals(exp_label))
	   {
		   System.out.println("Test passed");
	   }
	   else
		   System.out.println("Failed");
	   
	   // 7) close browser */
	        //  driver.close();
	       //  driver.quit();  //trying invalid password
	         }
		
	 
	

}
