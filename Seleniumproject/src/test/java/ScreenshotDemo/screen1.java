package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Date currentdate= new Date();
		//System.out.println(currentdate);
		String sreenshot =currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(sreenshot);

		 ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/"+sreenshot+".png"));
		
	
		
		
		
	}

}
