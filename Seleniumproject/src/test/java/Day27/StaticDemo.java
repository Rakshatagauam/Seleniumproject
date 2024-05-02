package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     
     //1Find total no of row
     //Approch 1
     int row =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
     //System.out.println("No of rows: "+row);
     
     //Approch 2
   //  int row = driver.findElements(By.tagName("tr")).size(); //prefered if you have only 1single table
     System.out.println("No of rows: "+row); //8
     
     //2find total no of coloum
     int colum= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
      System.out.println("No of Colum: "+colum);
     
     //  int colum=driver.findElements(By.tagName("th")).size(); //dont prefer if you have multiple tables
      // System.out.println("No of Colum: "+colum); //4
     
   //3) Read specific row & column data
      
     // String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
    // System.out.println(value);
     
   /*   System.out.println( "BookName"+"   "+" Author"+"   "+"Subject"+"   "+"Price+");
     
     for(int r=2;r<=row;r++)
     {
    	 for(int c=1;c<=colum;c++)
    	 {
    		 String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    	     System.out.print(value+ "     ");
    	 }
    	 System.out.println();
     }  */
     
     // 4) Read data from all the rows & columns
     
      /* for(int r=2;r<=row;r++)
       {
    	  String author =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
    	  System.out.println(author);
    	  
    	  if(author.equals("Amit"))
    	  {
    		  String bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
    		  System.out.println(author+"   "+bookname);
    	  }
       } */
      
      for(int r=2;r<=row;r++)
      {
    	  String price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
    	  System.out.println(price);
      }
       
     
	}

}
