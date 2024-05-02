package day33;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class FixedDepositCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String file= System.getProperty("user.dir")+"\\testdata\\caldata.xlsx;"
				
	}

}
