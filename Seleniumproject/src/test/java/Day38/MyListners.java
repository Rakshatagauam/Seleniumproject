package Day38;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener   
{
	public void onTestStart(ITestResult result) {
	    
		System.out.println("on Test started.....");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test success.....");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test failure.....");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test skipped.....");
	  }
	
	public void onFinished(ITestContext context) {
		System.out.println("on Test finished.....");
	  }
}
