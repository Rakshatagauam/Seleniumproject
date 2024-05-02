package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver= new ChromeDriver();
	
	//open app
	driver.get("http://www.automationpractice.pl/index.php");
	driver.manage().window().maximize();
	
	//search box
	driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
	
	//search button
	driver.findElement(By.name("submit_search")).click();
	
	//link text & parial
	 // driver.findElement(By.linkText("Blouse")).click();
	 driver.findElement(By.partialLinkText("Blou")).click();
	 
	 
	 
	}
	}
	


