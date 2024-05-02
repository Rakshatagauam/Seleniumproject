package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownWithSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver= new ChromeDriver();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
       driver.manage().window().maximize();
       
     WebElement drpcountryElem = driver.findElement(By.xpath("//select[@id='country-list']"));
     
     Select drpcountry= new Select(drpcountryElem);
     
     //1) selecting an option from dropdown
     // drpcountry.selectByVisibleText("USA");
    // drpcountry.selectByValue("4");
    // drpcountry.selectByIndex(3);
     
     //2) Find total option in dropdown
     List<WebElement> options = drpcountry.getOptions();
     System.out.println("total no of options: " +options.size());
     
     //3) print option in console window
      for(int i=0;i<options.size();i++)
      {
    	  System.out.println(options.get(i).getText());
      }
     
     
     
   
       
       
	}

}
