package ScreenshotDemo;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JS alert
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick= 'jsAlert()']")).click();
		Alert aler1= driver.switchTo().alert();
		aler1.getText();
		aler1.accept();
		
		
		//js confirm
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick= 'jsConfirm()']")).click();
		Alert aler2= driver.switchTo().alert();
		aler2.getText();
		aler2.dismiss();
		if(driver.getPageSource().contains("You clicked: Cancel"));
		System.out.println("You clicked: Cancel");
		System.out.println("===============");
		
		//promp
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick= 'jsPrompt()']")).click();
		Alert aler3= driver.switchTo().alert();
		aler3.getText();
		aler3.sendKeys("automation step by step");
		aler3.accept();
		if(driver.getPageSource().contains("You entered: automation step by step"));
		System.out.println("You entered: automation step by step");
		System.out.println("===============");
		driver.quit();
	}
	

}
