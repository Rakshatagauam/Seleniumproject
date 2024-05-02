package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver= new ChromeDriver();
	
	//open app
	driver.get("http://www.automationpractice.pl/index.php");
	driver.manage().window().maximize();
	
	//Finding number of sliders on homepage
	List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
	System.out.println("No of sliders: " +sliders.size());
	
	//Finding total no. of image.
	List<WebElement> images = driver.findElements(By.tagName("img"));
	System.out.println("No of image: "+images.size());
	
	//Find total number of links
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println("No of links: "+links.size());
	
	driver.quit();
	
	
	
	}
	}
	


