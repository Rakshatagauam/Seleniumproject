package com.tutorialsninja.qa.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	WebDriver driver;
	
	
	public void loadpropertiesfiles()
	{
		Properties pop= new Properties();
		File PropFile = new File(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\tutorialsninja\\qa\\config\\config.properties");
		try {
		FileInputStream fis= new FileInputStream(PropFile);
		pop.load(fis);
		}catch(Throwable e)
		{
			e.printStackTrace();
		}
		
	}

	public WebDriver initialisedbrowserandopenapplication(String browsername)
	{
	   		if(browsername.equals("chrome"))
	   			
	   		{
	   			driver= new ChromeDriver();
	   		}
	   		
	   		else if(browsername.equals("firefox"))
	   		{
	   			driver= new FirefoxDriver();
	   		}
	   		
	   		else if(browsername.equals("edge"))
	   		{
	   			driver= new EdgeDriver();
	   		}
	    	   
	    	   driver= new ChromeDriver();
	    		driver.manage().window().maximize();
	    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	    		driver.get("https://tutorialsninja.com/demo/");
	    		
	    		return driver;
	}
}
	

