package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlehekBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		// selec one specific checkbox
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// Total number of checkbox
  List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type = \"checkbox\"]"));
        System.out.println("total no of boxes: "+checkboxes.size());
        
        //select all checkboxes
    /*    for(int i=0;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        } */
        
        //selec last 2boxes
     // total Number of checkboxes-how many checkboxes to be selected= startign index
     		//7-3= 4 ( startign index)
      /*  for(int i= 4;i<checkboxes.size();i++)
        {
        	checkboxes.get(i).click();
        } */
        
        //select first 2boxes
       /* for(int i=0;i<2;i++)
        {
        	checkboxes.get(i).click();
        } */
        
        //uncheck 
      /*  for(int i=0;i<checkboxes.size();i++)
        {
        	if(i<2)
        	{
        	checkboxes.get(i).click();
        }
        } */
        
        //clear uncheck all boxes
        //Using normal for loop
        for(int i=0;i<3;i++)
        {
        	checkboxes.get(i).click();
        }
        Thread.sleep(4000);
        
        for(int i=0;i<checkboxes.size();i++)
        {
        	if(checkboxes.get(i).isSelected())
        	{
        	checkboxes.get(i).click();
        }
        }
        
	}

}
