package ScreenshotDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		 WebElement dropdown=driver.findElement(By.id("option"));
		 Select selecobj= new Select(dropdown);
		/* selecobj.selectByIndex(1);
		 Thread.sleep(1000);
		 selecobj.selectByValue("option 2");
		 Thread.sleep(1000);
		 selecobj.selectByVisibleText("Option 3"); */
		 
		
		List<WebElement> allavaiableopion= selecobj.getOptions();
		
		for(WebElement opions: allavaiableopion)
		{
			System.out.println(opions.getText());
		}
		 Thread.sleep(2000);
		 driver.quit();
		 System.out.println("Done"); 
		
		
	}

}
