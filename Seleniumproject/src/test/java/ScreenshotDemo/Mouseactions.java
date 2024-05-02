package ScreenshotDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/* driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boA=driver.findElement(By.xpath("//li[@name= 'A']"));
		WebElement boD=driver.findElement(By.xpath("//li[text()= 'D']"));
		Actions actions= new Actions(driver);
		//actions.moveToElement(boA);
		//actions.clickAndHold();
	//	actions.moveToElement(boD);
		
		actions.contextClick(boD);
		actions.release().perform(); */
		
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement ele1=driver.findElement(By.xpath("//div[@id= 'draggable']"));
		WebElement ele2=driver.findElement(By.id("droppable"));
		Actions actions= new Actions(driver);
		actions.dragAndDrop(ele1, ele2);
		actions.release().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
