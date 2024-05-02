package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//Searh logo
		// WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		// System.out.println("Display status of logo: " +logo.isDisplayed());
		      // or
		//  boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		  //  System.out.println(status);
		
		/*WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	    System.out.println("Search box display: " +searchbox.isDisplayed());
		System.out.println(searchbox.isEnabled()); */
		
		WebElement male_rd =driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before selection
		System.out.println("Before selection");
		System.out.println(male_rd.isSelected());  //false
		System.out.println(female_rd.isSelected()); //false
		
	/*	//After selection male_rd button
		System.out.println("After selection male rd button");
		male_rd.click();
		System.out.println(male_rd.isSelected());   //true
		System.out.println(female_rd.isSelected());  //false
		
		//After selecion of female_rd
		System.out.println("After selection female_rd");
		female_rd.click();
		System.out.println(male_rd.isSelected());  //false
		System.out.println(female_rd.isSelected()); //true */
		
		
	}

}
